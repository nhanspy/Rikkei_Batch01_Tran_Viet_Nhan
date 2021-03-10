function Employee(name, date, sex, id, phoneNumber, mail, type, address){
    this.name = name;
    this.date = date;
    this.sex = sex;
    this.id = id;
    this.phoneNumber = phoneNumber;
    this.mail = mail;
    this.type = type;
    this.address = address;
}
// (Diamond, Platinium, Gold, Silver, Member).

var employees = new Array();
employees[0] = new Employee("Nhân", "14/07/1999", 1, 213123123, "0941371807", "nhan0095@gmail.com", "Member");

console.log(employees[0]);