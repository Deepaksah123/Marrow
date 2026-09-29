###### Class android.support.v4.media.RatingCompat (android.support.v4.media.RatingCompat)
.class public final Landroid/support/v4/media/RatingCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/RatingCompat$write;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/RatingCompat;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final AudioAttributesCompatParcelizer:I

.field private RemoteActionCompatParcelizer:Ljava/lang/Object;

.field private final read:F


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 131
    new-instance v0, Landroid/support/v4/media/RatingCompat$3;

    invoke-direct {v0}, Landroid/support/v4/media/RatingCompat$3;-><init>()V

    sput-object v0, Landroid/support/v4/media/RatingCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IF)V
    .registers 3

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput p1, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    .line 111
    iput p2, p0, Landroid/support/v4/media/RatingCompat;->read:F

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(I)Landroid/support/v4/media/RatingCompat;
    .registers 3

    packed-switch p0, :pswitch_data_e

    const/4 p0, 0x0

    return-object p0

    .line 166
    :pswitch_5
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-direct {v0, p0, v1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    return-object v0

    nop

    :pswitch_data_e
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method public static AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/support/v4/media/RatingCompat;
    .registers 5

    const/4 v0, 0x0

    if-eqz p0, :cond_3e

    .line 334
    move-object v1, p0

    check-cast v1, Landroid/media/Rating;

    invoke-static {v1}, Landroid/support/v4/media/RatingCompat$write;->AudioAttributesCompatParcelizer(Landroid/media/Rating;)I

    move-result v2

    .line 336
    invoke-static {v1}, Landroid/support/v4/media/RatingCompat$write;->write(Landroid/media/Rating;)Z

    move-result v3

    if-eqz v3, :cond_38

    packed-switch v2, :pswitch_data_40

    return-object v0

    .line 352
    :pswitch_14
    invoke-static {v1}, Landroid/support/v4/media/RatingCompat$write;->IconCompatParcelizer(Landroid/media/Rating;)F

    move-result v0

    .line 351
    invoke-static {v0}, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer(F)Landroid/support/v4/media/RatingCompat;

    move-result-object v0

    goto :goto_3c

    .line 348
    :pswitch_1d
    invoke-static {v1}, Landroid/support/v4/media/RatingCompat$write;->RemoteActionCompatParcelizer(Landroid/media/Rating;)F

    move-result v0

    .line 347
    invoke-static {v2, v0}, Landroid/support/v4/media/RatingCompat;->read(IF)Landroid/support/v4/media/RatingCompat;

    move-result-object v0

    goto :goto_3c

    .line 342
    :pswitch_26
    invoke-static {v1}, Landroid/support/v4/media/RatingCompat$write;->AudioAttributesImplApi21Parcelizer(Landroid/media/Rating;)Z

    move-result v0

    invoke-static {v0}, Landroid/support/v4/media/RatingCompat;->IconCompatParcelizer(Z)Landroid/support/v4/media/RatingCompat;

    move-result-object v0

    goto :goto_3c

    .line 339
    :pswitch_2f
    invoke-static {v1}, Landroid/support/v4/media/RatingCompat$write;->read(Landroid/media/Rating;)Z

    move-result v0

    invoke-static {v0}, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer(Z)Landroid/support/v4/media/RatingCompat;

    move-result-object v0

    goto :goto_3c

    .line 358
    :cond_38
    invoke-static {v2}, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer(I)Landroid/support/v4/media/RatingCompat;

    move-result-object v0

    .line 360
    :goto_3c
    iput-object p0, v0, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    :cond_3e
    return-object v0

    nop

    :pswitch_data_40
    .packed-switch 0x1
        :pswitch_2f
        :pswitch_26
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_14
    .end packed-switch
.end method

.method public static IconCompatParcelizer(Z)Landroid/support/v4/media/RatingCompat;
    .registers 3

    if-eqz p0, :cond_5

    const/high16 p0, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_5
    const/4 p0, 0x0

    .line 191
    :goto_6
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    return-object v0
.end method

.method public static RemoteActionCompatParcelizer(F)Landroid/support/v4/media/RatingCompat;
    .registers 3

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-ltz v0, :cond_12

    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p0, v0

    if-gtz v0, :cond_12

    .line 242
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    return-object v0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method public static RemoteActionCompatParcelizer(Z)Landroid/support/v4/media/RatingCompat;
    .registers 3

    if-eqz p0, :cond_5

    const/high16 p0, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_5
    const/4 p0, 0x0

    .line 180
    :goto_6
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    return-object v0
.end method

.method public static read(IF)Landroid/support/v4/media/RatingCompat;
    .registers 5

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-eq p0, v0, :cond_11

    const/4 v0, 0x4

    if-eq p0, v0, :cond_e

    const/4 v0, 0x5

    if-eq p0, v0, :cond_b

    return-object v1

    :cond_b
    const/high16 v0, 0x40a00000    # 5.0f

    goto :goto_13

    :cond_e
    const/high16 v0, 0x40800000    # 4.0f

    goto :goto_13

    :cond_11
    const/high16 v0, 0x40400000    # 3.0f

    :goto_13
    const/4 v2, 0x0

    cmpg-float v2, p1, v2

    if-ltz v2, :cond_22

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_22

    .line 227
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    return-object v0

    :cond_22
    return-object v1
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Z
    .registers 4

    .line 271
    iget v0, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_7

    return v1

    .line 274
    :cond_7
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->read:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p0, p0, v0

    if-nez p0, :cond_10

    return v2

    :cond_10
    return v1
.end method

.method public final AudioAttributesImplApi21Parcelizer()Z
    .registers 4

    .line 284
    iget v0, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_7

    return v2

    .line 287
    :cond_7
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->read:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p0, p0, v0

    if-nez p0, :cond_11

    const/4 p0, 0x1

    return p0

    :cond_11
    return v2
.end method

.method public final IconCompatParcelizer()F
    .registers 3

    .line 316
    iget v0, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_e

    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 319
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->read:F

    return p0

    :cond_e
    const/high16 p0, -0x40800000    # -1.0f

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver()Z
    .registers 2

    .line 251
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->read:F

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-ltz p0, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer()F
    .registers 3

    .line 297
    iget v0, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_b

    const/4 v1, 0x4

    if-eq v0, v1, :cond_b

    const/4 v1, 0x5

    if-ne v0, v1, :cond_14

    .line 301
    :cond_b
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 302
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->read:F

    return p0

    :cond_14
    const/high16 p0, -0x40800000    # -1.0f

    return p0
.end method

.method public final describeContents()I
    .registers 1

    .line 122
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    return p0
.end method

.method public final read()Ljava/lang/Object;
    .registers 3

    .line 376
    iget-object v0, p0, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    if-nez v0, :cond_45

    .line 377
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 378
    iget v0, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    packed-switch v0, :pswitch_data_48

    const/4 p0, 0x0

    return-object p0

    .line 392
    :pswitch_11
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->IconCompatParcelizer()F

    move-result v0

    invoke-static {v0}, Landroid/support/v4/media/RatingCompat$write;->write(F)Landroid/media/Rating;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    goto :goto_45

    .line 389
    :pswitch_1c
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer()F

    move-result v1

    .line 388
    invoke-static {v0, v1}, Landroid/support/v4/media/RatingCompat$write;->AudioAttributesCompatParcelizer(IF)Landroid/media/Rating;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    goto :goto_45

    .line 383
    :pswitch_27
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->AudioAttributesImplApi21Parcelizer()Z

    move-result v0

    invoke-static {v0}, Landroid/support/v4/media/RatingCompat$write;->RemoteActionCompatParcelizer(Z)Landroid/media/Rating;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    goto :goto_45

    .line 380
    :pswitch_32
    invoke-virtual {p0}, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer()Z

    move-result v0

    invoke-static {v0}, Landroid/support/v4/media/RatingCompat$write;->AudioAttributesCompatParcelizer(Z)Landroid/media/Rating;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    goto :goto_45

    .line 398
    :cond_3d
    iget v0, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    invoke-static {v0}, Landroid/support/v4/media/RatingCompat$write;->AudioAttributesCompatParcelizer(I)Landroid/media/Rating;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    .line 401
    :cond_45
    :goto_45
    iget-object p0, p0, Landroid/support/v4/media/RatingCompat;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    return-object p0

    :pswitch_data_48
    .packed-switch 0x1
        :pswitch_32
        :pswitch_27
        :pswitch_1c
        :pswitch_1c
        :pswitch_1c
        :pswitch_11
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Rating:style="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " rating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->read:F

    const/4 v1, 0x0

    cmpg-float v1, p0, v1

    if-gez v1, :cond_1b

    const-string p0, "unrated"

    goto :goto_1f

    :cond_1b
    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p0

    :goto_1f
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()I
    .registers 1

    .line 262
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 127
    iget p2, p0, Landroid/support/v4/media/RatingCompat;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 128
    iget p0, p0, Landroid/support/v4/media/RatingCompat;->read:F

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method

###### Class android.support.v4.media.RatingCompat.AnonymousClass3 (android.support.v4.media.RatingCompat$3)
.class Landroid/support/v4/media/RatingCompat$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/RatingCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/RatingCompat;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/RatingCompat;
    .registers 3

    .line 140
    new-instance p0, Landroid/support/v4/media/RatingCompat;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-direct {p0, v0, p1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    return-object p0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 132
    invoke-virtual {p0, p1}, Landroid/support/v4/media/RatingCompat$3;->IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 132
    invoke-virtual {p0, p1}, Landroid/support/v4/media/RatingCompat$3;->read(I)[Landroid/support/v4/media/RatingCompat;

    move-result-object p0

    return-object p0
.end method

.method public read(I)[Landroid/support/v4/media/RatingCompat;
    .registers 2

    .line 145
    new-array p0, p1, [Landroid/support/v4/media/RatingCompat;

    return-object p0
.end method

###### Class android.support.v4.media.RatingCompat.write (android.support.v4.media.RatingCompat$write)
.class Landroid/support/v4/media/RatingCompat$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/RatingCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/media/Rating;)I
    .registers 1

    .line 410
    invoke-virtual {p0}, Landroid/media/Rating;->getRatingStyle()I

    move-result p0

    return p0
.end method

.method static AudioAttributesCompatParcelizer(I)Landroid/media/Rating;
    .registers 1

    .line 460
    invoke-static {p0}, Landroid/media/Rating;->newUnratedRating(I)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method static AudioAttributesCompatParcelizer(IF)Landroid/media/Rating;
    .registers 2

    .line 450
    invoke-static {p0, p1}, Landroid/media/Rating;->newStarRating(IF)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method static AudioAttributesCompatParcelizer(Z)Landroid/media/Rating;
    .registers 1

    .line 440
    invoke-static {p0}, Landroid/media/Rating;->newHeartRating(Z)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method static AudioAttributesImplApi21Parcelizer(Landroid/media/Rating;)Z
    .registers 1

    .line 425
    invoke-virtual {p0}, Landroid/media/Rating;->isThumbUp()Z

    move-result p0

    return p0
.end method

.method static IconCompatParcelizer(Landroid/media/Rating;)F
    .registers 1

    .line 435
    invoke-virtual {p0}, Landroid/media/Rating;->getPercentRating()F

    move-result p0

    return p0
.end method

.method static RemoteActionCompatParcelizer(Landroid/media/Rating;)F
    .registers 1

    .line 430
    invoke-virtual {p0}, Landroid/media/Rating;->getStarRating()F

    move-result p0

    return p0
.end method

.method static RemoteActionCompatParcelizer(Z)Landroid/media/Rating;
    .registers 1

    .line 445
    invoke-static {p0}, Landroid/media/Rating;->newThumbRating(Z)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method static read(Landroid/media/Rating;)Z
    .registers 1

    .line 420
    invoke-virtual {p0}, Landroid/media/Rating;->hasHeart()Z

    move-result p0

    return p0
.end method

.method static write(F)Landroid/media/Rating;
    .registers 1

    .line 455
    invoke-static {p0}, Landroid/media/Rating;->newPercentageRating(F)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method static write(Landroid/media/Rating;)Z
    .registers 1

    .line 415
    invoke-virtual {p0}, Landroid/media/Rating;->isRated()Z

    move-result p0

    return p0
.end method
