package com.github.teamfossilsarcheology.fossil_compat.forge.compat;

import com.github.teamfossilsarcheology.fossil_compat.FoodType;
import com.github.teamfossilsarcheology.fossil_compat.FoodValueProvider;
import net.mcreator.cambiandoversion.init.ArgentinasDelightModItems;

public class ArgentinaDelightCompat {
    public static void bootstrap(FoodValueProvider provider) {
        var egg = provider.type(FoodType.EGG);
        var fish = provider.type(FoodType.FISH);
        var meat = provider.type(FoodType.MEAT);
        var plant = provider.type(FoodType.PLANT);
        //The mod author put every mod item in his/her native language
        meat.item(ArgentinasDelightModItems.NALGA.get()); //Beef rump
        meat.item(ArgentinasDelightModItems.PECHUGACRUDA.get()); //Chicken breasts
        meat.item(ArgentinasDelightModItems.TIRASDEASADO.get()); //Beef meat
        meat.item(ArgentinasDelightModItems.TIRASDECHANCHO.get()); //Pork meat
        meat.item(ArgentinasDelightModItems.POLLOLOCO.get()); //Breastless chicken
        meat.item(ArgentinasDelightModItems.ACHURASITEM.get()); //Intestines
        meat.item(ArgentinasDelightModItems.BROCHETASCRUDASITEM.get()); //Grilled skewer
        meat.item(ArgentinasDelightModItems.CHORIZOS_CRUDOSITEM.get()); //Raw chorizoes
        meat.item(ArgentinasDelightModItems.CORDEROCRUDO.get()); //Raw lamb
        meat.item(ArgentinasDelightModItems.PATADECHANCHOTOOL.get()); //Pork leg
        meat.item(ArgentinasDelightModItems.COSTILLASDECHANCHO.get()); //Pork ribs
        meat.item(ArgentinasDelightModItems.ALITASDEPOLLO.get()); //Chicken wing
        meat.item(ArgentinasDelightModItems.MUSLOSDEPOLLO.get()); //Chicken thigh
        meat.item(ArgentinasDelightModItems.PATADEPOLLO.get()); //Chicken leg
        meat.item(ArgentinasDelightModItems.PATAMUSLOITEM.get()); //Chicken quarter
        meat.item(ArgentinasDelightModItems.VACIO.get()); //Vacio
        meat.item(ArgentinasDelightModItems.CORTEMARDELPLATA.get()); //Mar de plata's cut
        meat.item(ArgentinasDelightModItems.COSTILLAR.get()); //Beef ribs
        meat.item(ArgentinasDelightModItems.COSTELETAITEM.get()); //Beef entrecote
        meat.item(ArgentinasDelightModItems.CHINCHULINESITEM.get()); //Grilled intestine
        meat.item(ArgentinasDelightModItems.CORDEROITEM.get()); //Roast lamb
        meat.item(ArgentinasDelightModItems.PESCADOASADOITEM.get()); //Grilled fish
        meat.item(ArgentinasDelightModItems.MILANESACRUDA.get()); //Raw breaded steak
        meat.item(ArgentinasDelightModItems.MILANESA.get()); //Breaded steak
        meat.item(ArgentinasDelightModItems.SANGUCHEDEMILANESA.get()); //Breaded steak sandwich
        meat.item(ArgentinasDelightModItems.CHORIZOITEM.get()); //Chorizo
        meat.item(ArgentinasDelightModItems.CHORIPAN.get()); //Choripan
        meat.item(ArgentinasDelightModItems.HAMBURGUESASOLA.get()); //Burger
        meat.item(ArgentinasDelightModItems.HAMBURGUESASANGUCHE.get()); //Hamburger
        meat.item(ArgentinasDelightModItems.PANCETAITEM.get()); //Bacon
        meat.item(ArgentinasDelightModItems.MEGADIBU.get()); //Megadibu
        meat.item(ArgentinasDelightModItems.MANDIBULABLOQUE.get()); //Large sandwich
        meat.item(ArgentinasDelightModItems.BROCHETAASADA.get()); //Grilled skewer(yes there are 2 grilled skewers)
        meat.item(ArgentinasDelightModItems.PAPAS_RUSTICAS.get()); //Grilled potato
        plant.item(ArgentinasDelightModItems.RODAJASDECALABAZASITEM.get()); //Pumpkin slice
        plant.item(ArgentinasDelightModItems.CALABAZITARELLENA.get()); //Stuffed pumpkin
        plant.item(ArgentinasDelightModItems.TOSTADITAS.get()); //Toast
        plant.item(ArgentinasDelightModItems.TOSTADACONDULCEDELECHE.get()); //Toast with caramel spread
        meat.item(ArgentinasDelightModItems.CARNEDECAIMAN.get()); //Alligator meat
        meat.item(ArgentinasDelightModItems.CAIMANALAPARRILLA.get()); //Grilled alligator
        plant.item(ArgentinasDelightModItems.HARINADETRIGO.get()); //Wheat flour
        plant.item(ArgentinasDelightModItems.LEVADURA.get()); //Yeast
        plant.item(ArgentinasDelightModItems.PANCASEROPORCION.get()); //Homemade bread
        plant.item(ArgentinasDelightModItems.PANCONCHICHARRONITEM.get()); //Homemade bread with chicharron
        plant.item(ArgentinasDelightModItems.BOLASDEFRAILE.get()); //Priest's bun
        plant.item(ArgentinasDelightModItems.ROSQUITA.get()); //Donut
        plant.item(ArgentinasDelightModItems.CHICHARRON.get()); //Chicharron
        plant.item(ArgentinasDelightModItems.PAPASFRITAS.get()); //Fries
        plant.item(ArgentinasDelightModItems.BATATA.get()); //Sweet potato
        plant.item(ArgentinasDelightModItems.BATATAALHORNO.get()); //Baked sweet potato
        plant.item(ArgentinasDelightModItems.BATATAFRITA.get()); //Fried sweet potato
        plant.item(ArgentinasDelightModItems.PUREBATATAITEM.get()); //Smashed sweet potatoes
        plant.item(ArgentinasDelightModItems.DULCEBATATABLOQUE.get()); //Sweet potato candy
        plant.item(ArgentinasDelightModItems.BATATASADAITEM.get()); //Grilled sweet potato
        plant.item(ArgentinasDelightModItems.MEMBRILLO.get()); //Quince
        plant.item(ArgentinasDelightModItems.MEMBRILLOBLOQUE.get()); //Quince candy
        plant.item(ArgentinasDelightModItems.POSTRE_VIGILANTEBATATA.get()); //Vigilant dessert
        plant.item(ArgentinasDelightModItems.TOMATITOS_CHERRY.get()); //Cherry tomatoes
        plant.item(ArgentinasDelightModItems.ESPINACAITEM.get()); //Spinach
        plant.item(ArgentinasDelightModItems.TORREJA.get()); //Torreja
        plant.item(ArgentinasDelightModItems.CHOCLO.get()); //Maize
        plant.item(ArgentinasDelightModItems.HARINAMAIZ.get()); //Cornmeal
        meat.item(ArgentinasDelightModItems.TUCO.get()); //Tuco
        meat.item(ArgentinasDelightModItems.POLENTAITEM.get()); //Polenta
        meat.item(ArgentinasDelightModItems.PANCONTUCO.get()); //Bread with tuco
        meat.item(ArgentinasDelightModItems.POLENTACONSALSAITEM.get()); //Polenta with sauce
        meat.item(ArgentinasDelightModItems.POLENTACONPAJARITO.get()); //Polenta with chicken
        //67/67 added
    }
}
