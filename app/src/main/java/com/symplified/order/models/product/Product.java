package com.symplified.order.models.product;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {

    public String id;
    public String name;
    private int prodImageview;
    public String description;
    public String storeId;
    public String categoryId;
    public String status;
    public String thumbnailUrl;
    public String vendor;
    public String region;
    public String seoUrl;
    public String seoName;
    public boolean trackQuantity;
    public boolean allowOutOfStockPurchases;
    public int minQuantityForAlarm;
    public String packingSize;
    public boolean isPackage;
    public boolean isNoteOptional;
    public String customNote;
    public String created;
    public String updated;
    public String vehicleType;
    public List<ProductVariant> productVariants;
    public List<ProductInventory> productInventories;
    public List<ProductAsset> productAssets;
    public ProductDeliveryDetail productDeliveryDetail;

    public Product(int pImg, String pName)
    {
        this.prodImageview = pImg;
        this.name = pName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProdImageview() {
        return prodImageview;
    }

    public void setProdImageview(int prodImageview) {
        this.prodImageview = prodImageview;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    public String getSeoName() {
        return seoName;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
    }

    public boolean isTrackQuantity() {
        return trackQuantity;
    }

    public void setTrackQuantity(boolean trackQuantity) {
        this.trackQuantity = trackQuantity;
    }

    public boolean isAllowOutOfStockPurchases() {
        return allowOutOfStockPurchases;
    }

    public void setAllowOutOfStockPurchases(boolean allowOutOfStockPurchases) {
        this.allowOutOfStockPurchases = allowOutOfStockPurchases;
    }

    public int getMinQuantityForAlarm() {
        return minQuantityForAlarm;
    }

    public void setMinQuantityForAlarm(int minQuantityForAlarm) {
        this.minQuantityForAlarm = minQuantityForAlarm;
    }

    public String getPackingSize() {
        return packingSize;
    }

    public void setPackingSize(String packingSize) {
        this.packingSize = packingSize;
    }

    public boolean isPackage() {
        return isPackage;
    }

    public void setPackage(boolean aPackage) {
        isPackage = aPackage;
    }

    public boolean isNoteOptional() {
        return isNoteOptional;
    }

    public void setNoteOptional(boolean noteOptional) {
        isNoteOptional = noteOptional;
    }

    public String getCustomNote() {
        return customNote;
    }

    public void setCustomNote(String customNote) {
        this.customNote = customNote;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public List<ProductVariant> getProductVariants() {
        return productVariants;
    }

    public void setProductVariants(List<ProductVariant> productVariants) {
        this.productVariants = productVariants;
    }

    public List<ProductInventory> getProductInventories() {
        return productInventories;
    }

    public void setProductInventories(List<ProductInventory> productInventories) {
        this.productInventories = productInventories;
    }

    public List<ProductAsset> getProductAssets() {
        return productAssets;
    }

    public void setProductAssets(List<ProductAsset> productAssets) {
        this.productAssets = productAssets;
    }

    public ProductDeliveryDetail getProductDeliveryDetail() {
        return productDeliveryDetail;
    }

    public void setProductDeliveryDetail(ProductDeliveryDetail productDeliveryDetail) {
        this.productDeliveryDetail = productDeliveryDetail;
    }


    public static class ProductVariant {
        public String id;
        public String name;
        public int prodImageview;
        public List<ProductVariantAvailable> productVariantsAvailable;
        public String sequenceNumber;

        @Override
        public String toString() {
            return "ProductVariant{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", productVariantsAvailable=" + productVariantsAvailable +
                    ", sequenceNumber='" + sequenceNumber + '\'' +
                    '}';
        }
    }

    public static class ProductVariantAvailable {
        public String id;
        public String value;
        public String productId;
        public String productVariantId;
        public int sequenceNumber;

        @Override
        public String toString() {
            return "ProductVariantAvailable{" +
                    "id='" + id + '\'' +
                    ", value='" + value + '\'' +
                    ", productId='" + productId + '\'' +
                    ", productVariantId='" + productVariantId + '\'' +
                    ", sequenceNumber=" + sequenceNumber +
                    '}';
        }
    }

    public class ProductInventory {
        public String itemCode;
        public float price;
        public int quantity;
        public String productId;
        public String status;
        public List<ProductInventoryItem> productInventoryItems;
        public String sku;

        @Override
        public String toString() {
            return "ProductInventory{" +
                    "itemCode='" + itemCode + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    ", productId='" + productId + '\'' +
                    ", status='" + status + '\'' +
                    ", productInventoryItems=" + productInventoryItems +
                    ", sku='" + sku + '\'' +
                    '}';
        }
    }

    public static class ProductInventoryItem {
        public String itemCode;
        public String productVariantAvailableId;
        public String productId;
        public int sequenceNumber;
        public ProductVariantAvailable productVariantAvailable;

        @Override
        public String toString() {
            return "ProductInventoryItem{" +
                    "itemCode='" + itemCode + '\'' +
                    ", productVariantAvailableId='" + productVariantAvailableId + '\'' +
                    ", productId='" + productId + '\'' +
                    ", sequenceNumber=" + sequenceNumber +
                    ", productVariantAvailable=" + productVariantAvailable +
                    '}';
        }
    }

    public static class ProductAsset {
        public String id;
        public String itemCode;
        public String name;
        public String url;
        public String productId;
        public boolean isThumbnail;

        @Override
        public String toString() {
            return "ProductAsset{" +
                    "id='" + id + '\'' +
                    ", itemCode='" + itemCode + '\'' +
                    ", name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    ", productId='" + productId + '\'' +
                    ", isThumbnail=" + isThumbnail +
                    '}';
        }
    }

    public static class ProductDeliveryDetail {
        public String productId;
        public String type;
        public String itemType;

        @Override
        public String toString() {
            return "ProductDeliveryDetail{" +
                    "productId='" + productId + '\'' +
                    ", type='" + type + '\'' +
                    ", itemType='" + itemType + '\'' +
                    '}';
        }
    }

    public static class ProductList {
        public List<Product> content;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", storeId='" + storeId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", status='" + status + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", vendor='" + vendor + '\'' +
                ", region='" + region + '\'' +
                ", seoUrl='" + seoUrl + '\'' +
                ", seoName='" + seoName + '\'' +
                ", trackQuantity=" + trackQuantity +
                ", allowOutOfStockPurchases=" + allowOutOfStockPurchases +
                ", minQuantityForAlarm=" + minQuantityForAlarm +
                ", packingSize='" + packingSize + '\'' +
                ", isPackage=" + isPackage +
                ", isNoteOptional=" + isNoteOptional +
                ", customNote='" + customNote + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", productVariants=" + productVariants.toString() +
                ", productInventories=" + productInventories.toString() +
                ", productAssets=" + productAssets.toString() +
                ", productDeliveryDetail=" + productDeliveryDetail.toString() +
                '}';
    }
}
