select w1.Id
from Weather as w1, Weather as w2
where w1.Temperature > w2.Temperature
and datediff(w1.Date,w2.Date)=1;