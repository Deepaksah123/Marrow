###### Class androidx.core.graphics.drawable.IconCompat (androidx.core.graphics.drawable.IconCompat)
.class public Landroidx/core/graphics/drawable/IconCompat;
.super Landroidx/versionedparcelable/CustomVersionedParcelable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/graphics/drawable/IconCompat$read;,
        Landroidx/core/graphics/drawable/IconCompat$RemoteActionCompatParcelizer;,
        Landroidx/core/graphics/drawable/IconCompat$IconCompatParcelizer;,
        Landroidx/core/graphics/drawable/IconCompat$AudioAttributesCompatParcelizer;
    }
.end annotation


# static fields
.field static final IconCompatParcelizer:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public AudioAttributesCompatParcelizer:I

.field public AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

.field public AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

.field AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

.field public MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field public MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

.field public RatingCompat:I

.field public RemoteActionCompatParcelizer:I

.field public read:[B

.field write:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 203
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Landroidx/core/graphics/drawable/IconCompat;->IconCompatParcelizer:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    .line 354
    invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V

    const/4 v0, -0x1

    .line 155
    iput v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v0, 0x0

    .line 173
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    .line 178
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    const/4 v1, 0x0

    .line 186
    iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    .line 193
    iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    .line 199
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    .line 204
    sget-object v1, Landroidx/core/graphics/drawable/IconCompat;->IconCompatParcelizer:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    .line 208
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(I)V
    .registers 4

    .line 357
    invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V

    const/4 v0, 0x0

    .line 173
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    .line 178
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    const/4 v1, 0x0

    .line 186
    iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    .line 193
    iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    .line 199
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    .line 204
    sget-object v1, Landroidx/core/graphics/drawable/IconCompat;->IconCompatParcelizer:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    .line 208
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 358
    iput p1, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;
    .registers 3

    .line 227
    invoke-static {p0}, Lo/configureFromStringCreator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0, p1}, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method

.method public static AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 3

    .line 967
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->RemoteActionCompatParcelizer(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_f

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->read(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_f

    const/4 p0, 0x0

    return-object p0

    .line 970
    :cond_f
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->IconCompatParcelizer(Ljava/lang/Object;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method

.method public static AudioAttributesCompatParcelizer(Landroid/os/Bundle;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 5

    .line 908
    const-string v0, "type"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 909
    new-instance v1, Landroidx/core/graphics/drawable/IconCompat;

    invoke-direct {v1, v0}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 910
    const-string v2, "int1"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    .line 911
    const-string v2, "int2"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    .line 912
    const-string v2, "string1"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 913
    const-string v2, "tint_list"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_33

    .line 914
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/content/res/ColorStateList;

    iput-object v2, v1, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    .line 916
    :cond_33
    const-string v2, "tint_mode"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_45

    .line 918
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 917
    invoke-static {v2}, Landroid/graphics/PorterDuff$Mode;->valueOf(Ljava/lang/String;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    iput-object v2, v1, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    .line 920
    :cond_45
    const-string v2, "obj"

    packed-switch v0, :pswitch_data_62

    :pswitch_4a
    const/4 p0, 0x0

    return-object p0

    .line 932
    :pswitch_4c
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p0

    iput-object p0, v1, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-object v1

    .line 929
    :pswitch_53
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-object v1

    .line 924
    :pswitch_5a
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    iput-object p0, v1, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-object v1

    nop

    :pswitch_data_62
    .packed-switch -0x1
        :pswitch_5a
        :pswitch_4a
        :pswitch_5a
        :pswitch_53
        :pswitch_4c
        :pswitch_53
        :pswitch_5a
        :pswitch_53
    .end packed-switch
.end method

.method private static AudioAttributesCompatParcelizer(I)Ljava/lang/String;
    .registers 1

    packed-switch p0, :pswitch_data_18

    .line 899
    const-string p0, "UNKNOWN"

    return-object p0

    .line 898
    :pswitch_6
    const-string p0, "URI_MASKABLE"

    return-object p0

    .line 894
    :pswitch_9
    const-string p0, "BITMAP_MASKABLE"

    return-object p0

    .line 897
    :pswitch_c
    const-string p0, "URI"

    return-object p0

    .line 895
    :pswitch_f
    const-string p0, "DATA"

    return-object p0

    .line 896
    :pswitch_12
    const-string p0, "RESOURCE"

    return-object p0

    .line 893
    :pswitch_15
    const-string p0, "BITMAP"

    return-object p0

    :pswitch_data_18
    .packed-switch 0x1
        :pswitch_15
        :pswitch_12
        :pswitch_f
        :pswitch_c
        :pswitch_9
        :pswitch_6
    .end packed-switch
.end method

.method public static RemoteActionCompatParcelizer(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;
    .registers 5

    .line 237
    invoke-static {p1}, Lo/configureFromStringCreator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_23

    .line 241
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 242
    iput p2, v0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    if-eqz p0, :cond_1e

    .line 245
    :try_start_f
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;
    :try_end_15
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_f .. :try_end_15} :catch_16

    goto :goto_20

    .line 247
    :catch_16
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Icon resource cannot be found"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 250
    :cond_1e
    iput-object p1, v0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    .line 252
    :goto_20
    iput-object p1, v0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    return-object v0

    .line 239
    :cond_23
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Drawable resource ID must not be 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static RemoteActionCompatParcelizer(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 1

    .line 957
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->IconCompatParcelizer(Ljava/lang/Object;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method

.method public static RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 3

    .line 307
    invoke-static {p0}, Lo/configureFromStringCreator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 309
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-object v0
.end method

.method static read(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    .registers 11

    .line 982
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 983
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 982
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f2aaaab

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 985
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 986
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 987
    new-instance v3, Landroid/graphics/Paint;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    int-to-float v4, v0

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float/2addr v5, v4

    const v6, 0x3f6aaaab

    mul-float/2addr v6, v5

    if-eqz p1, :cond_4d

    const p1, 0x3c2aaaab

    mul-float/2addr p1, v4

    const/4 v7, 0x0

    .line 995
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setColor(I)V

    const v7, 0x3caaaaab

    mul-float/2addr v4, v7

    const/high16 v7, 0x3d000000    # 0.03125f

    const/4 v8, 0x0

    .line 996
    invoke-virtual {v3, p1, v8, v4, v7}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 997
    invoke-virtual {v2, v5, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const/high16 v4, 0x1e000000

    .line 1000
    invoke-virtual {v3, p1, v8, v8, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 1001
    invoke-virtual {v2, v5, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1002
    invoke-virtual {v3}, Landroid/graphics/Paint;->clearShadowLayer()V

    :cond_4d
    const/high16 p1, -0x1000000

    .line 1006
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1007
    new-instance p1, Landroid/graphics/BitmapShader;

    sget-object v4, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {p1, p0, v4, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 1009
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 1010
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    sub-int/2addr v7, v0

    neg-int v7, v7

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    .line 1011
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p0

    sub-int/2addr p0, v0

    neg-int p0, p0

    int-to-float p0, p0

    div-float/2addr p0, v8

    .line 1010
    invoke-virtual {v4, v7, p0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 1012
    invoke-virtual {p1, v4}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 1013
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1014
    invoke-virtual {v2, v5, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const/4 p0, 0x0

    .line 1016
    invoke-virtual {v2, p0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    return-object v1
.end method

.method public static read(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 3

    .line 262
    invoke-static {p0}, Lo/configureFromStringCreator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 264
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-object v0
.end method

.method public static read(Landroid/net/Uri;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 1

    .line 346
    invoke-static {p0}, Lo/configureFromStringCreator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->write(Ljava/lang/String;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method

.method public static write(Landroid/net/Uri;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 1

    .line 320
    invoke-static {p0}, Lo/configureFromStringCreator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method

.method public static write(Ljava/lang/String;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 3

    .line 332
    invoke-static {p0}, Lo/configureFromStringCreator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 334
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()Landroid/graphics/Bitmap;
    .registers 4

    .line 429
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_10

    .line 430
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    instance-of v0, p0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_e

    .line 431
    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0

    :cond_e
    const/4 p0, 0x0

    return-object p0

    :cond_10
    const/4 v1, 0x1

    if-ne v0, v1, :cond_18

    .line 436
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0

    :cond_18
    const/4 v2, 0x5

    if-ne v0, v2, :cond_24

    .line 438
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/Bitmap;

    invoke-static {p0, v1}, Landroidx/core/graphics/drawable/IconCompat;->read(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    .line 440
    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called getBitmap() on "

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public AudioAttributesCompatParcelizer(Landroid/content/Context;)Landroid/graphics/drawable/Icon;
    .registers 2

    .line 510
    invoke-static {p0, p1}, Landroidx/core/graphics/drawable/IconCompat$read;->write(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p0

    return-object p0
.end method

.method public AudioAttributesImplApi26Parcelizer()Landroid/os/Bundle;
    .registers 4

    .line 735
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 736
    iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const-string v2, "obj"

    packed-switch v1, :pswitch_data_68

    .line 754
    :pswitch_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid icon"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 751
    :pswitch_14
    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast v1, [B

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    goto :goto_33

    .line 748
    :pswitch_1c
    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_33

    .line 739
    :pswitch_24
    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_33

    .line 743
    :pswitch_2c
    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 756
    :goto_33
    const-string v1, "type"

    iget v2, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 757
    const-string v1, "int1"

    iget v2, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 758
    const-string v1, "int2"

    iget v2, p0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 759
    const-string v1, "string1"

    iget-object v2, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 760
    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_58

    .line 761
    const-string v2, "tint_list"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 763
    :cond_58
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    sget-object v1, Landroidx/core/graphics/drawable/IconCompat;->IconCompatParcelizer:Landroid/graphics/PorterDuff$Mode;

    if-eq p0, v1, :cond_67

    .line 764
    const-string v1, "tint_mode"

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_67
    return-object v0

    :pswitch_data_68
    .packed-switch -0x1
        :pswitch_2c
        :pswitch_c
        :pswitch_24
        :pswitch_1c
        :pswitch_14
        :pswitch_1c
        :pswitch_24
        :pswitch_1c
    .end packed-switch
.end method

.method public AudioAttributesImplBaseParcelizer()V
    .registers 5

    .line 850
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/PorterDuff$Mode;->valueOf(Ljava/lang/String;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    .line 851
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_5e

    :pswitch_e
    return-void

    .line 886
    :pswitch_f
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-void

    .line 874
    :pswitch_14
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    const-string v3, "UTF-16"

    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    .line 879
    iget v2, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_3a

    .line 880
    iget-object v2, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    if-nez v2, :cond_3a

    .line 881
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    const-string v2, ":"

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v1

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    :cond_3a
    return-void

    .line 861
    :pswitch_3b
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    if-eqz v0, :cond_42

    .line 862
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-void

    .line 865
    :cond_42
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    const/4 v2, 0x3

    .line 866
    iput v2, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    .line 867
    iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    .line 868
    array-length v0, v0

    iput v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    return-void

    .line 853
    :pswitch_4f
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    if-eqz v0, :cond_56

    .line 854
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-void

    .line 856
    :cond_56
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid icon"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_5e
    .packed-switch -0x1
        :pswitch_4f
        :pswitch_e
        :pswitch_3b
        :pswitch_14
        :pswitch_f
        :pswitch_14
        :pswitch_3b
        :pswitch_14
    .end packed-switch
.end method

.method public IconCompatParcelizer()I
    .registers 3

    .line 410
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_c

    .line 411
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->read(Ljava/lang/Object;)I

    move-result p0

    return p0

    :cond_c
    const/4 v1, 0x2

    if-ne v0, v1, :cond_12

    .line 416
    iget p0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    return p0

    .line 414
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called getResId() on "

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public IconCompatParcelizer(Z)V
    .registers 5

    .line 813
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 814
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const-string v1, "UTF-16"

    packed-switch v0, :pswitch_data_68

    :pswitch_f
    return-void

    .line 837
    :pswitch_10
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    iput-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    return-void

    .line 843
    :pswitch_21
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p1, [B

    iput-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    return-void

    .line 840
    :pswitch_28
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    iput-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    return-void

    :pswitch_37
    if-eqz p1, :cond_50

    .line 827
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    .line 828
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 829
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x5a

    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 830
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    iput-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    return-void

    .line 832
    :cond_50
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p1, Landroid/os/Parcelable;

    iput-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    return-void

    :pswitch_57
    if-nez p1, :cond_60

    .line 821
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p1, Landroid/os/Parcelable;

    iput-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    return-void

    .line 818
    :cond_60
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t serialize Icon created with IconCompat#createFromIcon"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_68
    .packed-switch -0x1
        :pswitch_57
        :pswitch_f
        :pswitch_37
        :pswitch_28
        :pswitch_21
        :pswitch_10
        :pswitch_37
        :pswitch_10
    .end packed-switch
.end method

.method public MediaBrowserCompatCustomActionResultReceiver()Landroid/graphics/drawable/Icon;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 499
    invoke-virtual {p0, v0}, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p0

    return-object p0
.end method

.method public RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 4

    .line 383
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_c

    .line 384
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->write(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_c
    const/4 v2, 0x2

    if-ne v0, v2, :cond_2a

    .line 392
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    if-eqz v0, :cond_1c

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1c

    .line 397
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    return-object p0

    .line 393
    :cond_1c
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    const-string v0, ":"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    return-object p0

    .line 387
    :cond_2a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called getResPackage() on "

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public read()I
    .registers 3

    .line 369
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_c

    .line 370
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->RemoteActionCompatParcelizer(Ljava/lang/Object;)I

    move-result p0

    return p0

    :cond_c
    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    .line 771
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_c

    .line 772
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 774
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Icon(typ="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    invoke-static {v1}, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    packed-switch v1, :pswitch_data_b4

    goto :goto_8b

    .line 797
    :pswitch_22
    const-string v1, " uri="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_8b

    .line 790
    :pswitch_2d
    const-string v1, " len="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 791
    iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    if-eqz v1, :cond_8b

    .line 792
    const-string v1, " off="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_8b

    .line 784
    :pswitch_46
    const-string v1, " pkg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 785
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    const-string v1, " id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->IconCompatParcelizer()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "0x%08x"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8b

    .line 778
    :pswitch_6b
    const-string v1, " size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    .line 779
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 780
    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    .line 781
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 800
    :cond_8b
    :goto_8b
    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_99

    .line 801
    const-string v1, " tint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 804
    :cond_99
    iget-object v1, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    sget-object v2, Landroidx/core/graphics/drawable/IconCompat;->IconCompatParcelizer:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, v2, :cond_a9

    .line 805
    const-string v1, " mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 807
    :cond_a9
    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_b4
    .packed-switch 0x1
        :pswitch_6b
        :pswitch_46
        :pswitch_2d
        :pswitch_22
        :pswitch_6b
        :pswitch_22
    .end packed-switch
.end method

.method public write()Landroid/net/Uri;
    .registers 3

    .line 452
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_c

    .line 453
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_c
    const/4 v1, 0x4

    if-eq v0, v1, :cond_23

    const/4 v1, 0x6

    if-ne v0, v1, :cond_13

    goto :goto_23

    .line 456
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called getUri() on "

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 458
    :cond_23
    :goto_23
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public write(Landroid/content/Context;)Ljava/io/InputStream;
    .registers 5

    .line 631
    invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->write()Landroid/net/Uri;

    move-result-object v0

    .line 632
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    .line 633
    const-string v2, "content"

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    .line 634
    const-string v2, "file"

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    .line 642
    :try_start_18
    new-instance p1, Ljava/io/File;

    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance p0, Ljava/io/FileInputStream;

    invoke-direct {p0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_26
    .catch Ljava/io/FileNotFoundException; {:try_start_18 .. :try_end_26} :catch_27

    return-object p0

    .line 644
    :catch_27
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_37

    .line 636
    :cond_2b
    :try_start_2b
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_33} :catch_34

    return-object p0

    .line 638
    :catch_34
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :goto_37
    const/4 p0, 0x0

    return-object p0
.end method

###### Class androidx.core.graphics.drawable.IconCompat.AudioAttributesCompatParcelizer (androidx.core.graphics.drawable.IconCompat$AudioAttributesCompatParcelizer)
.class Landroidx/core/graphics/drawable/IconCompat$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/graphics/drawable/IconCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# direct methods
.method static RemoteActionCompatParcelizer(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;
    .registers 1

    .line 1066
    invoke-static {p0}, Landroid/graphics/drawable/Icon;->createWithAdaptiveBitmapContentUri(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.core.graphics.drawable.IconCompat.IconCompatParcelizer (androidx.core.graphics.drawable.IconCompat$IconCompatParcelizer)
.class Landroidx/core/graphics/drawable/IconCompat$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/graphics/drawable/IconCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Ljava/lang/Object;)I
    .registers 1

    .line 1031
    check-cast p0, Landroid/graphics/drawable/Icon;

    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getType()I

    move-result p0

    return p0
.end method

.method static IconCompatParcelizer(Ljava/lang/Object;)Landroid/net/Uri;
    .registers 1

    .line 1039
    check-cast p0, Landroid/graphics/drawable/Icon;

    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getUri()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method static RemoteActionCompatParcelizer(Ljava/lang/Object;)I
    .registers 1

    .line 1035
    check-cast p0, Landroid/graphics/drawable/Icon;

    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResId()I

    move-result p0

    return p0
.end method

.method static write(Ljava/lang/Object;)Ljava/lang/String;
    .registers 1

    .line 1027
    check-cast p0, Landroid/graphics/drawable/Icon;

    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResPackage()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.core.graphics.drawable.IconCompat.RemoteActionCompatParcelizer (androidx.core.graphics.drawable.IconCompat$RemoteActionCompatParcelizer)
.class Landroidx/core/graphics/drawable/IconCompat$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/graphics/drawable/IconCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    .registers 1

    .line 1055
    invoke-static {p0}, Landroid/graphics/drawable/Icon;->createWithAdaptiveBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.core.graphics.drawable.IconCompat.read (androidx.core.graphics.drawable.IconCompat$read)
.class Landroidx/core/graphics/drawable/IconCompat$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/graphics/drawable/IconCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/net/Uri;
    .registers 1

    .line 1208
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$IconCompatParcelizer;->IconCompatParcelizer(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method static IconCompatParcelizer(Ljava/lang/Object;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 3

    .line 1156
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->RemoteActionCompatParcelizer(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_28

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1f

    const/4 v1, 0x6

    if-eq v0, v1, :cond_16

    .line 1164
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 1165
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    return-object v0

    .line 1162
    :cond_16
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->read(Landroid/net/Uri;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0

    .line 1160
    :cond_1f
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->write(Landroid/net/Uri;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0

    .line 1158
    :cond_28
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->write(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$read;->read(Ljava/lang/Object;)I

    move-result p0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0}, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method

.method static RemoteActionCompatParcelizer(Ljava/lang/Object;)I
    .registers 1

    .line 1107
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method static read(Ljava/lang/Object;)I
    .registers 1

    .line 1181
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method static write(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;
    .registers 4

    .line 1227
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    packed-switch v0, :pswitch_data_aa

    .line 1275
    :pswitch_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unknown type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1253
    :pswitch_d
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1d

    .line 1254
    invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->write()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto/16 :goto_90

    :cond_1d
    if-eqz p1, :cond_46

    .line 1262
    invoke-virtual {p0, p1}, Landroidx/core/graphics/drawable/IconCompat;->write(Landroid/content/Context;)Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_2e

    .line 1268
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_90

    .line 1264
    :cond_2e
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Cannot load adaptive icon from uri: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1265
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->write()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1258
    :cond_46
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Context is required to resolve the file uri of the icon: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1260
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->write()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1236
    :pswitch_5e
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_90

    .line 1250
    :pswitch_67
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/graphics/drawable/Icon;->createWithContentUri(Ljava/lang/String;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_90

    .line 1246
    :pswitch_70
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p1, [B

    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    invoke-static {p1, v0, v1}, Landroid/graphics/drawable/Icon;->createWithData([BII)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_90

    .line 1243
    :pswitch_7d
    invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    invoke-static {p1, v0}, Landroid/graphics/drawable/Icon;->createWithResource(Ljava/lang/String;I)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_90

    .line 1232
    :pswitch_88
    iget-object p1, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {p1}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    .line 1277
    :goto_90
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_99

    .line 1278
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Icon;->setTintList(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;

    .line 1280
    :cond_99
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    sget-object v1, Landroidx/core/graphics/drawable/IconCompat;->IconCompatParcelizer:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, v1, :cond_a4

    .line 1281
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplBaseParcelizer:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Icon;->setTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;

    :cond_a4
    return-object p1

    .line 1230
    :pswitch_a5
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->write:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/drawable/Icon;

    return-object p0

    :pswitch_data_aa
    .packed-switch -0x1
        :pswitch_a5
        :pswitch_5
        :pswitch_88
        :pswitch_7d
        :pswitch_70
        :pswitch_67
        :pswitch_5e
        :pswitch_d
    .end packed-switch
.end method

.method static write(Ljava/lang/Object;)Ljava/lang/String;
    .registers 1

    .line 1134
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat$IconCompatParcelizer;->write(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
