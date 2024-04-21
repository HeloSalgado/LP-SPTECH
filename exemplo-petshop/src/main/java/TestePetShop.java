public class TestePetShop {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Mel");
        Pet pet2 = new Pet("Garfield");
        PetShop petShop1 = new PetShop("AmigoPet", 50.8);
        PetShop petShop2 = new PetShop("Pet legal", 60.0);

        petShop1.darBanho(pet1);
        petShop2.darBanho(pet1, 0.20);
        petShop1.darBanho(pet2);

        System.out.println(pet1);
        System.out.println(pet2);

        System.out.println(petShop1);
        System.out.println(petShop2);
    }
}
