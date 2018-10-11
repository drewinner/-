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

func Factory(condition int) Apier {

	if condition == 1 {
		return &hiAPI{}
	}else if condition == 2{
		return &helloAPI{}
	}
	return nil
}

func main(){
	a := Factory(1)
	fmt.Println(a.test("implA"))
}