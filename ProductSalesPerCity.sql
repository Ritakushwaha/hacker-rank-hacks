SELECT 
    CI.city_name ||' '||PR.product_name ||' '||ROUND(SUM(INV_I.line_total_price), 2) AS tot
FROM 
    city as CI, 
    customer as CU, 
    invoice as INV, 
    invoice_item as INV_I, 
    product as PR 
WHERE 
    CI.id = CU.city_id
    AND CU.id = INV.customer_id 
    AND INV.id = INV_I.invoice_id 
    AND INV_I.product_id = PR.id 
GROUP BY 
    CI.city_name, 
    PR.product_name 
ORDER BY 
    tot DESC, 
    CI.city_name, 
    PR.product_name ;
