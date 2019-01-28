/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv;


import com.scratch.database.mysql.jv.tables.Account;
import com.scratch.database.mysql.jv.tables.AccountFilter;
import com.scratch.database.mysql.jv.tables.AccountProduct;
import com.scratch.database.mysql.jv.tables.AccountRecipe;
import com.scratch.database.mysql.jv.tables.Address;
import com.scratch.database.mysql.jv.tables.Admin;
import com.scratch.database.mysql.jv.tables.Banner;
import com.scratch.database.mysql.jv.tables.Cache;
import com.scratch.database.mysql.jv.tables.Carousel;
import com.scratch.database.mysql.jv.tables.Cart;
import com.scratch.database.mysql.jv.tables.Category;
import com.scratch.database.mysql.jv.tables.CategoryRelation;
import com.scratch.database.mysql.jv.tables.Code;
import com.scratch.database.mysql.jv.tables.CodeType;
import com.scratch.database.mysql.jv.tables.Comment;
import com.scratch.database.mysql.jv.tables.Content;
import com.scratch.database.mysql.jv.tables.Feature;
import com.scratch.database.mysql.jv.tables.Image;
import com.scratch.database.mysql.jv.tables.Ingredient;
import com.scratch.database.mysql.jv.tables.Log;
import com.scratch.database.mysql.jv.tables.Order;
import com.scratch.database.mysql.jv.tables.OrderChargeRefund;
import com.scratch.database.mysql.jv.tables.OrderItem;
import com.scratch.database.mysql.jv.tables.OrderTrackingInfo;
import com.scratch.database.mysql.jv.tables.Product;
import com.scratch.database.mysql.jv.tables.ProductAvailability;
import com.scratch.database.mysql.jv.tables.ProductCategory;
import com.scratch.database.mysql.jv.tables.ProductPrice;
import com.scratch.database.mysql.jv.tables.PromotionDetail;
import com.scratch.database.mysql.jv.tables.PromotionHeader;
import com.scratch.database.mysql.jv.tables.PromotionUsage;
import com.scratch.database.mysql.jv.tables.Recipe;
import com.scratch.database.mysql.jv.tables.RecipeCategory;
import com.scratch.database.mysql.jv.tables.RecipeCategoryRelation;
import com.scratch.database.mysql.jv.tables.RecipeIngredient;
import com.scratch.database.mysql.jv.tables.RecipeIngredientGroup;
import com.scratch.database.mysql.jv.tables.RelatedItems;
import com.scratch.database.mysql.jv.tables.S2kOrderStatusCode;
import com.scratch.database.mysql.jv.tables.SearchKeyword;
import com.scratch.database.mysql.jv.tables.Session;
import com.scratch.database.mysql.jv.tables.Store;
import com.scratch.database.mysql.jv.tables.Tag;
import com.scratch.database.mysql.jv.tables.TagGroup;
import com.scratch.database.mysql.jv.tables.TagRelation;
import com.scratch.database.mysql.jv.tables.Uom;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in jv_b2c_dev
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>jv_b2c_dev.account</code>.
     */
    public static final Account ACCOUNT = com.scratch.database.mysql.jv.tables.Account.ACCOUNT;

    /**
     * The table <code>jv_b2c_dev.account_filter</code>.
     */
    public static final AccountFilter ACCOUNT_FILTER = com.scratch.database.mysql.jv.tables.AccountFilter.ACCOUNT_FILTER;

    /**
     * The table <code>jv_b2c_dev.account_product</code>.
     */
    public static final AccountProduct ACCOUNT_PRODUCT = com.scratch.database.mysql.jv.tables.AccountProduct.ACCOUNT_PRODUCT;

    /**
     * The table <code>jv_b2c_dev.account_recipe</code>.
     */
    public static final AccountRecipe ACCOUNT_RECIPE = com.scratch.database.mysql.jv.tables.AccountRecipe.ACCOUNT_RECIPE;

    /**
     * The table <code>jv_b2c_dev.address</code>.
     */
    public static final Address ADDRESS = com.scratch.database.mysql.jv.tables.Address.ADDRESS;

    /**
     * The table <code>jv_b2c_dev.admin</code>.
     */
    public static final Admin ADMIN = com.scratch.database.mysql.jv.tables.Admin.ADMIN;

    /**
     * The table <code>jv_b2c_dev.banner</code>.
     */
    public static final Banner BANNER = com.scratch.database.mysql.jv.tables.Banner.BANNER;

    /**
     * The table <code>jv_b2c_dev.cache</code>.
     */
    public static final Cache CACHE = com.scratch.database.mysql.jv.tables.Cache.CACHE;

    /**
     * The table <code>jv_b2c_dev.carousel</code>.
     */
    public static final Carousel CAROUSEL = com.scratch.database.mysql.jv.tables.Carousel.CAROUSEL;

    /**
     * The table <code>jv_b2c_dev.cart</code>.
     */
    public static final Cart CART = com.scratch.database.mysql.jv.tables.Cart.CART;

    /**
     * The table <code>jv_b2c_dev.category</code>.
     */
    public static final Category CATEGORY = com.scratch.database.mysql.jv.tables.Category.CATEGORY;

    /**
     * The table <code>jv_b2c_dev.category_relation</code>.
     */
    public static final CategoryRelation CATEGORY_RELATION = com.scratch.database.mysql.jv.tables.CategoryRelation.CATEGORY_RELATION;

    /**
     * The table <code>jv_b2c_dev.code</code>.
     */
    public static final Code CODE = com.scratch.database.mysql.jv.tables.Code.CODE;

    /**
     * The table <code>jv_b2c_dev.code_type</code>.
     */
    public static final CodeType CODE_TYPE = com.scratch.database.mysql.jv.tables.CodeType.CODE_TYPE;

    /**
     * The table <code>jv_b2c_dev.comment</code>.
     */
    public static final Comment COMMENT = com.scratch.database.mysql.jv.tables.Comment.COMMENT;

    /**
     * The table <code>jv_b2c_dev.content</code>.
     */
    public static final Content CONTENT = com.scratch.database.mysql.jv.tables.Content.CONTENT;

    /**
     * The table <code>jv_b2c_dev.feature</code>.
     */
    public static final Feature FEATURE = com.scratch.database.mysql.jv.tables.Feature.FEATURE;

    /**
     * The table <code>jv_b2c_dev.image</code>.
     */
    public static final Image IMAGE = com.scratch.database.mysql.jv.tables.Image.IMAGE;

    /**
     * The table <code>jv_b2c_dev.ingredient</code>.
     */
    public static final Ingredient INGREDIENT = com.scratch.database.mysql.jv.tables.Ingredient.INGREDIENT;

    /**
     * The table <code>jv_b2c_dev.log</code>.
     */
    public static final Log LOG = com.scratch.database.mysql.jv.tables.Log.LOG;

    /**
     * The table <code>jv_b2c_dev.order</code>.
     */
    public static final Order ORDER = com.scratch.database.mysql.jv.tables.Order.ORDER;

    /**
     * The table <code>jv_b2c_dev.order_charge_refund</code>.
     */
    public static final OrderChargeRefund ORDER_CHARGE_REFUND = com.scratch.database.mysql.jv.tables.OrderChargeRefund.ORDER_CHARGE_REFUND;

    /**
     * The table <code>jv_b2c_dev.order_item</code>.
     */
    public static final OrderItem ORDER_ITEM = com.scratch.database.mysql.jv.tables.OrderItem.ORDER_ITEM;

    /**
     * The table <code>jv_b2c_dev.order_tracking_info</code>.
     */
    public static final OrderTrackingInfo ORDER_TRACKING_INFO = com.scratch.database.mysql.jv.tables.OrderTrackingInfo.ORDER_TRACKING_INFO;

    /**
     * The table <code>jv_b2c_dev.product</code>.
     */
    public static final Product PRODUCT = com.scratch.database.mysql.jv.tables.Product.PRODUCT;

    /**
     * The table <code>jv_b2c_dev.product_availability</code>.
     */
    public static final ProductAvailability PRODUCT_AVAILABILITY = com.scratch.database.mysql.jv.tables.ProductAvailability.PRODUCT_AVAILABILITY;

    /**
     * The table <code>jv_b2c_dev.product_category</code>.
     */
    public static final ProductCategory PRODUCT_CATEGORY = com.scratch.database.mysql.jv.tables.ProductCategory.PRODUCT_CATEGORY;

    /**
     * The table <code>jv_b2c_dev.product_price</code>.
     */
    public static final ProductPrice PRODUCT_PRICE = com.scratch.database.mysql.jv.tables.ProductPrice.PRODUCT_PRICE;

    /**
     * The table <code>jv_b2c_dev.promotion_detail</code>.
     */
    public static final PromotionDetail PROMOTION_DETAIL = com.scratch.database.mysql.jv.tables.PromotionDetail.PROMOTION_DETAIL;

    /**
     * The table <code>jv_b2c_dev.promotion_header</code>.
     */
    public static final PromotionHeader PROMOTION_HEADER = com.scratch.database.mysql.jv.tables.PromotionHeader.PROMOTION_HEADER;

    /**
     * The table <code>jv_b2c_dev.promotion_usage</code>.
     */
    public static final PromotionUsage PROMOTION_USAGE = com.scratch.database.mysql.jv.tables.PromotionUsage.PROMOTION_USAGE;

    /**
     * The table <code>jv_b2c_dev.recipe</code>.
     */
    public static final Recipe RECIPE = com.scratch.database.mysql.jv.tables.Recipe.RECIPE;

    /**
     * The table <code>jv_b2c_dev.recipe_category</code>.
     */
    public static final RecipeCategory RECIPE_CATEGORY = com.scratch.database.mysql.jv.tables.RecipeCategory.RECIPE_CATEGORY;

    /**
     * The table <code>jv_b2c_dev.recipe_category_relation</code>.
     */
    public static final RecipeCategoryRelation RECIPE_CATEGORY_RELATION = com.scratch.database.mysql.jv.tables.RecipeCategoryRelation.RECIPE_CATEGORY_RELATION;

    /**
     * The table <code>jv_b2c_dev.recipe_ingredient</code>.
     */
    public static final RecipeIngredient RECIPE_INGREDIENT = com.scratch.database.mysql.jv.tables.RecipeIngredient.RECIPE_INGREDIENT;

    /**
     * The table <code>jv_b2c_dev.recipe_ingredient_group</code>.
     */
    public static final RecipeIngredientGroup RECIPE_INGREDIENT_GROUP = com.scratch.database.mysql.jv.tables.RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP;

    /**
     * The table <code>jv_b2c_dev.related_items</code>.
     */
    public static final RelatedItems RELATED_ITEMS = com.scratch.database.mysql.jv.tables.RelatedItems.RELATED_ITEMS;

    /**
     * The table <code>jv_b2c_dev.s2k_order_status_code</code>.
     */
    public static final S2kOrderStatusCode S2K_ORDER_STATUS_CODE = com.scratch.database.mysql.jv.tables.S2kOrderStatusCode.S2K_ORDER_STATUS_CODE;

    /**
     * The table <code>jv_b2c_dev.search_keyword</code>.
     */
    public static final SearchKeyword SEARCH_KEYWORD = com.scratch.database.mysql.jv.tables.SearchKeyword.SEARCH_KEYWORD;

    /**
     * The table <code>jv_b2c_dev.session</code>.
     */
    public static final Session SESSION = com.scratch.database.mysql.jv.tables.Session.SESSION;

    /**
     * The table <code>jv_b2c_dev.store</code>.
     */
    public static final Store STORE = com.scratch.database.mysql.jv.tables.Store.STORE;

    /**
     * The table <code>jv_b2c_dev.tag</code>.
     */
    public static final Tag TAG = com.scratch.database.mysql.jv.tables.Tag.TAG;

    /**
     * The table <code>jv_b2c_dev.tag_group</code>.
     */
    public static final TagGroup TAG_GROUP = com.scratch.database.mysql.jv.tables.TagGroup.TAG_GROUP;

    /**
     * The table <code>jv_b2c_dev.tag_relation</code>.
     */
    public static final TagRelation TAG_RELATION = com.scratch.database.mysql.jv.tables.TagRelation.TAG_RELATION;

    /**
     * The table <code>jv_b2c_dev.uom</code>.
     */
    public static final Uom UOM = com.scratch.database.mysql.jv.tables.Uom.UOM;
}
