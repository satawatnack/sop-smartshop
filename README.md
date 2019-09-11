# sop-smartshop
  ร้านขายเครื่องดื่มแอลกอฮอล์ 
 
### ดูเครื่องดื่มทั้หมด โดยการ GET
```
http://localhost:8080/drinks
```

### ซื้อเครืองดื่มโดยใส่ id เครื่องดื่มแล้วจะแสดงค่าออกมาเป็นราคา โดยการ GET
```
http://localhost:8080/buy/1.0
```

### ลงขายเครื่องดื่ม โดยการ POST ข้อมูลของเครื่องดื่มลงใน Body

ex.<br/>
{ <br/>
    "id": 7.0,
    "name": "Johnnie Walker - Black Label 12 Year Old",
    "price": 28.19,
    "detail": "The colour black has always been associated with style and elegance."
}

```
http://localhost:8080/addDrink
```
#### จัดทำโดย นายศตวรรษ ธิติศุภกุล 60070093
