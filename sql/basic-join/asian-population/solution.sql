SELECT SUM(City.Population)
FROM City
INNER JOIN Country
ON City.CountryCode = Country.Code
WHERE Country.Continent = 'Asia';
