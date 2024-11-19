class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def introduce(self):
        print(f"Hello, my name is {self.name} and I am {self.age} years old.")
        
person1 = Person("abc", 40)
print(person1.name)
person1.introduce()