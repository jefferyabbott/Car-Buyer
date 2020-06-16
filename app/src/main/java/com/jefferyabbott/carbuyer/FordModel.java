package com.jefferyabbott.carbuyer;

/**
 * Created by jeffmactech on 2/10/16.
 */
public class FordModel
{
    String modelName;
    String price;
    String horsepower;
    String imageName;

    public FordModel(String modelName)
    {
        this.modelName = modelName;

        switch (modelName)
        {
            case "Fiesta":
                price = "$14,090";
                horsepower = "123 hp";
                imageName = "fiesta";
                break;
            case "Focus":
                price = "$17,225";
                horsepower = "252 hp";
                imageName = "focus";
                break;
            case "Fusion":
                price = "$22,110";
                horsepower = "175 hp";
                imageName = "fusion";
                break;
            case "Mustang":
                price = "$24,145";
                horsepower = "526 hp";
                imageName = "mustang";
                break;
            case "C-Max":
                price = "$24,170";
                horsepower = "188 hp";
                imageName = "cmax";
                break;
            case "Taurus":
                price = "$27,110";
                horsepower = "288 hp";
                imageName = "taurus";
                break;
            case "Escape":
                price = "$23,100";
                horsepower = "240 hp";
                imageName = "escape";
                break;
            case "Edge":
                price = "$28,700";
                horsepower = "245 hp";
                imageName = "edge";
                break;
            case "Flex":
                price = "$29,600";
                horsepower = "280 hp";
                imageName = "flex";
                break;
            case "Explorer":
                price = "$31,050";
                horsepower = "280 hp";
                imageName = "explorer";
                break;
            case "Expedition":
                price = "$45,435";
                horsepower = "365 hp";
                imageName = "expedition";
                break;
            case "F-150":
                price = "$26,428";
                horsepower = "282 hp";
                imageName = "f150";
                break;
            default:
                modelName = "N/A";
                price = "N/A";
                horsepower = "N/A";
                imageName = "";
                break;
        }
    }

    public String getPrice() {
        return price;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public String getImageName() {
        return imageName;
    }
}
