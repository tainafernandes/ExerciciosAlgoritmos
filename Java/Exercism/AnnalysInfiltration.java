package Exercism;

public class AnnalysInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {

        return !knightIsAwake;
        //retorna se o cabaleiro está acordado - True se ataque rápido pode ser feito senão FALSE
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

        return knightIsAwake || !archerIsAwake || prisonerIsAwake;
        //cavaleiro , arqueiro, prisioneiro ACORDADOS - retorna TRUE se puder ser espionado senão FALSE
        //Pode espionar se pelo menos 1 está acordado
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {

        return !archerIsAwake && prisonerIsAwake;
        //arqueiro e prisioneiro estão acordados - TRUE se prisioneiro puder ser sinalizado, senão FALSE
        //Prisioneiro sinalizado por meio de sons. Prisioneiro deve tá acordado e arqueiro dormindo == TRUE, senão FALSE
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

        return (!archerIsAwake && petDogIsPresent) || (!knightIsAwake && !archerIsAwake && prisonerIsAwake);

        //cavaleiro, arqueiro e prisioneiro acordados // cachorro presente?
        //arqueiro dormingo e menina com cachorro --> prisioneiro TRUE
        //NÃO cachorro  --> prisioneiro acordado, cavaleiro e arqueiro dormindo == TRUE, se prisioneiro estiver dormindo FALSE
    }


    public static void main(String[] args) {
        var response = canFastAttack(true);
        System.out.println(response);

        var response1 = canSpy(false, false, false);
        System.out.println(response1);

        var response2 = canSignalPrisoner(false, true);
        System.out.println(response2);

        var response3 = canFreePrisoner(false, true, false, false);
        System.out.println(response3);
    }
}
