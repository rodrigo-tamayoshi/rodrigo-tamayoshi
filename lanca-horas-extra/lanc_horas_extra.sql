DECLARE

    v_vlr_hora_func  number(5,2) := 0;    
    v_mes            number(2) := 9;
    v_ano            number(4) := 2020;
    v_vlr_hora_extra number(7,2) := 0;

    CURSOR cur_hora_extra is
    select func.numero_func
    ,      func.salario_base_func
    ,      lanc.quant_horas
    ,      tipo_lanc.num_fator
    ,      lanc.ano_ref_pgto
    ,      lanc.mes_ref_pgto             
    from   func,lanc,tipo_lanc    
    where  func.numero_func  = lanc.numero_func
    AND    lanc.id_tipo_lanc = tipo_lanc.id_tipo_lanc
    AND    lanc.ano_ref_pgto = v_ano
    AND    lanc.mes_ref_pgto = v_mes;   
       
BEGIN  
    DELETE pgto
    WHERE ano_ref_pgto = v_ano
    AND mes_ref_pgto = v_mes;    

    FOR c_hora in cur_hora_extra LOOP       
      
      v_vlr_hora_func := (c_hora.salario_base_func / 168);
      
      v_vlr_hora_extra := v_vlr_hora_func * c_hora.quant_horas * c_hora.num_fator;
      
      insert into pgto(ano_ref_pgto
                      ,mes_ref_pgto
                      ,numero_func
                      ,sal_base_pgto
                      ,total_desc_pgto
                      ,total_horas_pgto
                      ,valor_horas_extra
                      ,qtd_horas_extras)
               values (v_ano
                      ,v_mes
                      ,c_hora.numero_func
                      ,c_hora.salario_base_func
                      ,0
                      ,168
                      ,v_vlr_hora_extra
                      ,c_hora.quant_horas);
      
    END LOOP;  
    
    COMMIT;
END;
