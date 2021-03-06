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

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>jv_b2c_dev</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACCOUNT_PRIMARY = Indexes0.ACCOUNT_PRIMARY;
    public static final Index ACCOUNT_USERNAME = Indexes0.ACCOUNT_USERNAME;
    public static final Index ACCOUNT_FILTER_ACCOUNT_FILTER_ACCOUNT_ID_FK = Indexes0.ACCOUNT_FILTER_ACCOUNT_FILTER_ACCOUNT_ID_FK;
    public static final Index ACCOUNT_FILTER_PRIMARY = Indexes0.ACCOUNT_FILTER_PRIMARY;
    public static final Index ACCOUNT_PRODUCT_PRIMARY = Indexes0.ACCOUNT_PRODUCT_PRIMARY;
    public static final Index ACCOUNT_RECIPE_PRIMARY = Indexes0.ACCOUNT_RECIPE_PRIMARY;
    public static final Index ADDRESS_PRIMARY = Indexes0.ADDRESS_PRIMARY;
    public static final Index ADMIN_PRIMARY = Indexes0.ADMIN_PRIMARY;
    public static final Index BANNER_BANNER_CONTENT_ID_FK = Indexes0.BANNER_BANNER_CONTENT_ID_FK;
    public static final Index BANNER_BANNER_PROMOTION_HEADER_ID_FK = Indexes0.BANNER_BANNER_PROMOTION_HEADER_ID_FK;
    public static final Index BANNER_PRIMARY = Indexes0.BANNER_PRIMARY;
    public static final Index CACHE_CACHE_KEY_UINDEX = Indexes0.CACHE_CACHE_KEY_UINDEX;
    public static final Index CACHE_PRIMARY = Indexes0.CACHE_PRIMARY;
    public static final Index CAROUSEL_PRIMARY = Indexes0.CAROUSEL_PRIMARY;
    public static final Index CART_PRIMARY = Indexes0.CART_PRIMARY;
    public static final Index CATEGORY_IS_ACTIVE = Indexes0.CATEGORY_IS_ACTIVE;
    public static final Index CATEGORY_IS_DELETED = Indexes0.CATEGORY_IS_DELETED;
    public static final Index CATEGORY_IS_PRIMARY = Indexes0.CATEGORY_IS_PRIMARY;
    public static final Index CATEGORY_PRIMARY = Indexes0.CATEGORY_PRIMARY;
    public static final Index CATEGORY_URL = Indexes0.CATEGORY_URL;
    public static final Index CATEGORY_RELATION_CATEGORY_RELATION_IBFK_1 = Indexes0.CATEGORY_RELATION_CATEGORY_RELATION_IBFK_1;
    public static final Index CATEGORY_RELATION_CATEGORY_RELATION_IBFK_2 = Indexes0.CATEGORY_RELATION_CATEGORY_RELATION_IBFK_2;
    public static final Index CATEGORY_RELATION_PRIMARY = Indexes0.CATEGORY_RELATION_PRIMARY;
    public static final Index CODE_KEY = Indexes0.CODE_KEY;
    public static final Index CODE_PRIMARY = Indexes0.CODE_PRIMARY;
    public static final Index CODE_TYPE = Indexes0.CODE_TYPE;
    public static final Index CODE_TYPE_PRIMARY = Indexes0.CODE_TYPE_PRIMARY;
    public static final Index CODE_TYPE_TYPE = Indexes0.CODE_TYPE_TYPE;
    public static final Index COMMENT_PRIMARY = Indexes0.COMMENT_PRIMARY;
    public static final Index CONTENT_PRIMARY = Indexes0.CONTENT_PRIMARY;
    public static final Index CONTENT_URL = Indexes0.CONTENT_URL;
    public static final Index FEATURE_PRIMARY = Indexes0.FEATURE_PRIMARY;
    public static final Index IMAGE_PRIMARY = Indexes0.IMAGE_PRIMARY;
    public static final Index IMAGE_URL = Indexes0.IMAGE_URL;
    public static final Index INGREDIENT_PRIMARY = Indexes0.INGREDIENT_PRIMARY;
    public static final Index LOG_PRIMARY = Indexes0.LOG_PRIMARY;
    public static final Index ORDER_ACOUNT_ID = Indexes0.ORDER_ACOUNT_ID;
    public static final Index ORDER_CUBIC_VOLUME_UOM = Indexes0.ORDER_CUBIC_VOLUME_UOM;
    public static final Index ORDER_PRIMARY = Indexes0.ORDER_PRIMARY;
    public static final Index ORDER_WEIGHT_UOM = Indexes0.ORDER_WEIGHT_UOM;
    public static final Index ORDER_CHARGE_REFUND_ORDER_CHARGE_REFUND_ID_UINDEX = Indexes0.ORDER_CHARGE_REFUND_ORDER_CHARGE_REFUND_ID_UINDEX;
    public static final Index ORDER_CHARGE_REFUND_ORDER_CHARGE_REFUND_ORDER_CHARGE_REFUND_ID_FK = Indexes0.ORDER_CHARGE_REFUND_ORDER_CHARGE_REFUND_ORDER_CHARGE_REFUND_ID_FK;
    public static final Index ORDER_CHARGE_REFUND_PRIMARY = Indexes0.ORDER_CHARGE_REFUND_PRIMARY;
    public static final Index ORDER_ITEM_ORDER_ID = Indexes0.ORDER_ITEM_ORDER_ID;
    public static final Index ORDER_ITEM_ORDER_ITEM_IBFK_2 = Indexes0.ORDER_ITEM_ORDER_ITEM_IBFK_2;
    public static final Index ORDER_ITEM_PRIMARY = Indexes0.ORDER_ITEM_PRIMARY;
    public static final Index ORDER_ITEM_PROMOTION_ID = Indexes0.ORDER_ITEM_PROMOTION_ID;
    public static final Index ORDER_ITEM_WEIGHT_UOM = Indexes0.ORDER_ITEM_WEIGHT_UOM;
    public static final Index ORDER_TRACKING_INFO_ORDER_ID = Indexes0.ORDER_TRACKING_INFO_ORDER_ID;
    public static final Index ORDER_TRACKING_INFO_PRIMARY = Indexes0.ORDER_TRACKING_INFO_PRIMARY;
    public static final Index PRODUCT_IS_ACTIVE = Indexes0.PRODUCT_IS_ACTIVE;
    public static final Index PRODUCT_IS_DELETED = Indexes0.PRODUCT_IS_DELETED;
    public static final Index PRODUCT_ITEM_NUMBER = Indexes0.PRODUCT_ITEM_NUMBER;
    public static final Index PRODUCT_PRIMARY = Indexes0.PRODUCT_PRIMARY;
    public static final Index PRODUCT_PRODUCT_UOM_ID_FK = Indexes0.PRODUCT_PRODUCT_UOM_ID_FK;
    public static final Index PRODUCT_PRODUCT_UOM_ID_FK_2 = Indexes0.PRODUCT_PRODUCT_UOM_ID_FK_2;
    public static final Index PRODUCT_PRODUCT_UOM_ID_FK_3 = Indexes0.PRODUCT_PRODUCT_UOM_ID_FK_3;
    public static final Index PRODUCT_REPLACEMENT_ITEM_NUMBER = Indexes0.PRODUCT_REPLACEMENT_ITEM_NUMBER;
    public static final Index PRODUCT_URL = Indexes0.PRODUCT_URL;
    public static final Index PRODUCT_AVAILABILITY_PRIMARY = Indexes0.PRODUCT_AVAILABILITY_PRIMARY;
    public static final Index PRODUCT_AVAILABILITY_PRODUCT_AVAILABILITY_ITEM_NUMBER_UINDEX = Indexes0.PRODUCT_AVAILABILITY_PRODUCT_AVAILABILITY_ITEM_NUMBER_UINDEX;
    public static final Index PRODUCT_CATEGORY_CATEGORY_ID = Indexes0.PRODUCT_CATEGORY_CATEGORY_ID;
    public static final Index PRODUCT_CATEGORY_ITEM_NUMBER = Indexes0.PRODUCT_CATEGORY_ITEM_NUMBER;
    public static final Index PRODUCT_CATEGORY_PRIMARY = Indexes0.PRODUCT_CATEGORY_PRIMARY;
    public static final Index PRODUCT_PRICE_PRIMARY = Indexes0.PRODUCT_PRICE_PRIMARY;
    public static final Index PRODUCT_PRICE_PRODUCT_PRICE_ITEM_NUMBER_UINDEX = Indexes0.PRODUCT_PRICE_PRODUCT_PRICE_ITEM_NUMBER_UINDEX;
    public static final Index PROMOTION_DETAIL_PRIMARY = Indexes0.PROMOTION_DETAIL_PRIMARY;
    public static final Index PROMOTION_DETAIL_PROMOTION_DETAIL_ID_UINDEX = Indexes0.PROMOTION_DETAIL_PROMOTION_DETAIL_ID_UINDEX;
    public static final Index PROMOTION_DETAIL_PROMOTION_DETAIL_PROMOTION_HEADER_ID_FK = Indexes0.PROMOTION_DETAIL_PROMOTION_DETAIL_PROMOTION_HEADER_ID_FK;
    public static final Index PROMOTION_HEADER_PRIMARY = Indexes0.PROMOTION_HEADER_PRIMARY;
    public static final Index PROMOTION_HEADER_PROMOTION_HEADER_CODE_UINDEX = Indexes0.PROMOTION_HEADER_PROMOTION_HEADER_CODE_UINDEX;
    public static final Index PROMOTION_USAGE_PRIMARY = Indexes0.PROMOTION_USAGE_PRIMARY;
    public static final Index PROMOTION_USAGE_PROMOTION_USAGE_ACCOUNT_ID_FK = Indexes0.PROMOTION_USAGE_PROMOTION_USAGE_ACCOUNT_ID_FK;
    public static final Index PROMOTION_USAGE_PROMOTION_USAGE_ID_UINDEX = Indexes0.PROMOTION_USAGE_PROMOTION_USAGE_ID_UINDEX;
    public static final Index PROMOTION_USAGE_PROMOTION_USAGE_PROMOTION_HEADER_ID_FK = Indexes0.PROMOTION_USAGE_PROMOTION_USAGE_PROMOTION_HEADER_ID_FK;
    public static final Index RECIPE_PRIMARY = Indexes0.RECIPE_PRIMARY;
    public static final Index RECIPE_CATEGORY_IS_ACTIVE = Indexes0.RECIPE_CATEGORY_IS_ACTIVE;
    public static final Index RECIPE_CATEGORY_IS_DELETED = Indexes0.RECIPE_CATEGORY_IS_DELETED;
    public static final Index RECIPE_CATEGORY_PRIMARY = Indexes0.RECIPE_CATEGORY_PRIMARY;
    public static final Index RECIPE_CATEGORY_URL = Indexes0.RECIPE_CATEGORY_URL;
    public static final Index RECIPE_CATEGORY_RELATION_CATEGORY_ID = Indexes0.RECIPE_CATEGORY_RELATION_CATEGORY_ID;
    public static final Index RECIPE_CATEGORY_RELATION_PRIMARY = Indexes0.RECIPE_CATEGORY_RELATION_PRIMARY;
    public static final Index RECIPE_CATEGORY_RELATION_RECIPE_ID = Indexes0.RECIPE_CATEGORY_RELATION_RECIPE_ID;
    public static final Index RECIPE_INGREDIENT_PRIMARY = Indexes0.RECIPE_INGREDIENT_PRIMARY;
    public static final Index RECIPE_INGREDIENT_RECIPE_INGREDIENT_IBFK_2 = Indexes0.RECIPE_INGREDIENT_RECIPE_INGREDIENT_IBFK_2;
    public static final Index RECIPE_INGREDIENT_UOM = Indexes0.RECIPE_INGREDIENT_UOM;
    public static final Index RECIPE_INGREDIENT_GROUP_PRIMARY = Indexes0.RECIPE_INGREDIENT_GROUP_PRIMARY;
    public static final Index RECIPE_INGREDIENT_GROUP_RECIPE_INGREDIENT_GROUP_RECIPE_ID_FK = Indexes0.RECIPE_INGREDIENT_GROUP_RECIPE_INGREDIENT_GROUP_RECIPE_ID_FK;
    public static final Index RELATED_ITEMS_PRIMARY = Indexes0.RELATED_ITEMS_PRIMARY;
    public static final Index RELATED_ITEMS_RELATED_ITEMS_ITEM_NUMBER_INDEX = Indexes0.RELATED_ITEMS_RELATED_ITEMS_ITEM_NUMBER_INDEX;
    public static final Index S2K_ORDER_STATUS_CODE_PRIMARY = Indexes0.S2K_ORDER_STATUS_CODE_PRIMARY;
    public static final Index S2K_ORDER_STATUS_CODE_S2K_ORDER_STATUS_CODE_ID_UINDEX = Indexes0.S2K_ORDER_STATUS_CODE_S2K_ORDER_STATUS_CODE_ID_UINDEX;
    public static final Index SEARCH_KEYWORD_PRIMARY = Indexes0.SEARCH_KEYWORD_PRIMARY;
    public static final Index SESSION_PRIMARY = Indexes0.SESSION_PRIMARY;
    public static final Index STORE_PRIMARY = Indexes0.STORE_PRIMARY;
    public static final Index TAG_PRIMARY = Indexes0.TAG_PRIMARY;
    public static final Index TAG_TAG_IBFK_1 = Indexes0.TAG_TAG_IBFK_1;
    public static final Index TAG_GROUP_PRIMARY = Indexes0.TAG_GROUP_PRIMARY;
    public static final Index TAG_RELATION_PRIMARY = Indexes0.TAG_RELATION_PRIMARY;
    public static final Index TAG_RELATION_TAG_ID = Indexes0.TAG_RELATION_TAG_ID;
    public static final Index UOM_PRIMARY = Indexes0.UOM_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ACCOUNT_PRIMARY = Internal.createIndex("PRIMARY", Account.ACCOUNT, new OrderField[] { Account.ACCOUNT.ID }, true);
        public static Index ACCOUNT_USERNAME = Internal.createIndex("username", Account.ACCOUNT, new OrderField[] { Account.ACCOUNT.USERNAME }, true);
        public static Index ACCOUNT_FILTER_ACCOUNT_FILTER_ACCOUNT_ID_FK = Internal.createIndex("account_filter_account_id_fk", AccountFilter.ACCOUNT_FILTER, new OrderField[] { AccountFilter.ACCOUNT_FILTER.ACCOUNT_ID }, false);
        public static Index ACCOUNT_FILTER_PRIMARY = Internal.createIndex("PRIMARY", AccountFilter.ACCOUNT_FILTER, new OrderField[] { AccountFilter.ACCOUNT_FILTER.ID }, true);
        public static Index ACCOUNT_PRODUCT_PRIMARY = Internal.createIndex("PRIMARY", AccountProduct.ACCOUNT_PRODUCT, new OrderField[] { AccountProduct.ACCOUNT_PRODUCT.ID, AccountProduct.ACCOUNT_PRODUCT.ITEM_NUMBER }, true);
        public static Index ACCOUNT_RECIPE_PRIMARY = Internal.createIndex("PRIMARY", AccountRecipe.ACCOUNT_RECIPE, new OrderField[] { AccountRecipe.ACCOUNT_RECIPE.ID }, true);
        public static Index ADDRESS_PRIMARY = Internal.createIndex("PRIMARY", Address.ADDRESS, new OrderField[] { Address.ADDRESS.ID }, true);
        public static Index ADMIN_PRIMARY = Internal.createIndex("PRIMARY", Admin.ADMIN, new OrderField[] { Admin.ADMIN.ID }, true);
        public static Index BANNER_BANNER_CONTENT_ID_FK = Internal.createIndex("banner_content_id_fk", Banner.BANNER, new OrderField[] { Banner.BANNER.CONTENT_ID }, false);
        public static Index BANNER_BANNER_PROMOTION_HEADER_ID_FK = Internal.createIndex("banner_promotion_header_id_fk", Banner.BANNER, new OrderField[] { Banner.BANNER.PROMOTION_ID }, false);
        public static Index BANNER_PRIMARY = Internal.createIndex("PRIMARY", Banner.BANNER, new OrderField[] { Banner.BANNER.ID }, true);
        public static Index CACHE_CACHE_KEY_UINDEX = Internal.createIndex("cache_key_uindex", Cache.CACHE, new OrderField[] { Cache.CACHE.HASH_KEY }, true);
        public static Index CACHE_PRIMARY = Internal.createIndex("PRIMARY", Cache.CACHE, new OrderField[] { Cache.CACHE.ID }, true);
        public static Index CAROUSEL_PRIMARY = Internal.createIndex("PRIMARY", Carousel.CAROUSEL, new OrderField[] { Carousel.CAROUSEL.ID }, true);
        public static Index CART_PRIMARY = Internal.createIndex("PRIMARY", Cart.CART, new OrderField[] { Cart.CART.ID }, true);
        public static Index CATEGORY_IS_ACTIVE = Internal.createIndex("is_active", Category.CATEGORY, new OrderField[] { Category.CATEGORY.IS_ACTIVE }, false);
        public static Index CATEGORY_IS_DELETED = Internal.createIndex("is_deleted", Category.CATEGORY, new OrderField[] { Category.CATEGORY.IS_DELETED }, false);
        public static Index CATEGORY_IS_PRIMARY = Internal.createIndex("is_primary", Category.CATEGORY, new OrderField[] { Category.CATEGORY.IS_PRIMARY }, false);
        public static Index CATEGORY_PRIMARY = Internal.createIndex("PRIMARY", Category.CATEGORY, new OrderField[] { Category.CATEGORY.ID }, true);
        public static Index CATEGORY_URL = Internal.createIndex("url", Category.CATEGORY, new OrderField[] { Category.CATEGORY.URL }, true);
        public static Index CATEGORY_RELATION_CATEGORY_RELATION_IBFK_1 = Internal.createIndex("category_relation_ibfk_1", CategoryRelation.CATEGORY_RELATION, new OrderField[] { CategoryRelation.CATEGORY_RELATION.CATEGORY_ID }, false);
        public static Index CATEGORY_RELATION_CATEGORY_RELATION_IBFK_2 = Internal.createIndex("category_relation_ibfk_2", CategoryRelation.CATEGORY_RELATION, new OrderField[] { CategoryRelation.CATEGORY_RELATION.PARENT_ID }, false);
        public static Index CATEGORY_RELATION_PRIMARY = Internal.createIndex("PRIMARY", CategoryRelation.CATEGORY_RELATION, new OrderField[] { CategoryRelation.CATEGORY_RELATION.ID }, true);
        public static Index CODE_KEY = Internal.createIndex("key", Code.CODE, new OrderField[] { Code.CODE.KEY }, false);
        public static Index CODE_PRIMARY = Internal.createIndex("PRIMARY", Code.CODE, new OrderField[] { Code.CODE.ID }, true);
        public static Index CODE_TYPE = Internal.createIndex("type", Code.CODE, new OrderField[] { Code.CODE.TYPE }, false);
        public static Index CODE_TYPE_PRIMARY = Internal.createIndex("PRIMARY", CodeType.CODE_TYPE, new OrderField[] { CodeType.CODE_TYPE.ID }, true);
        public static Index CODE_TYPE_TYPE = Internal.createIndex("type", CodeType.CODE_TYPE, new OrderField[] { CodeType.CODE_TYPE.TYPE }, false);
        public static Index COMMENT_PRIMARY = Internal.createIndex("PRIMARY", Comment.COMMENT, new OrderField[] { Comment.COMMENT.ID }, true);
        public static Index CONTENT_PRIMARY = Internal.createIndex("PRIMARY", Content.CONTENT, new OrderField[] { Content.CONTENT.ID }, true);
        public static Index CONTENT_URL = Internal.createIndex("url", Content.CONTENT, new OrderField[] { Content.CONTENT.URL }, true);
        public static Index FEATURE_PRIMARY = Internal.createIndex("PRIMARY", Feature.FEATURE, new OrderField[] { Feature.FEATURE.ID }, true);
        public static Index IMAGE_PRIMARY = Internal.createIndex("PRIMARY", Image.IMAGE, new OrderField[] { Image.IMAGE.ID }, true);
        public static Index IMAGE_URL = Internal.createIndex("url", Image.IMAGE, new OrderField[] { Image.IMAGE.FILENAME }, true);
        public static Index INGREDIENT_PRIMARY = Internal.createIndex("PRIMARY", Ingredient.INGREDIENT, new OrderField[] { Ingredient.INGREDIENT.ID }, true);
        public static Index LOG_PRIMARY = Internal.createIndex("PRIMARY", Log.LOG, new OrderField[] { Log.LOG.ID }, true);
        public static Index ORDER_ACOUNT_ID = Internal.createIndex("acount_id", Order.ORDER, new OrderField[] { Order.ORDER.ACCOUNT_ID }, false);
        public static Index ORDER_CUBIC_VOLUME_UOM = Internal.createIndex("cubic_volume_uom", Order.ORDER, new OrderField[] { Order.ORDER.CUBIC_VOLUME_UOM }, false);
        public static Index ORDER_PRIMARY = Internal.createIndex("PRIMARY", Order.ORDER, new OrderField[] { Order.ORDER.ID }, true);
        public static Index ORDER_WEIGHT_UOM = Internal.createIndex("weight_uom", Order.ORDER, new OrderField[] { Order.ORDER.WEIGHT_UOM }, false);
        public static Index ORDER_CHARGE_REFUND_ORDER_CHARGE_REFUND_ID_UINDEX = Internal.createIndex("order_charge_refund_id_uindex", OrderChargeRefund.ORDER_CHARGE_REFUND, new OrderField[] { OrderChargeRefund.ORDER_CHARGE_REFUND.ID }, true);
        public static Index ORDER_CHARGE_REFUND_ORDER_CHARGE_REFUND_ORDER_CHARGE_REFUND_ID_FK = Internal.createIndex("order_charge_refund_order_charge_refund_id_fk", OrderChargeRefund.ORDER_CHARGE_REFUND, new OrderField[] { OrderChargeRefund.ORDER_CHARGE_REFUND.ORDER_ID }, false);
        public static Index ORDER_CHARGE_REFUND_PRIMARY = Internal.createIndex("PRIMARY", OrderChargeRefund.ORDER_CHARGE_REFUND, new OrderField[] { OrderChargeRefund.ORDER_CHARGE_REFUND.ID }, true);
        public static Index ORDER_ITEM_ORDER_ID = Internal.createIndex("order_id", OrderItem.ORDER_ITEM, new OrderField[] { OrderItem.ORDER_ITEM.ORDER_ID }, false);
        public static Index ORDER_ITEM_ORDER_ITEM_IBFK_2 = Internal.createIndex("order_item_ibfk_2", OrderItem.ORDER_ITEM, new OrderField[] { OrderItem.ORDER_ITEM.ITEM_NUMBER }, false);
        public static Index ORDER_ITEM_PRIMARY = Internal.createIndex("PRIMARY", OrderItem.ORDER_ITEM, new OrderField[] { OrderItem.ORDER_ITEM.ID }, true);
        public static Index ORDER_ITEM_PROMOTION_ID = Internal.createIndex("promotion_id", OrderItem.ORDER_ITEM, new OrderField[] { OrderItem.ORDER_ITEM.PROMOTION_ID }, false);
        public static Index ORDER_ITEM_WEIGHT_UOM = Internal.createIndex("weight_uom", OrderItem.ORDER_ITEM, new OrderField[] { OrderItem.ORDER_ITEM.WEIGHT_UOM }, false);
        public static Index ORDER_TRACKING_INFO_ORDER_ID = Internal.createIndex("order_id", OrderTrackingInfo.ORDER_TRACKING_INFO, new OrderField[] { OrderTrackingInfo.ORDER_TRACKING_INFO.ORDER_ID }, false);
        public static Index ORDER_TRACKING_INFO_PRIMARY = Internal.createIndex("PRIMARY", OrderTrackingInfo.ORDER_TRACKING_INFO, new OrderField[] { OrderTrackingInfo.ORDER_TRACKING_INFO.ID }, true);
        public static Index PRODUCT_IS_ACTIVE = Internal.createIndex("is_active", Product.PRODUCT, new OrderField[] { Product.PRODUCT.IS_ACTIVE }, false);
        public static Index PRODUCT_IS_DELETED = Internal.createIndex("is_deleted", Product.PRODUCT, new OrderField[] { Product.PRODUCT.IS_DELETED }, false);
        public static Index PRODUCT_ITEM_NUMBER = Internal.createIndex("item_number", Product.PRODUCT, new OrderField[] { Product.PRODUCT.ITEM_NUMBER }, true);
        public static Index PRODUCT_PRIMARY = Internal.createIndex("PRIMARY", Product.PRODUCT, new OrderField[] { Product.PRODUCT.ID }, true);
        public static Index PRODUCT_PRODUCT_UOM_ID_FK = Internal.createIndex("product_uom_id_fk", Product.PRODUCT, new OrderField[] { Product.PRODUCT.UOM }, false);
        public static Index PRODUCT_PRODUCT_UOM_ID_FK_2 = Internal.createIndex("product_uom_id_fk_2", Product.PRODUCT, new OrderField[] { Product.PRODUCT.ITEM_WEIGHT_UOM }, false);
        public static Index PRODUCT_PRODUCT_UOM_ID_FK_3 = Internal.createIndex("product_uom_id_fk_3", Product.PRODUCT, new OrderField[] { Product.PRODUCT.CUBIC_VOLUME_UOM }, false);
        public static Index PRODUCT_REPLACEMENT_ITEM_NUMBER = Internal.createIndex("replacement_item_number", Product.PRODUCT, new OrderField[] { Product.PRODUCT.REPLACEMENT_ITEM_NUMBER }, false);
        public static Index PRODUCT_URL = Internal.createIndex("url", Product.PRODUCT, new OrderField[] { Product.PRODUCT.URL }, true);
        public static Index PRODUCT_AVAILABILITY_PRIMARY = Internal.createIndex("PRIMARY", ProductAvailability.PRODUCT_AVAILABILITY, new OrderField[] { ProductAvailability.PRODUCT_AVAILABILITY.ID }, true);
        public static Index PRODUCT_AVAILABILITY_PRODUCT_AVAILABILITY_ITEM_NUMBER_UINDEX = Internal.createIndex("product_availability_item_number_uindex", ProductAvailability.PRODUCT_AVAILABILITY, new OrderField[] { ProductAvailability.PRODUCT_AVAILABILITY.ITEM_NUMBER }, true);
        public static Index PRODUCT_CATEGORY_CATEGORY_ID = Internal.createIndex("category_id", ProductCategory.PRODUCT_CATEGORY, new OrderField[] { ProductCategory.PRODUCT_CATEGORY.CATEGORY_ID }, false);
        public static Index PRODUCT_CATEGORY_ITEM_NUMBER = Internal.createIndex("item_number", ProductCategory.PRODUCT_CATEGORY, new OrderField[] { ProductCategory.PRODUCT_CATEGORY.ITEM_NUMBER }, false);
        public static Index PRODUCT_CATEGORY_PRIMARY = Internal.createIndex("PRIMARY", ProductCategory.PRODUCT_CATEGORY, new OrderField[] { ProductCategory.PRODUCT_CATEGORY.ID }, true);
        public static Index PRODUCT_PRICE_PRIMARY = Internal.createIndex("PRIMARY", ProductPrice.PRODUCT_PRICE, new OrderField[] { ProductPrice.PRODUCT_PRICE.ID }, true);
        public static Index PRODUCT_PRICE_PRODUCT_PRICE_ITEM_NUMBER_UINDEX = Internal.createIndex("product_price_item_number_uindex", ProductPrice.PRODUCT_PRICE, new OrderField[] { ProductPrice.PRODUCT_PRICE.ITEM_NUMBER }, true);
        public static Index PROMOTION_DETAIL_PRIMARY = Internal.createIndex("PRIMARY", PromotionDetail.PROMOTION_DETAIL, new OrderField[] { PromotionDetail.PROMOTION_DETAIL.ID }, true);
        public static Index PROMOTION_DETAIL_PROMOTION_DETAIL_ID_UINDEX = Internal.createIndex("promotion_detail_id_uindex", PromotionDetail.PROMOTION_DETAIL, new OrderField[] { PromotionDetail.PROMOTION_DETAIL.ID }, true);
        public static Index PROMOTION_DETAIL_PROMOTION_DETAIL_PROMOTION_HEADER_ID_FK = Internal.createIndex("promotion_detail_promotion_header_id_fk", PromotionDetail.PROMOTION_DETAIL, new OrderField[] { PromotionDetail.PROMOTION_DETAIL.PROMOTION_ID }, false);
        public static Index PROMOTION_HEADER_PRIMARY = Internal.createIndex("PRIMARY", PromotionHeader.PROMOTION_HEADER, new OrderField[] { PromotionHeader.PROMOTION_HEADER.ID }, true);
        public static Index PROMOTION_HEADER_PROMOTION_HEADER_CODE_UINDEX = Internal.createIndex("promotion_header_code_uindex", PromotionHeader.PROMOTION_HEADER, new OrderField[] { PromotionHeader.PROMOTION_HEADER.CODE }, true);
        public static Index PROMOTION_USAGE_PRIMARY = Internal.createIndex("PRIMARY", PromotionUsage.PROMOTION_USAGE, new OrderField[] { PromotionUsage.PROMOTION_USAGE.ID }, true);
        public static Index PROMOTION_USAGE_PROMOTION_USAGE_ACCOUNT_ID_FK = Internal.createIndex("promotion_usage_account_id_fk", PromotionUsage.PROMOTION_USAGE, new OrderField[] { PromotionUsage.PROMOTION_USAGE.ACCOUNT_ID }, false);
        public static Index PROMOTION_USAGE_PROMOTION_USAGE_ID_UINDEX = Internal.createIndex("promotion_usage_id_uindex", PromotionUsage.PROMOTION_USAGE, new OrderField[] { PromotionUsage.PROMOTION_USAGE.ID }, true);
        public static Index PROMOTION_USAGE_PROMOTION_USAGE_PROMOTION_HEADER_ID_FK = Internal.createIndex("promotion_usage_promotion_header_id_fk", PromotionUsage.PROMOTION_USAGE, new OrderField[] { PromotionUsage.PROMOTION_USAGE.PROMOTION_ID }, false);
        public static Index RECIPE_PRIMARY = Internal.createIndex("PRIMARY", Recipe.RECIPE, new OrderField[] { Recipe.RECIPE.ID }, true);
        public static Index RECIPE_CATEGORY_IS_ACTIVE = Internal.createIndex("is_active", RecipeCategory.RECIPE_CATEGORY, new OrderField[] { RecipeCategory.RECIPE_CATEGORY.IS_ACTIVE }, false);
        public static Index RECIPE_CATEGORY_IS_DELETED = Internal.createIndex("is_deleted", RecipeCategory.RECIPE_CATEGORY, new OrderField[] { RecipeCategory.RECIPE_CATEGORY.IS_DELETED }, false);
        public static Index RECIPE_CATEGORY_PRIMARY = Internal.createIndex("PRIMARY", RecipeCategory.RECIPE_CATEGORY, new OrderField[] { RecipeCategory.RECIPE_CATEGORY.ID }, true);
        public static Index RECIPE_CATEGORY_URL = Internal.createIndex("url", RecipeCategory.RECIPE_CATEGORY, new OrderField[] { RecipeCategory.RECIPE_CATEGORY.URL }, true);
        public static Index RECIPE_CATEGORY_RELATION_CATEGORY_ID = Internal.createIndex("category_id", RecipeCategoryRelation.RECIPE_CATEGORY_RELATION, new OrderField[] { RecipeCategoryRelation.RECIPE_CATEGORY_RELATION.CATEGORY_ID }, false);
        public static Index RECIPE_CATEGORY_RELATION_PRIMARY = Internal.createIndex("PRIMARY", RecipeCategoryRelation.RECIPE_CATEGORY_RELATION, new OrderField[] { RecipeCategoryRelation.RECIPE_CATEGORY_RELATION.ID }, true);
        public static Index RECIPE_CATEGORY_RELATION_RECIPE_ID = Internal.createIndex("recipe_id", RecipeCategoryRelation.RECIPE_CATEGORY_RELATION, new OrderField[] { RecipeCategoryRelation.RECIPE_CATEGORY_RELATION.RECIPE_ID }, false);
        public static Index RECIPE_INGREDIENT_PRIMARY = Internal.createIndex("PRIMARY", RecipeIngredient.RECIPE_INGREDIENT, new OrderField[] { RecipeIngredient.RECIPE_INGREDIENT.ID }, true);
        public static Index RECIPE_INGREDIENT_RECIPE_INGREDIENT_IBFK_2 = Internal.createIndex("recipe_ingredient_ibfk_2", RecipeIngredient.RECIPE_INGREDIENT, new OrderField[] { RecipeIngredient.RECIPE_INGREDIENT.RECIPE_INGREDIENT_GROUP_ID }, false);
        public static Index RECIPE_INGREDIENT_UOM = Internal.createIndex("uom", RecipeIngredient.RECIPE_INGREDIENT, new OrderField[] { RecipeIngredient.RECIPE_INGREDIENT.UOM }, false);
        public static Index RECIPE_INGREDIENT_GROUP_PRIMARY = Internal.createIndex("PRIMARY", RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP, new OrderField[] { RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP.ID }, true);
        public static Index RECIPE_INGREDIENT_GROUP_RECIPE_INGREDIENT_GROUP_RECIPE_ID_FK = Internal.createIndex("recipe_ingredient_group_recipe_id_fk", RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP, new OrderField[] { RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP.RECIPE_ID }, false);
        public static Index RELATED_ITEMS_PRIMARY = Internal.createIndex("PRIMARY", RelatedItems.RELATED_ITEMS, new OrderField[] { RelatedItems.RELATED_ITEMS.ID }, true);
        public static Index RELATED_ITEMS_RELATED_ITEMS_ITEM_NUMBER_INDEX = Internal.createIndex("related_items_item_number_index", RelatedItems.RELATED_ITEMS, new OrderField[] { RelatedItems.RELATED_ITEMS.ITEM_NUMBER }, false);
        public static Index S2K_ORDER_STATUS_CODE_PRIMARY = Internal.createIndex("PRIMARY", S2kOrderStatusCode.S2K_ORDER_STATUS_CODE, new OrderField[] { S2kOrderStatusCode.S2K_ORDER_STATUS_CODE.ID }, true);
        public static Index S2K_ORDER_STATUS_CODE_S2K_ORDER_STATUS_CODE_ID_UINDEX = Internal.createIndex("s2k_order_status_code_id_uindex", S2kOrderStatusCode.S2K_ORDER_STATUS_CODE, new OrderField[] { S2kOrderStatusCode.S2K_ORDER_STATUS_CODE.ID }, true);
        public static Index SEARCH_KEYWORD_PRIMARY = Internal.createIndex("PRIMARY", SearchKeyword.SEARCH_KEYWORD, new OrderField[] { SearchKeyword.SEARCH_KEYWORD.ID }, true);
        public static Index SESSION_PRIMARY = Internal.createIndex("PRIMARY", Session.SESSION, new OrderField[] { Session.SESSION.ID }, true);
        public static Index STORE_PRIMARY = Internal.createIndex("PRIMARY", Store.STORE, new OrderField[] { Store.STORE.ID }, true);
        public static Index TAG_PRIMARY = Internal.createIndex("PRIMARY", Tag.TAG, new OrderField[] { Tag.TAG.ID }, true);
        public static Index TAG_TAG_IBFK_1 = Internal.createIndex("tag_ibfk_1", Tag.TAG, new OrderField[] { Tag.TAG.TAG_GROUP_ID }, false);
        public static Index TAG_GROUP_PRIMARY = Internal.createIndex("PRIMARY", TagGroup.TAG_GROUP, new OrderField[] { TagGroup.TAG_GROUP.ID }, true);
        public static Index TAG_RELATION_PRIMARY = Internal.createIndex("PRIMARY", TagRelation.TAG_RELATION, new OrderField[] { TagRelation.TAG_RELATION.ID }, true);
        public static Index TAG_RELATION_TAG_ID = Internal.createIndex("tag_id", TagRelation.TAG_RELATION, new OrderField[] { TagRelation.TAG_RELATION.TAG_ID }, false);
        public static Index UOM_PRIMARY = Internal.createIndex("PRIMARY", Uom.UOM, new OrderField[] { Uom.UOM.ID }, true);
    }
}
