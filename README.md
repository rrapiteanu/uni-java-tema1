# uni-java-tema1

### REST API (Spring WebFlux + PostgreSQL)

SQL

```
create table medicament
(
   id serial primary key,
   denumire text,
   cantitate integer not null,
   constraint cantitate_constraint check (cantitate >= 0)
);
```
Create
![post](https://user-images.githubusercontent.com/18491327/144726163-30595cda-5b34-43b9-836d-3a26877ac0dd.png)
Get All
![all](https://user-images.githubusercontent.com/18491327/144726165-03ae6be7-e46e-4d42-9bc1-d6a49a27b03b.png)
Get by Id
![get-by-id](https://user-images.githubusercontent.com/18491327/144726166-7f06aa3b-0ef6-4634-a3b2-d09318a638bd.png)
Update
![put](https://user-images.githubusercontent.com/18491327/144726167-6e0ae497-0165-40ed-af0a-ce23892e43cb.png)
Delete
![delete](https://user-images.githubusercontent.com/18491327/144726168-0bafce44-48d0-4954-bef8-b9eedc3469d0.png)
Get All after Delete
![all-after-delete](https://user-images.githubusercontent.com/18491327/144726169-29533a56-380d-4d13-8e5a-eb0f7ba0c474.png)
