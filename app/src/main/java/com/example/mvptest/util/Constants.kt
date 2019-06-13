package com.example.mvptest.util

open class Constants {
    companion object {
       val BASE_URL = "http://www.mocky.io"
    }
}

/*/*
As per requirement we can customise more. this is just basic json format
{
        "results": [
        {
        "type": "header",
        "title": "Vegetable Pasta Recipes"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Vegetable-Pasta Oven Omelet",
        "url": "http://find.myrecipes.com/recipes/recipefinder.dyn?action=displayRecipe&recipe_id=520763",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat",
        "iconUrl": "http://img.recipepuppy.com/560556.jpg"
        },
        {
        "type": "headerWithIconAndText",
        "title": "Vegetable-Pasta",
        "url": "http://find.myrecipes.com/recipes/recipefinder.dyn?action=displayRecipe&recipe_id=520763",
        "iconUrl": "https://www.chriscruises.com/wp/wp-content/uploads/2017/04/IMG_8914-600x200_c.jpg"
        },
        {
        "type": "shortViewWithRightIcon",
        "title": "Roasted Pepper and Bacon Omelet",
        "url": "http://www.bigoven.com/43919-Roasted-Pepper-and-Bacon-Omelet-recipe.html",
        "iconUrl": "http://www.olgasflavorfactory.com/wp-content/uploads/2015/09/Vegetable-Pasta-Salad-1-11-100x100.jpg",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        },
        {
        "type": "banner",
        "title": "Broccoli and Cheese Omelet",
        "url": "http://www.bigoven.com/45151-Broccoli-and-Cheese-Omelet-recipe.html",
        "subTitle": "",
        "iconUrl": "https://www.chriscruises.com/wp/wp-content/uploads/2017/04/IMG_8914-600x200_c.jpg"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Broccoli Oven Omelet Recipe",
        "url": "http://cookeatshare.com/recipes/broccoli-oven-omelet-92851",
        "iconUrl": "https://i.pinimg.com/originals/17/a5/58/17a558831a2c9f1c8ad0b1f19f84de8d.jpg",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        },
        {
        "type": "shortViewWithRightIcon",
        "title": "Eggplant Omelet with Coriander and Caraway",
        "url": "http://www.epicurious.com/recipes/food/views/Eggplant-Omelet-with-Coriander-and-Caraway-306",
        "iconUrl": "https://www.sbs.com.au/food/sites/sbs.com.au.food/files/styles/thumb_small/public/broken-pasta-02.jpg?itok=64o9Oprt",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Eggplant Omelet with Coriander And Caraway",
        "url": "http://www.bigoven.com/143831-Eggplant-Omelet-with-Coriander-And-Caraway-recipe.html",
        "iconUrl": "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/vegetable-pasta-royalty-free-image-647750280-1552319876.jpg?crop=0.66635xw:1xh;center,top&resize=100:*",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        },
        {
        "type": "banner",
        "title": "Broccoli and Cheese Omelet",
        "url": "http://www.bigoven.com/45151-Broccoli-and-Cheese-Omelet-recipe.html",
        "subTitle": "onions, garlic, chicken broth, cottage cheese, oregano, black pepper, egg substitute, bread, mozzarella cheese, butter",
        "iconUrl": "http://www.westaustraliancorngrowers.com.au/wp-content/uploads/2017/11/header-banner-2230x431_MASTER_larger-canvas-corn3_F-600x200_c.jpg"
        },
        {
        "type": "shortTextWithTitle",
        "title": "Chard And Onion Omelet",
        "url": "http://www.bigoven.com/149383-Chard-And-Onion-Omelet-recipe.html",
        "subTitle": "olive oil, onions, leaves, garlic, eggs, parsley, basil, thyme, gruyere cheese, parmesan cheese"
        },
        {
        "type": "banner",
        "title": "Broccoli and Cheese Omelet",
        "url": "http://www.bigoven.com/45151-Broccoli-and-Cheese-Omelet-recipe.html",
        "iconUrl": "https://www.waysideorganics.co.uk/files/wayside/home/header_image.jpg"
        },
        {
        "type": "bigViewOverlapWithBottomMessage",
        "title": "Picnic Omelet Squares Recipe",
        "url": "http://www.cdkitchen.com/recipes/recs/2184/Picnic-Omelet-Squares99498.shtml",
        "iconUrl": "https://d1taxzywhomyrl.cloudfront.net/s3/ag-images-eu/poi/02/2f15bcf22f92d996e1c2a056b7371383.jpg?width=450&height=250&mode=crop"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Spanish Omelet",
        "url": "http://www.cooks.com/rec/view/0,185,153160-249194,00.html",
        "subTitle": "vegetable oil, green pepper, onions, water, milk, eggs, black pepper, mushroom, garlic, salt, chili powder",
        "iconUrl": "http://www.japanesesushifood.com/photo/pd20570004-halal_certified_vegetable_konnyaku_pasta_shiritaki_noodles_low_carb_diet_food.jpg"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Onion and Fresh Herb Omelet with Mixed Greens",
        "url": "http://find.myrecipes.com/recipes/recipefinder.dyn?action=displayRecipe&recipe_id=1622444",
        "subTitle": "egg substitute, milk, parsley, thyme, salt, black pepper, eggs, flour, nonstick cooking spray, onions, garlic, salad greens, salad greens, red wine vinegar, olive oil, goat cheese, almonds",
        "iconUrl": "http://img.recipepuppy.com/514820.jpg"
        }
        ]
        }


        */
As per requirement we can customise more. this is just basic json format
{
        "results": [
        {
        "type": "header",
        "title": "Vegetable Pasta Recipes"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Vegetable-Pasta Oven Omelet",
        "url": "http://find.myrecipes.com/recipes/recipefinder.dyn?action=displayRecipe&recipe_id=520763",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat",
        "iconUrl": "http://img.recipepuppy.com/560556.jpg"
        },
        {
        "type": "headerWithIconAndText",
        "title": "Vegetable-Pasta",
        "url": "http://find.myrecipes.com/recipes/recipefinder.dyn?action=displayRecipe&recipe_id=520763",
        "iconUrl": "https://www.chriscruises.com/wp/wp-content/uploads/2017/04/IMG_8914-600x200_c.jpg"
        },
        {
        "type": "shortViewWithRightIcon",
        "title": "Roasted Pepper and Bacon Omelet",
        "url": "http://www.bigoven.com/43919-Roasted-Pepper-and-Bacon-Omelet-recipe.html",
        "iconUrl": "http://www.olgasflavorfactory.com/wp-content/uploads/2015/09/Vegetable-Pasta-Salad-1-11-100x100.jpg",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        },
        {
        "type": "banner",
        "title": "Broccoli and Cheese Omelet",
        "url": "http://www.bigoven.com/45151-Broccoli-and-Cheese-Omelet-recipe.html",
        "subTitle": "",
        "iconUrl": "https://www.chriscruises.com/wp/wp-content/uploads/2017/04/IMG_8914-600x200_c.jpg"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Broccoli Oven Omelet Recipe",
        "url": "http://cookeatshare.com/recipes/broccoli-oven-omelet-92851",
        "iconUrl": "https://i.pinimg.com/originals/17/a5/58/17a558831a2c9f1c8ad0b1f19f84de8d.jpg",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        },
        {
        "type": "shortViewWithRightIcon",
        "title": "Eggplant Omelet with Coriander and Caraway",
        "url": "http://www.epicurious.com/recipes/food/views/Eggplant-Omelet-with-Coriander-and-Caraway-306",
        "iconUrl": "https://www.sbs.com.au/food/sites/sbs.com.au.food/files/styles/thumb_small/public/broken-pasta-02.jpg?itok=64o9Oprt",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Eggplant Omelet with Coriander And Caraway",
        "url": "http://www.bigoven.com/143831-Eggplant-Omelet-with-Coriander-And-Caraway-recipe.html",
        "iconUrl": "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/vegetable-pasta-royalty-free-image-647750280-1552319876.jpg?crop=0.66635xw:1xh;center,top&resize=100:*",
        "subTitle": "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        },
        {
        "type": "banner",
        "title": "Broccoli and Cheese Omelet",
        "url": "http://www.bigoven.com/45151-Broccoli-and-Cheese-Omelet-recipe.html",
        "subTitle": "onions, garlic, chicken broth, cottage cheese, oregano, black pepper, egg substitute, bread, mozzarella cheese, butter",
        "iconUrl": "http://www.westaustraliancorngrowers.com.au/wp-content/uploads/2017/11/header-banner-2230x431_MASTER_larger-canvas-corn3_F-600x200_c.jpg"
        },
        {
        "type": "shortTextWithTitle",
        "title": "Chard And Onion Omelet",
        "url": "http://www.bigoven.com/149383-Chard-And-Onion-Omelet-recipe.html",
        "subTitle": "olive oil, onions, leaves, garlic, eggs, parsley, basil, thyme, gruyere cheese, parmesan cheese"
        },
        {
        "type": "banner",
        "title": "Broccoli and Cheese Omelet",
        "url": "http://www.bigoven.com/45151-Broccoli-and-Cheese-Omelet-recipe.html",
        "iconUrl": "https://www.waysideorganics.co.uk/files/wayside/home/header_image.jpg"
        },
        {
        "type": "bigViewOverlapWithBottomMessage",
        "title": "Picnic Omelet Squares Recipe",
        "url": "http://www.cdkitchen.com/recipes/recs/2184/Picnic-Omelet-Squares99498.shtml",
        "iconUrl": "https://d1taxzywhomyrl.cloudfront.net/s3/ag-images-eu/poi/02/2f15bcf22f92d996e1c2a056b7371383.jpg?width=450&height=250&mode=crop"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Spanish Omelet",
        "url": "http://www.cooks.com/rec/view/0,185,153160-249194,00.html",
        "subTitle": "vegetable oil, green pepper, onions, water, milk, eggs, black pepper, mushroom, garlic, salt, chili powder",
        "iconUrl": "http://www.japanesesushifood.com/photo/pd20570004-halal_certified_vegetable_konnyaku_pasta_shiritaki_noodles_low_carb_diet_food.jpg"
        },
        {
        "type": "shortViewWithLeftIcon",
        "title": "Onion and Fresh Herb Omelet with Mixed Greens",
        "url": "http://find.myrecipes.com/recipes/recipefinder.dyn?action=displayRecipe&recipe_id=1622444",
        "subTitle": "egg substitute, milk, parsley, thyme, salt, black pepper, eggs, flour, nonstick cooking spray, onions, garlic, salad greens, salad greens, red wine vinegar, olive oil, goat cheese, almonds",
        "iconUrl": "http://img.recipepuppy.com/514820.jpg"
        }
        ]
        }


        */