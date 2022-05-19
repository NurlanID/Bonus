System.out.println("Лепёшка без веса - это подделка!");
        System.exit(0);
        } else if (weight <= weightAll) {
        System.out.println("Лепёшка имеет вес: " + weight + " гр/кг");
        }
        }
@Override
public String toString() {
        return "Цена: " + getPrice() + " $" +
        "\nКомпания: " + getProduceCompany() +
        "\nРадиус: " + radius + " см";
        }
        }
