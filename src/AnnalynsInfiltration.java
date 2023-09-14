class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake) {
            System.out.println("No se ha podido hacer el ataque");
            return false;
        } else {
            System.out.println("Se ha podido hacer el ataque");
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
            System.out.println("Se ha podido hacer el espionaje");
            return true;
        } else {
            System.out.println("No se ha podido hacer el espionaje");
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (prisonerIsAwake && !archerIsAwake) {
            System.out.println("Se ha podido señalar al prisionero");
            return true;
        } else {
            System.out.println("No se ha podido señalar al prisionero");
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            if (!archerIsAwake) {
                System.out.println("El prisionero ha sido liberado");
                return true;
            } else {
                System.out.println("El prisionero no ha sido liberado");
                return false;
            }
        } else {
            if (prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
                System.out.println("El prisionero ha sido liberado");
                return true;
            } else {
                System.out.println("El prisionero no ha sido liberado");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = true;

        canFastAttack(knightIsAwake);
        canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        canSignalPrisoner(archerIsAwake, prisonerIsAwake);
        canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
    }
}