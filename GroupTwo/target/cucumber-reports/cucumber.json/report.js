$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/moudo/eclipse-workspace/GroupTwo/Feature/Homepage.feature");
formatter.feature({
  "line": 2,
  "name": "user should be able search items and check out",
  "description": "",
  "id": "user-should-be-able-search-items-and-check-out",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Homepage"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "To successfully search items",
  "description": "",
  "id": "user-should-be-able-search-items-and-check-out;to-successfully-search-items",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "click on Dresses",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify list of items shown on the page and print price for all the items",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "select the second item from the list",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verify the total price",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "close the checkout window and logouts",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.click_on_Dresses()"
});
formatter.result({
  "duration": 1120455900,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest.verify_list_of_items_shown_on_the_page_and_print_price_for_all_the_items()"
});
formatter.result({
  "duration": 276990800,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest.select_the_second_item_from_the_list()"
});
formatter.result({
  "duration": 112258300,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest.click_on_add_to_cart()"
});
formatter.result({
  "duration": 1584775400,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest.verify_the_total_price()"
});
formatter.result({
  "duration": 100762400,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest.close_the_checkout_window_and_logouts()"
});
formatter.result({
  "duration": 4201034000,
  "status": "passed"
});
});