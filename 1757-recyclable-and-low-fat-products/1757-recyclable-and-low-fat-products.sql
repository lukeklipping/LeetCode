# Write your MySQL query statement below

select p.product_id as product_id
from products p
where p.low_fats = 'Y' and p.recyclable = 'Y';