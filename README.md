# UpperCaseStrategy
Demo for spring boot ObjectMapper UpperCaseStrategy

All json key are Upper Case except collection.

request:
```
{
  "DEMONAME": "robert",
  "subRequests": [
    {
      "SUBDEMONAME": "subRobert1"
    },
    {
      "SUBDEMONAME": "subRobert2"
    }
  ]
}
```
request log in console:
```
DemoRequest(demoName=robert, subRequests=[DemoSubRequest(subDemoName=subRobert1), DemoSubRequest(subDemoName=subRobert2)])
```

