# javaabstractclassicinorneklianaltim


Kodda, soyut sınıf (abstract class) olan person sınıfı tanımlanmış. Bu sınıfın içinde id ve address adında özel değişkenler (private variables) ve bunların okunup yazılabileceği getId(), setId(), getAddress() ve setAddress() adlı yöntemler (methods) tanımlanmıştır.

Ayrıca, abstract olan write() ve writeAddress() yöntemleri de tanımlanmıştır. Bu yöntemlerin içeriği alt sınıflar tarafından (employee ve student) belirlenecektir.

employee ve student sınıfları, person sınıfından türetilmiştir ve bu sınıfların özellikleri ve özel yöntemleri vardır. Örneğin, employee sınıfı workhour ve workprice adında iki özel değişkene sahiptir ve calculateSalary() yöntemi ile çalışanın maaşını hesaplar.

student sınıfı ise school ve term adında özel değişkenlere sahiptir ve writeInfo() yöntemi öğrencinin okul bilgilerini yazdırır.

Main sınıfı ise employee ve student sınıflarından nesneler oluşturarak bunların özelliklerini ve yöntemlerini kullanır.


yazdığım kodun pseucodu aşağıda yer alıyor

abstract class person:
    private variables:
        - id: string
        - address: string
    
    constructor(id, address):
        set id and address variables
    
    abstract method write():
        return id of the person
    
    abstract method writeAddress():
        return address of the person
    
    method getId():
        return id variable
    
    method setId(id):
        set id variable
    
    method getAddress():
        return address variable
    
    method setAddress(address):
        set address variable
    

class employee extends person:
    variables:
        - workhour: int
        - workprice: int
    
    constructor(workhour, workprice, id, address):
        call parent constructor with id and address
        set workhour and workprice variables
    
    method write():
        return id of the employee
    
    method writeAddress():
        return address of the employee
    
    method calculateSalary():
        return workhour * workprice


class student extends person:
    variables:
        - school: string
        - term: int
    
    constructor(school, term, id, address):
        call parent constructor with id and address
        set school and term variables
    
    method write():
        return id of the student
    
    method writeAddress():
        return address of the student
    
    method writeInfo():
        print school, term, id, and address variables
    

class Main:
    method main():
        create a student object with school, term, id, and address variables
        print student variables using print statements and writeInfo() method
        
        create an employee object with workhour, workprice, id, and address variables
        print employee variables using print statements and calculateSalary() method

