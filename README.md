# templar

the code in this branch needs `sbt` to run
on MacOs `brew install sbt`
then in project root run `sbt`
at the sbt console, run `run`
it will download a lot of related jar dependencies
into the local `~/.ivy2/cache`
and eventually run the server
at `localhost:8080/render`

post a json to this endpoint
get the corresponding html back
eg via postman, POST to `localhost:8080/render`
```json
{
	"bindings":[
		{"title":"title1","description":"description1"},
		{"title":"title2","description":"description2"},
		{"title":"title3","description":"description3e"}
		]
}
```

get back
```html
<div class="flat-entity">
    <div class="kvbinding">
        <div class="title">title1</div>
        <div class="description">description1</div>
    </div>
    <div class="kvbinding">
        <div class="title">title2</div>
        <div class="description">description2</div>
    </div>
    <div class="kvbinding">
        <div class="title">title3</div>
        <div class="description">description3</div>
    </div>
</div>
```