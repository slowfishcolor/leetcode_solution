select Customers.Name as Customers
from Customers left join Orders
on Orders.CustomerId = Customers.Id
where Orders.CustomerId is null;


select Name as Customers
from Customers
where Id not in (select CustomerId from Orders);