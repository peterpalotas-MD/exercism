class Badge {
    public String print(Integer id, String name, String department) {

        if(department==null && id == null){
            return String.format("%s - OWNER", name);
        }
        else if(department== null){
            return String.format("[%d] - %s - %s", id, name, "OWNER");
        } else if (id== null) {
            return String.format("%s - %s", name, department.toUpperCase());
        }

        return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
    }
}
