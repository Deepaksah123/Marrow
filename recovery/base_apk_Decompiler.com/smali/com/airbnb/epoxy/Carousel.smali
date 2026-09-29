###### Class com.airbnb.epoxy.Carousel (com.airbnb.epoxy.Carousel)
.class public Lcom/airbnb/epoxy/Carousel;
.super Lcom/airbnb/epoxy/EpoxyRecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/epoxy/Carousel$write;,
        Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;
    }
.end annotation


# static fields
.field private static onSkipToNext:Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;

.field private static onSkipToQueueItem:I


# instance fields
.field private setSessionImpl:F


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 56
    new-instance v0, Lcom/airbnb/epoxy/Carousel$4;

    invoke-direct {v0}, Lcom/airbnb/epoxy/Carousel$4;-><init>()V

    sput-object v0, Lcom/airbnb/epoxy/Carousel;->onSkipToNext:Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;

    const/16 v0, 0x8

    .line 67
    sput v0, Lcom/airbnb/epoxy/Carousel;->onSkipToQueueItem:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 72
    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 76
    invoke-direct {p0, p1, p2}, Lcom/airbnb/epoxy/EpoxyRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 80
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/epoxy/EpoxyRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static MediaDescriptionCompat(Landroid/view/View;)I
    .registers 2

    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_b

    .line 239
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    return p0

    .line 242
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-lez v0, :cond_16

    .line 243
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    return p0

    .line 247
    :cond_16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    .line 248
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    return p0
.end method

.method private static RatingCompat(Landroid/view/View;)I
    .registers 2

    .line 253
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_b

    .line 254
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    return p0

    .line 257
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-lez v0, :cond_16

    .line 258
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    return p0

    .line 262
    :cond_16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    .line 263
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    return p0
.end method

.method private static onFastForward()Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;
    .registers 1

    .line 117
    sget-object v0, Lcom/airbnb/epoxy/Carousel;->onSkipToNext:Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;

    return-object v0
.end method

.method private static onPlayFromMediaId()I
    .registers 1

    .line 295
    sget v0, Lcom/airbnb/epoxy/Carousel;->onSkipToQueueItem:I

    return v0
.end method

.method private read(Z)I
    .registers 5

    const/4 v0, 0x0

    if-eqz p1, :cond_18

    .line 222
    invoke-static {p0}, Lcom/airbnb/epoxy/Carousel;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p1

    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    .line 224
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getClipToPadding()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    :cond_15
    :goto_15
    sub-int/2addr p1, v1

    sub-int/2addr p1, v0

    return p1

    .line 229
    :cond_18
    invoke-static {p0}, Lcom/airbnb/epoxy/Carousel;->RatingCompat(Landroid/view/View;)I

    move-result p1

    .line 230
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    .line 231
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getClipToPadding()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    goto :goto_15
.end method

.method public static setDefaultGlobalSnapHelperFactory(Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;)V
    .registers 1

    .line 129
    sput-object p0, Lcom/airbnb/epoxy/Carousel;->onSkipToNext:Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;

    return-void
.end method

.method public static setDefaultItemSpacingDp(I)V
    .registers 1

    .line 284
    sput p0, Lcom/airbnb/epoxy/Carousel;->onSkipToQueueItem:I

    return-void
.end method


# virtual methods
.method public final AudioAttributesImplApi26Parcelizer(Landroid/view/View;)V
    .registers 5

    .line 193
    iget v0, p0, Lcom/airbnb/epoxy/Carousel;->setSessionImpl:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_40

    .line 194
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 195
    sget v1, Lo/setMaxInputSize$read;->epoxy_recycler_view_child_initial_size_id:I

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 197
    invoke-virtual {p0}, Lcom/airbnb/epoxy/Carousel;->onCommand()Lo/getCurrentTimeline;

    move-result-object p1

    invoke-virtual {p1}, Lo/getCurrentTimeline;->read()I

    move-result p1

    if-lez p1, :cond_26

    int-to-float p1, p1

    .line 201
    iget v1, p0, Lcom/airbnb/epoxy/Carousel;->setSessionImpl:F

    mul-float/2addr p1, v1

    float-to-int p1, p1

    goto :goto_27

    :cond_26
    const/4 p1, 0x0

    .line 204
    :goto_27
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v1

    .line 207
    invoke-direct {p0, v1}, Lcom/airbnb/epoxy/Carousel;->read(Z)I

    move-result v2

    sub-int/2addr v2, p1

    int-to-float p1, v2

    iget p0, p0, Lcom/airbnb/epoxy/Carousel;->setSessionImpl:F

    div-float/2addr p1, p0

    float-to-int p0, p1

    if-eqz v1, :cond_3e

    .line 211
    iput p0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    return-void

    .line 213
    :cond_3e
    iput p0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_40
    return-void
.end method

.method public final MediaBrowserCompatSearchResultReceiver(Landroid/view/View;)V
    .registers 3

    .line 269
    sget p0, Lo/setMaxInputSize$read;->epoxy_recycler_view_child_initial_size_id:I

    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    .line 271
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_1c

    .line 272
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 273
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    iput p0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 274
    sget p0, Lo/setMaxInputSize$read;->epoxy_recycler_view_child_initial_size_id:I

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_1c
    return-void
.end method

.method protected final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 3

    .line 85
    invoke-super {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    .line 87
    invoke-static {}, Lcom/airbnb/epoxy/Carousel;->onPlayFromMediaId()I

    move-result v0

    if-ltz v0, :cond_27

    .line 90
    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setItemSpacingDp(I)V

    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    if-nez v1, :cond_27

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    if-nez v1, :cond_27

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    if-nez v1, :cond_27

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    if-nez v1, :cond_27

    .line 97
    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/Carousel;->setPaddingDp(I)V

    .line 101
    :cond_27
    invoke-static {}, Lcom/airbnb/epoxy/Carousel;->onFastForward()Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;

    move-result-object v0

    if-eqz v0, :cond_37

    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-virtual {v0}, Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;->write()Lo/serializeOzbTUA;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/serializeOzbTUA;->read(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_37
    const/4 v0, 0x0

    .line 107
    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setRemoveAdapterWhenDetachedFromWindow(Z)V

    return-void
.end method

.method public setHasFixedSize(Z)V
    .registers 2

    .line 135
    invoke-super {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setHasFixedSize(Z)V

    return-void
.end method

.method public setInitialPrefetchItemCount(I)V
    .registers 3

    if-ltz p1, :cond_13

    if-nez p1, :cond_5

    const/4 p1, 0x2

    .line 185
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    move-result-object p0

    .line 186
    instance-of v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_12

    .line 187
    check-cast p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(I)V

    :cond_12
    return-void

    .line 179
    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "numItemsToPrefetch must be greater than 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setModels(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo/getCurrentPeriodIndex<",
            "*>;>;)V"
        }
    .end annotation

    .line 505
    invoke-super {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setModels(Ljava/util/List;)V

    return-void
.end method

.method public setNumViewsToShowOnScreen(F)V
    .registers 4

    .line 158
    iput p1, p0, Lcom/airbnb/epoxy/Carousel;->setSessionImpl:F

    float-to-double v0, p1

    .line 159
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/Carousel;->setInitialPrefetchItemCount(I)V

    return-void
.end method

.method public setPadding(Lcom/airbnb/epoxy/Carousel$write;)V
    .registers 7

    const/4 v0, 0x0

    if-nez p1, :cond_7

    .line 331
    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/Carousel;->setPaddingDp(I)V

    return-void

    .line 332
    :cond_7
    iget-object v1, p1, Lcom/airbnb/epoxy/Carousel$write;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

    sget-object v2, Lcom/airbnb/epoxy/Carousel$write$read;->write:Lcom/airbnb/epoxy/Carousel$write$read;

    if-ne v1, v2, :cond_1e

    .line 333
    iget v0, p1, Lcom/airbnb/epoxy/Carousel$write;->write:I

    iget v1, p1, Lcom/airbnb/epoxy/Carousel$write;->MediaBrowserCompatItemReceiver:I

    iget v2, p1, Lcom/airbnb/epoxy/Carousel$write;->AudioAttributesCompatParcelizer:I

    iget v3, p1, Lcom/airbnb/epoxy/Carousel$write;->read:I

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 334
    iget p1, p1, Lcom/airbnb/epoxy/Carousel$write;->IconCompatParcelizer:I

    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setItemSpacingPx(I)V

    return-void

    .line 335
    :cond_1e
    iget-object v1, p1, Lcom/airbnb/epoxy/Carousel$write;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

    sget-object v2, Lcom/airbnb/epoxy/Carousel$write$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

    if-ne v1, v2, :cond_49

    .line 336
    iget v1, p1, Lcom/airbnb/epoxy/Carousel$write;->write:I

    .line 337
    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/Carousel;->RatingCompat(I)I

    move-result v0

    iget v1, p1, Lcom/airbnb/epoxy/Carousel$write;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {p0, v1}, Lcom/airbnb/epoxy/Carousel;->RatingCompat(I)I

    move-result v1

    iget v2, p1, Lcom/airbnb/epoxy/Carousel$write;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p0, v2}, Lcom/airbnb/epoxy/Carousel;->RatingCompat(I)I

    move-result v2

    iget v3, p1, Lcom/airbnb/epoxy/Carousel$write;->read:I

    invoke-virtual {p0, v3}, Lcom/airbnb/epoxy/Carousel;->RatingCompat(I)I

    move-result v3

    .line 336
    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 338
    iget p1, p1, Lcom/airbnb/epoxy/Carousel$write;->IconCompatParcelizer:I

    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/Carousel;->RatingCompat(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setItemSpacingPx(I)V

    return-void

    .line 339
    :cond_49
    iget-object v1, p1, Lcom/airbnb/epoxy/Carousel$write;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

    sget-object v2, Lcom/airbnb/epoxy/Carousel$write$read;->IconCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

    if-ne v1, v2, :cond_73

    .line 340
    iget v1, p1, Lcom/airbnb/epoxy/Carousel$write;->write:I

    .line 341
    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/Carousel;->MediaDescriptionCompat(I)I

    move-result v1

    iget v2, p1, Lcom/airbnb/epoxy/Carousel$write;->MediaBrowserCompatItemReceiver:I

    .line 342
    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/Carousel;->MediaDescriptionCompat(I)I

    move-result v2

    iget v3, p1, Lcom/airbnb/epoxy/Carousel$write;->AudioAttributesCompatParcelizer:I

    .line 343
    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/Carousel;->MediaDescriptionCompat(I)I

    move-result v3

    iget v4, p1, Lcom/airbnb/epoxy/Carousel$write;->read:I

    .line 344
    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/Carousel;->MediaDescriptionCompat(I)I

    move-result v0

    .line 340
    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 345
    iget p1, p1, Lcom/airbnb/epoxy/Carousel$write;->IconCompatParcelizer:I

    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/Carousel;->MediaDescriptionCompat(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setItemSpacingPx(I)V

    :cond_73
    return-void
.end method

.method public setPaddingDp(I)V
    .registers 3

    const/4 v0, -0x1

    if-ne p1, v0, :cond_7

    .line 317
    invoke-static {}, Lcom/airbnb/epoxy/Carousel;->onPlayFromMediaId()I

    move-result p1

    :cond_7
    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/Carousel;->RatingCompat(I)I

    move-result p1

    .line 318
    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 319
    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setItemSpacingPx(I)V

    return-void
.end method

.method public setPaddingRes(I)V
    .registers 2

    .line 304
    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/Carousel;->MediaDescriptionCompat(I)I

    move-result p1

    .line 305
    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 306
    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setItemSpacingPx(I)V

    return-void
.end method

###### Class com.airbnb.epoxy.Carousel.AnonymousClass4 (com.airbnb.epoxy.Carousel$4)
.class final Lcom/airbnb/epoxy/Carousel$4;
.super Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/Carousel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 57
    invoke-direct {p0}, Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;-><init>()V

    return-void
.end method


# virtual methods
.method public final write()Lo/serializeOzbTUA;
    .registers 1

    .line 62
    new-instance p0, Lo/UByteDeserializer;

    invoke-direct {p0}, Lo/UByteDeserializer;-><init>()V

    return-object p0
.end method

###### Class com.airbnb.epoxy.Carousel.RemoteActionCompatParcelizer (com.airbnb.epoxy.Carousel$RemoteActionCompatParcelizer)
.class public abstract Lcom/airbnb/epoxy/Carousel$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/Carousel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 514
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract write()Lo/serializeOzbTUA;
.end method

###### Class com.airbnb.epoxy.Carousel.write (com.airbnb.epoxy.Carousel$write)
.class public Lcom/airbnb/epoxy/Carousel$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/Carousel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "write"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/epoxy/Carousel$write$read;
    }
.end annotation


# instance fields
.field public final AudioAttributesCompatParcelizer:I

.field public final IconCompatParcelizer:I

.field public final MediaBrowserCompatItemReceiver:I

.field public final RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

.field public final read:I

.field public final write:I


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_1d

    .line 471
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne p0, v1, :cond_1d

    .line 475
    check-cast p1, Lcom/airbnb/epoxy/Carousel$write;

    .line 477
    iget p0, p1, Lcom/airbnb/epoxy/Carousel$write;->write:I

    .line 480
    iget p0, p1, Lcom/airbnb/epoxy/Carousel$write;->MediaBrowserCompatItemReceiver:I

    .line 483
    iget p0, p1, Lcom/airbnb/epoxy/Carousel$write;->AudioAttributesCompatParcelizer:I

    .line 486
    iget p0, p1, Lcom/airbnb/epoxy/Carousel$write;->read:I

    .line 489
    iget p0, p1, Lcom/airbnb/epoxy/Carousel$write;->IconCompatParcelizer:I

    return v0

    :cond_1d
    const/4 p0, 0x0

    return p0
.end method

.method public hashCode()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

###### Class com.airbnb.epoxy.Carousel.write.read (com.airbnb.epoxy.Carousel$write$read)
.class final enum Lcom/airbnb/epoxy/Carousel$write$read;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/Carousel$write;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "read"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/airbnb/epoxy/Carousel$write$read;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

.field public static final enum IconCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

.field private static final synthetic RemoteActionCompatParcelizer:[Lcom/airbnb/epoxy/Carousel$write$read;

.field public static final enum write:Lcom/airbnb/epoxy/Carousel$write$read;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 363
    new-instance v0, Lcom/airbnb/epoxy/Carousel$write$read;

    const-string v1, "PX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/airbnb/epoxy/Carousel$write$read;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/airbnb/epoxy/Carousel$write$read;->write:Lcom/airbnb/epoxy/Carousel$write$read;

    .line 364
    new-instance v1, Lcom/airbnb/epoxy/Carousel$write$read;

    const-string v2, "DP"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/airbnb/epoxy/Carousel$write$read;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/airbnb/epoxy/Carousel$write$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

    .line 365
    new-instance v2, Lcom/airbnb/epoxy/Carousel$write$read;

    const-string v3, "RESOURCE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/airbnb/epoxy/Carousel$write$read;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/airbnb/epoxy/Carousel$write$read;->IconCompatParcelizer:Lcom/airbnb/epoxy/Carousel$write$read;

    .line 362
    filled-new-array {v0, v1, v2}, [Lcom/airbnb/epoxy/Carousel$write$read;

    move-result-object v0

    sput-object v0, Lcom/airbnb/epoxy/Carousel$write$read;->RemoteActionCompatParcelizer:[Lcom/airbnb/epoxy/Carousel$write$read;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 362
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/airbnb/epoxy/Carousel$write$read;
    .registers 2

    .line 362
    const-class v0, Lcom/airbnb/epoxy/Carousel$write$read;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/airbnb/epoxy/Carousel$write$read;

    return-object p0
.end method

.method public static values()[Lcom/airbnb/epoxy/Carousel$write$read;
    .registers 1

    .line 362
    sget-object v0, Lcom/airbnb/epoxy/Carousel$write$read;->RemoteActionCompatParcelizer:[Lcom/airbnb/epoxy/Carousel$write$read;

    invoke-virtual {v0}, [Lcom/airbnb/epoxy/Carousel$write$read;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/airbnb/epoxy/Carousel$write$read;

    return-object v0
.end method
