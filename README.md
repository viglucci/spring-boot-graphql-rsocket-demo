# Spring Boot GraphQL RSocket Demo

## RSC Examples

```sh
rsc --request --route=ping --debug ws://localhost:7000/rsocket
```

```sh
rsc --request --route=graphql --dataMimeType="application/graphql+json" --data='{"query":"{\n  greeting \n}"}' --debug ws://localhost:7000/rsocket
```
