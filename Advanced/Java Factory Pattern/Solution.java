

switch (order.toLowerCase()) {
        case "pizza": 
            return new Pizza();
        case "cake":
            return new Cake();
        default: 
            return null;
    }

