package tests.UITests;

import org.testng.annotations.Test;
import UI.pages.ShoppingListPage;
import tests.UITests.RegistrationTestsVariant1.BaseTest;

public class ShoppingListUITests extends BaseTest {

    @Test(description = "Adding items to the shopping list")
    public void addItemToShoppingList() {
        ShoppingListPage
                .initShoppingListPage()
                .addItemToShoppingList()
                .closeListOfItems();
    }

    /**
     * this test has an attribute 'dependsOnMethods' because deleting of items is impossible without adding items before
     */
    @Test(description = "Deleting items from the shopping list", dependsOnMethods = {"addItemToShoppingList"})
    public void deleteItemFromShoppingList() {
        ShoppingListPage
                .initShoppingListPage()
                .deleteItemFromShoppingList();
    }

}