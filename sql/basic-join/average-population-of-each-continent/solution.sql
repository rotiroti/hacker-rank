SELECT Country.Continent AS continent, FLOOR(AVG(City.Population)) AS avg_population FROM Country
INNER JOIN City ON Country.Code = City.CountryCode
GROUP BY continent;
