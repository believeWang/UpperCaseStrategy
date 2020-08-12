# UpperCaseStrategy
Demo for spring boot ObjectMapper UpperCaseStrategy

All json key are Upper Case except collection.

[詳細介紹](https://gist.github.com/believeWang/b01a091cdb1ed4d2d9d23534b8270fd3)

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

