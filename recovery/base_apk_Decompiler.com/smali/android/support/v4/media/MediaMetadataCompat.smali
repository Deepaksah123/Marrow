###### Class android.support.v4.media.MediaMetadataCompat (android.support.v4.media.MediaMetadataCompat)
.class public final Landroid/support/v4/media/MediaMetadataCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaMetadataCompat$read;
    }
.end annotation


# static fields
.field static final AudioAttributesCompatParcelizer:Lo/setTitleOptional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/setTitleOptional<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/MediaMetadataCompat;",
            ">;"
        }
    .end annotation
.end field

.field private static final IconCompatParcelizer:[Ljava/lang/String;

.field private static final RemoteActionCompatParcelizer:[Ljava/lang/String;

.field private static final read:[Ljava/lang/String;


# instance fields
.field private AudioAttributesImplApi21Parcelizer:Landroid/media/MediaMetadata;

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/support/v4/media/MediaDescriptionCompat;

.field final write:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .registers 16

    .line 299
    new-instance v0, Lo/setTitleOptional;

    invoke-direct {v0}, Lo/setTitleOptional;-><init>()V

    sput-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    const/4 v1, 0x1

    .line 300
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "android.media.metadata.TITLE"

    invoke-virtual {v0, v2, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    const-string v2, "android.media.metadata.ARTIST"

    invoke-virtual {v0, v2, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    .line 302
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "android.media.metadata.DURATION"

    invoke-virtual {v0, v3, v2}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    const-string v3, "android.media.metadata.ALBUM"

    invoke-virtual {v0, v3, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    const-string v3, "android.media.metadata.AUTHOR"

    invoke-virtual {v0, v3, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    const-string v3, "android.media.metadata.WRITER"

    invoke-virtual {v0, v3, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    const-string v3, "android.media.metadata.COMPOSER"

    invoke-virtual {v0, v3, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    const-string v3, "android.media.metadata.COMPILATION"

    invoke-virtual {v0, v3, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    const-string v3, "android.media.metadata.DATE"

    invoke-virtual {v0, v3, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    const-string v3, "android.media.metadata.YEAR"

    invoke-virtual {v0, v3, v2}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    const-string v3, "android.media.metadata.GENRE"

    invoke-virtual {v0, v3, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    const-string v3, "android.media.metadata.TRACK_NUMBER"

    invoke-virtual {v0, v3, v2}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    const-string v3, "android.media.metadata.NUM_TRACKS"

    invoke-virtual {v0, v3, v2}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    const-string v3, "android.media.metadata.DISC_NUMBER"

    invoke-virtual {v0, v3, v2}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    const-string v3, "android.media.metadata.ALBUM_ARTIST"

    invoke-virtual {v0, v3, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x2

    .line 315
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "android.media.metadata.ART"

    invoke-virtual {v0, v4, v3}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    const-string v5, "android.media.metadata.ART_URI"

    invoke-virtual {v0, v5, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    const-string v6, "android.media.metadata.ALBUM_ART"

    invoke-virtual {v0, v6, v3}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    const-string v7, "android.media.metadata.ALBUM_ART_URI"

    invoke-virtual {v0, v7, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x3

    .line 319
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "android.media.metadata.USER_RATING"

    invoke-virtual {v0, v9, v8}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    const-string v9, "android.media.metadata.RATING"

    invoke-virtual {v0, v9, v8}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    const-string v8, "android.media.metadata.DISPLAY_TITLE"

    invoke-virtual {v0, v8, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    const-string v8, "android.media.metadata.DISPLAY_SUBTITLE"

    invoke-virtual {v0, v8, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    const-string v8, "android.media.metadata.DISPLAY_DESCRIPTION"

    invoke-virtual {v0, v8, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    const-string v8, "android.media.metadata.DISPLAY_ICON"

    invoke-virtual {v0, v8, v3}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    const-string v3, "android.media.metadata.DISPLAY_ICON_URI"

    invoke-virtual {v0, v3, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    const-string v9, "android.media.metadata.MEDIA_ID"

    invoke-virtual {v0, v9, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    const-string v9, "android.media.metadata.BT_FOLDER_TYPE"

    invoke-virtual {v0, v9, v2}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    const-string v9, "android.media.metadata.MEDIA_URI"

    invoke-virtual {v0, v9, v1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    const-string v1, "android.media.metadata.ADVERTISEMENT"

    invoke-virtual {v0, v1, v2}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    const-string v1, "android.media.metadata.DOWNLOAD_STATUS"

    invoke-virtual {v0, v1, v2}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    const-string v9, "android.media.metadata.TITLE"

    const-string v10, "android.media.metadata.ARTIST"

    const-string v11, "android.media.metadata.ALBUM"

    const-string v12, "android.media.metadata.ALBUM_ARTIST"

    const-string v13, "android.media.metadata.WRITER"

    const-string v14, "android.media.metadata.AUTHOR"

    const-string v15, "android.media.metadata.COMPOSER"

    filled-new-array/range {v9 .. v15}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/v4/media/MediaMetadataCompat;->IconCompatParcelizer:[Ljava/lang/String;

    .line 343
    filled-new-array {v8, v4, v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/v4/media/MediaMetadataCompat;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    .line 349
    filled-new-array {v3, v5, v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/v4/media/MediaMetadataCompat;->read:[Ljava/lang/String;

    .line 634
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat$4;

    invoke-direct {v0}, Landroid/support/v4/media/MediaMetadataCompat$4;-><init>()V

    sput-object v0, Landroid/support/v4/media/MediaMetadataCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;)V
    .registers 3

    .line 359
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 360
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    .line 361
    invoke-static {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 364
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 365
    const-class v0, Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    return-void
.end method

.method public static read(Ljava/lang/Object;)Landroid/support/v4/media/MediaMetadataCompat;
    .registers 3

    if-eqz p0, :cond_1d

    .line 601
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 602
    check-cast p0, Landroid/media/MediaMetadata;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/media/MediaMetadata;->writeToParcel(Landroid/os/Parcel;I)V

    .line 603
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 604
    sget-object v1, Landroid/support/v4/media/MediaMetadataCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/MediaMetadataCompat;

    .line 605
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 606
    iput-object p0, v1, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesImplApi21Parcelizer:Landroid/media/MediaMetadata;

    return-object v1

    :cond_1d
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/String;)J
    .registers 4

    .line 414
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public final AudioAttributesCompatParcelizer()Ljava/util/Set;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 573
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public final IconCompatParcelizer(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .registers 2

    .line 453
    :try_start_0
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_8} :catch_9

    return-object p0

    :catch_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/lang/Object;
    .registers 3

    .line 624
    iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesImplApi21Parcelizer:Landroid/media/MediaMetadata;

    if-nez v0, :cond_1c

    .line 625
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x0

    .line 626
    invoke-virtual {p0, v0, v1}, Landroid/support/v4/media/MediaMetadataCompat;->writeToParcel(Landroid/os/Parcel;I)V

    .line 627
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 628
    sget-object v1, Landroid/media/MediaMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/MediaMetadata;

    iput-object v1, p0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesImplApi21Parcelizer:Landroid/media/MediaMetadata;

    .line 629
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 631
    :cond_1c
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesImplApi21Parcelizer:Landroid/media/MediaMetadata;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Landroid/os/Bundle;
    .registers 2

    .line 583
    new-instance v0, Landroid/os/Bundle;

    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    invoke-direct {v0, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final RemoteActionCompatParcelizer(Ljava/lang/String;)Z
    .registers 2

    .line 375
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()I
    .registers 1

    .line 564
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    invoke-virtual {p0}, Landroid/os/Bundle;->size()I

    move-result p0

    return p0
.end method

.method public final read(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 399
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 401
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method

.method public final write()Landroid/support/v4/media/MediaDescriptionCompat;
    .registers 11

    .line 467
    iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->MediaBrowserCompatCustomActionResultReceiver:Landroid/support/v4/media/MediaDescriptionCompat;

    if-eqz v0, :cond_5

    return-object v0

    .line 471
    :cond_5
    const-string v0, "android.media.metadata.MEDIA_ID"

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaMetadataCompat;->read(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    .line 473
    new-array v2, v1, [Ljava/lang/CharSequence;

    .line 478
    const-string v3, "android.media.metadata.DISPLAY_TITLE"

    invoke-virtual {p0, v3}, Landroid/support/v4/media/MediaMetadataCompat;->write(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    .line 479
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v4, :cond_30

    .line 482
    aput-object v3, v2, v7

    .line 483
    const-string v1, "android.media.metadata.DISPLAY_SUBTITLE"

    invoke-virtual {p0, v1}, Landroid/support/v4/media/MediaMetadataCompat;->write(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    aput-object v1, v2, v6

    .line 484
    const-string v1, "android.media.metadata.DISPLAY_DESCRIPTION"

    invoke-virtual {p0, v1}, Landroid/support/v4/media/MediaMetadataCompat;->write(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    aput-object v1, v2, v5

    goto :goto_4c

    :cond_30
    move v3, v7

    move v4, v3

    :goto_32
    if-ge v3, v1, :cond_4c

    .line 489
    sget-object v8, Landroid/support/v4/media/MediaMetadataCompat;->IconCompatParcelizer:[Ljava/lang/String;

    array-length v9, v8

    if-ge v4, v9, :cond_4c

    .line 490
    aget-object v8, v8, v4

    invoke-virtual {p0, v8}, Landroid/support/v4/media/MediaMetadataCompat;->write(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v8

    .line 491
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_49

    .line 493
    aput-object v8, v2, v3

    add-int/lit8 v3, v3, 0x1

    :cond_49
    add-int/lit8 v4, v4, 0x1

    goto :goto_32

    :cond_4c
    :goto_4c
    move v1, v7

    .line 499
    :goto_4d
    sget-object v3, Landroid/support/v4/media/MediaMetadataCompat;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    array-length v4, v3

    const/4 v8, 0x0

    if-ge v1, v4, :cond_5e

    .line 500
    aget-object v3, v3, v1

    invoke-virtual {p0, v3}, Landroid/support/v4/media/MediaMetadataCompat;->IconCompatParcelizer(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    if-nez v3, :cond_5f

    add-int/lit8 v1, v1, 0x1

    goto :goto_4d

    :cond_5e
    move-object v3, v8

    :cond_5f
    move v1, v7

    .line 508
    :goto_60
    sget-object v4, Landroid/support/v4/media/MediaMetadataCompat;->read:[Ljava/lang/String;

    array-length v9, v4

    if-ge v1, v9, :cond_79

    .line 509
    aget-object v4, v4, v1

    invoke-virtual {p0, v4}, Landroid/support/v4/media/MediaMetadataCompat;->read(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 510
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_76

    .line 511
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    goto :goto_7a

    :cond_76
    add-int/lit8 v1, v1, 0x1

    goto :goto_60

    :cond_79
    move-object v1, v8

    .line 517
    :goto_7a
    const-string v4, "android.media.metadata.MEDIA_URI"

    invoke-virtual {p0, v4}, Landroid/support/v4/media/MediaMetadataCompat;->read(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 518
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_8a

    .line 519
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 522
    :cond_8a
    new-instance v4, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    invoke-direct {v4}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;-><init>()V

    .line 523
    invoke-virtual {v4, v0}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 524
    aget-object v0, v2, v7

    invoke-virtual {v4, v0}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 525
    aget-object v0, v2, v6

    invoke-virtual {v4, v0}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 526
    aget-object v0, v2, v5

    invoke-virtual {v4, v0}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 527
    invoke-virtual {v4, v3}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->read(Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 528
    invoke-virtual {v4, v1}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 529
    invoke-virtual {v4, v8}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->write(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 531
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 532
    iget-object v1, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    const-string v2, "android.media.metadata.BT_FOLDER_TYPE"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c2

    .line 534
    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;)J

    move-result-wide v1

    .line 533
    const-string v3, "android.media.extra.BT_FOLDER_TYPE"

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 536
    :cond_c2
    iget-object v1, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    const-string v2, "android.media.metadata.DOWNLOAD_STATUS"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d5

    .line 538
    invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;)J

    move-result-wide v1

    .line 537
    const-string v3, "android.media.extra.DOWNLOAD_STATUS"

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 540
    :cond_d5
    invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_de

    .line 541
    invoke-virtual {v4, v0}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 543
    :cond_de
    invoke-virtual {v4}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->read()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->MediaBrowserCompatCustomActionResultReceiver:Landroid/support/v4/media/MediaDescriptionCompat;

    return-object v0
.end method

.method public final write(Ljava/lang/String;)Ljava/lang/CharSequence;
    .registers 2

    .line 387
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 555
    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat;->write:Landroid/os/Bundle;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method

###### Class android.support.v4.media.MediaMetadataCompat.AnonymousClass4 (android.support.v4.media.MediaMetadataCompat$4)
.class Landroid/support/v4/media/MediaMetadataCompat$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaMetadataCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/MediaMetadataCompat;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 635
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/MediaMetadataCompat;
    .registers 2

    .line 638
    new-instance p0, Landroid/support/v4/media/MediaMetadataCompat;

    invoke-direct {p0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    return-object p0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 635
    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaMetadataCompat$4;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 635
    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaMetadataCompat$4;->read(I)[Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method

.method public read(I)[Landroid/support/v4/media/MediaMetadataCompat;
    .registers 2

    .line 643
    new-array p0, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    return-object p0
.end method

###### Class android.support.v4.media.MediaMetadataCompat.read (android.support.v4.media.MediaMetadataCompat$read)
.class public final Landroid/support/v4/media/MediaMetadataCompat$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaMetadataCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "read"
.end annotation


# instance fields
.field private final read:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 658
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 659
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat$read;->read:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$read;
    .registers 5

    .line 851
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 852
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_18

    goto :goto_31

    .line 853
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "The "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " key cannot be used to put a Bitmap"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 857
    :cond_31
    :goto_31
    iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat$read;->read:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/support/v4/media/RatingCompat;)Landroid/support/v4/media/MediaMetadataCompat$read;
    .registers 5

    .line 816
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 817
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_18

    goto :goto_31

    .line 818
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "The "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " key cannot be used to put a Rating"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 825
    :cond_31
    :goto_31
    iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat$read;->read:Landroid/os/Bundle;

    invoke-virtual {p2}, Landroid/support/v4/media/RatingCompat;->read()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Parcelable;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaMetadataCompat$read;
    .registers 5

    .line 725
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 726
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_18

    goto :goto_31

    .line 727
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "The "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " key cannot be used to put a CharSequence"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 731
    :cond_31
    :goto_31
    iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat$read;->read:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer()Landroid/support/v4/media/MediaMetadataCompat;
    .registers 2

    .line 867
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    iget-object p0, p0, Landroid/support/v4/media/MediaMetadataCompat$read;->read:Landroid/os/Bundle;

    invoke-direct {v0, p0}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final RemoteActionCompatParcelizer(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$read;
    .registers 5

    .line 792
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 793
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-nez v0, :cond_17

    goto :goto_30

    .line 794
    :cond_17
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "The "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " key cannot be used to put a long"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 798
    :cond_30
    :goto_30
    iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat$read;->read:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$read;
    .registers 5

    .line 762
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 763
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_18

    goto :goto_31

    .line 764
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "The "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " key cannot be used to put a String"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 768
    :cond_31
    :goto_31
    iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat$read;->read:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-object p0
.end method
