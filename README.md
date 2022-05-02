# Spring Boot GraphQL RSocket Demo

Demo Spring Boot GraphQL application which leverages RSocket. Intended to be used as a testing bed and proof of concept for exercising the [rsocket-js apollo graphql client example](https://github.com/rsocket/rsocket-js/blob/feature/apollo-graphql-support/packages/rsocket-examples/src/graphql/apollo/client/example.ts).

Run this application as you would any other Spring Boot application, and then start the [rsocket-js apollo graphql client example](https://github.com/rsocket/rsocket-js/blob/feature/apollo-graphql-support/packages/rsocket-examples/src/graphql/apollo/client/example.ts) from rsocket-js.

## RSC Examples

```sh
rsc --request --route=ping --debug ws://localhost:7000/rsocket
```

```sh
rsc --request --route=graphql --dataMimeType="application/graphql+json" --data='{"query":"{\n  greeting \n}"}' --debug ws://localhost:7000/rsocket
```
