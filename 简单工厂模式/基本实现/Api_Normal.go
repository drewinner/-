package main

import (
	"fmt"
)
type Apier interface {
	test(name string) string
}

type hiAPI struct {}
func (*hiAPI) test(name string) string {
	return fmt.Sprintf("hi %s",name)
}

type helloAPI struct{}
func (*helloAPI) test(name string) string {
	return fmt.Sprintf("hello,%s",name)
}
func main(){
	hi := new(hiAPI)
	fmt.Println(hi.test("jack"))

	hello := new(helloAPI)
	fmt.Println(hello.test("tony"))
}
