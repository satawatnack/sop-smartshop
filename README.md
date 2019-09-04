# sop-smartshop
  ร้านขายเครื่องดื่มแอลกอฮอล์ 
 
### ดูเครื่องดื่มทั้หมด โดยการ GET
```
http://localhost:8080/drinks
```

### ซื้อเครืองดื่มโดยใส่ซื่อเครื่องดื่มแล้วจะแสดงค่าออกมาเป็นราคา โดยการ GET
```
http://localhost:8080/buy/Sheridans
```

### ลงขายเครื่องดื่ม โดยการ POST ข้อมูลของเครื่องดื่มลงใน Body

ex.<br/>
{ <br/>
	"name": "Nack Label",<br/>
	"price": 19,<br/>
	"detail": "The colour black has always been associated with style and elegance."<br/>
}

```
http://localhost:8080/addDrink
```
#### จัดทำโดย นายศตวรรษ ธิติศุภกุล 60070093
