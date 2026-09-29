###### Class android.support.v4.media.MediaDescriptionCompat (android.support.v4.media.MediaDescriptionCompat)
.class public final Landroid/support/v4/media/MediaDescriptionCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;,
        Landroid/support/v4/media/MediaDescriptionCompat$read;,
        Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/MediaDescriptionCompat;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AudioAttributesCompatParcelizer:Landroid/media/MediaDescription;

.field private final AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

.field private final AudioAttributesImplBaseParcelizer:Landroid/net/Uri;

.field private final IconCompatParcelizer:Landroid/net/Uri;

.field private final MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

.field private final MediaBrowserCompatItemReceiver:Ljava/lang/CharSequence;

.field private final RemoteActionCompatParcelizer:Landroid/os/Bundle;

.field private final read:Landroid/graphics/Bitmap;

.field private final write:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 432
    new-instance v0, Landroid/support/v4/media/MediaDescriptionCompat$5;

    invoke-direct {v0}, Landroid/support/v4/media/MediaDescriptionCompat$5;-><init>()V

    sput-object v0, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V
    .registers 9

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 197
    iput-object p2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->MediaBrowserCompatItemReceiver:Ljava/lang/CharSequence;

    .line 198
    iput-object p3, p0, Landroid/support/v4/media/MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    .line 199
    iput-object p4, p0, Landroid/support/v4/media/MediaDescriptionCompat;->write:Ljava/lang/CharSequence;

    .line 200
    iput-object p5, p0, Landroid/support/v4/media/MediaDescriptionCompat;->read:Landroid/graphics/Bitmap;

    .line 201
    iput-object p6, p0, Landroid/support/v4/media/MediaDescriptionCompat;->IconCompatParcelizer:Landroid/net/Uri;

    .line 202
    iput-object p7, p0, Landroid/support/v4/media/MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroid/os/Bundle;

    .line 203
    iput-object p8, p0, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesImplBaseParcelizer:Landroid/net/Uri;

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;
    .registers 9

    const/4 v0, 0x0

    if-eqz p0, :cond_79

    .line 387
    new-instance v1, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    invoke-direct {v1}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;-><init>()V

    .line 388
    check-cast p0, Landroid/media/MediaDescription;

    .line 389
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/media/MediaDescription;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 390
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 391
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 392
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 393
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->read(Landroid/media/MediaDescription;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->read(Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 394
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->write(Landroid/media/MediaDescription;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 395
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/media/MediaDescription;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_3e

    .line 397
    invoke-static {v2}, Landroid/support/v4/media/session/MediaSessionCompat;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    .line 400
    :cond_3e
    const-string v3, "android.support.v4.media.description.MEDIA_URI"

    if-eqz v2, :cond_49

    .line 401
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/net/Uri;

    goto :goto_4a

    :cond_49
    move-object v4, v0

    :goto_4a
    if-eqz v4, :cond_62

    .line 404
    const-string v5, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5c

    invoke-virtual {v2}, Landroid/os/Bundle;->size()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_5c

    goto :goto_63

    .line 413
    :cond_5c
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 414
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_62
    move-object v0, v2

    .line 417
    :goto_63
    invoke-virtual {v1, v0}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    if-eqz v4, :cond_6c

    .line 419
    invoke-virtual {v1, v4}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->write(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    goto :goto_73

    .line 421
    :cond_6c
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat$read;->AudioAttributesCompatParcelizer(Landroid/media/MediaDescription;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->write(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;

    .line 423
    :goto_73
    invoke-virtual {v1}, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->read()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    .line 424
    iput-object p0, v0, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Landroid/media/MediaDescription;

    :cond_79
    return-object v0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Landroid/os/Bundle;
    .registers 1

    .line 286
    iget-object p0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroid/os/Bundle;

    return-object p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()Landroid/net/Uri;
    .registers 1

    .line 296
    iget-object p0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesImplBaseParcelizer:Landroid/net/Uri;

    return-object p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Ljava/lang/String;
    .registers 1

    .line 226
    iget-object p0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/lang/Object;
    .registers 3

    .line 337
    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Landroid/media/MediaDescription;

    if-nez v0, :cond_36

    .line 340
    invoke-static {}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->write()Landroid/media/MediaDescription$Builder;

    move-result-object v0

    .line 341
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->write(Landroid/media/MediaDescription$Builder;Ljava/lang/String;)V

    .line 342
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->MediaBrowserCompatItemReceiver:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V

    .line 343
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->read(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V

    .line 344
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->write:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V

    .line 345
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->read:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->read(Landroid/media/MediaDescription$Builder;Landroid/graphics/Bitmap;)V

    .line 346
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->IconCompatParcelizer:Landroid/net/Uri;

    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V

    .line 362
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroid/os/Bundle;

    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer(Landroid/media/MediaDescription$Builder;Landroid/os/Bundle;)V

    .line 365
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesImplBaseParcelizer:Landroid/net/Uri;

    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompat$read;->IconCompatParcelizer(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V

    .line 367
    invoke-static {v0}, Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/media/MediaDescription$Builder;)Landroid/media/MediaDescription;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Landroid/media/MediaDescription;

    :cond_36
    return-object v0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Ljava/lang/CharSequence;
    .registers 1

    .line 246
    iget-object p0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final MediaBrowserCompatItemReceiver()Ljava/lang/CharSequence;
    .registers 1

    .line 236
    iget-object p0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->MediaBrowserCompatItemReceiver:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Landroid/net/Uri;
    .registers 1

    .line 276
    iget-object p0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->IconCompatParcelizer:Landroid/net/Uri;

    return-object p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()Ljava/lang/CharSequence;
    .registers 1

    .line 256
    iget-object p0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->write:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->MediaBrowserCompatItemReceiver:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->write:Ljava/lang/CharSequence;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()Landroid/graphics/Bitmap;
    .registers 1

    .line 266
    iget-object p0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->read:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 316
    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/media/MediaDescription;

    invoke-virtual {p0, p1, p2}, Landroid/media/MediaDescription;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

###### Class android.support.v4.media.MediaDescriptionCompat.AnonymousClass5 (android.support.v4.media.MediaDescriptionCompat$5)
.class Landroid/support/v4/media/MediaDescriptionCompat$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaDescriptionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/MediaDescriptionCompat;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 433
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public RemoteActionCompatParcelizer(I)[Landroid/support/v4/media/MediaDescriptionCompat;
    .registers 2

    .line 445
    new-array p0, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    return-object p0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 433
    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaDescriptionCompat$5;->read(Landroid/os/Parcel;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 433
    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaDescriptionCompat$5;->RemoteActionCompatParcelizer(I)[Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p0

    return-object p0
.end method

.method public read(Landroid/os/Parcel;)Landroid/support/v4/media/MediaDescriptionCompat;
    .registers 2

    .line 439
    sget-object p0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p0

    return-object p0
.end method

###### Class android.support.v4.media.MediaDescriptionCompat.IconCompatParcelizer (android.support.v4.media.MediaDescriptionCompat$IconCompatParcelizer)
.class Landroid/support/v4/media/MediaDescriptionCompat$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaDescriptionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/media/MediaDescription$Builder;)Landroid/media/MediaDescription;
    .registers 1

    .line 624
    invoke-virtual {p0}, Landroid/media/MediaDescription$Builder;->build()Landroid/media/MediaDescription;

    move-result-object p0

    return-object p0
.end method

.method static AudioAttributesCompatParcelizer(Landroid/media/MediaDescription;)Landroid/os/Bundle;
    .registers 1

    .line 666
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method static AudioAttributesImplApi26Parcelizer(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;
    .registers 1

    .line 642
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static AudioAttributesImplBaseParcelizer(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;
    .registers 1

    .line 636
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static IconCompatParcelizer(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;
    .registers 1

    .line 648
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getDescription()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static IconCompatParcelizer(Landroid/media/MediaDescription$Builder;Landroid/os/Bundle;)V
    .registers 2

    .line 619
    invoke-virtual {p0, p1}, Landroid/media/MediaDescription$Builder;->setExtras(Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;

    return-void
.end method

.method static IconCompatParcelizer(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V
    .registers 2

    .line 601
    invoke-virtual {p0, p1}, Landroid/media/MediaDescription$Builder;->setDescription(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    return-void
.end method

.method static RemoteActionCompatParcelizer(Landroid/media/MediaDescription;)Ljava/lang/String;
    .registers 1

    .line 630
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getMediaId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static RemoteActionCompatParcelizer(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V
    .registers 2

    .line 613
    invoke-virtual {p0, p1}, Landroid/media/MediaDescription$Builder;->setIconUri(Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;

    return-void
.end method

.method static RemoteActionCompatParcelizer(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V
    .registers 2

    .line 589
    invoke-virtual {p0, p1}, Landroid/media/MediaDescription$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    return-void
.end method

.method static read(Landroid/media/MediaDescription;)Landroid/graphics/Bitmap;
    .registers 1

    .line 654
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method static read(Landroid/media/MediaDescription$Builder;Landroid/graphics/Bitmap;)V
    .registers 2

    .line 607
    invoke-virtual {p0, p1}, Landroid/media/MediaDescription$Builder;->setIconBitmap(Landroid/graphics/Bitmap;)Landroid/media/MediaDescription$Builder;

    return-void
.end method

.method static read(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V
    .registers 2

    .line 595
    invoke-virtual {p0, p1}, Landroid/media/MediaDescription$Builder;->setSubtitle(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    return-void
.end method

.method static write()Landroid/media/MediaDescription$Builder;
    .registers 1

    .line 577
    new-instance v0, Landroid/media/MediaDescription$Builder;

    invoke-direct {v0}, Landroid/media/MediaDescription$Builder;-><init>()V

    return-object v0
.end method

.method static write(Landroid/media/MediaDescription;)Landroid/net/Uri;
    .registers 1

    .line 660
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconUri()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method static write(Landroid/media/MediaDescription$Builder;Ljava/lang/String;)V
    .registers 2

    .line 583
    invoke-virtual {p0, p1}, Landroid/media/MediaDescription$Builder;->setMediaId(Ljava/lang/String;)Landroid/media/MediaDescription$Builder;

    return-void
.end method

###### Class android.support.v4.media.MediaDescriptionCompat.RemoteActionCompatParcelizer (android.support.v4.media.MediaDescriptionCompat$RemoteActionCompatParcelizer)
.class public final Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaDescriptionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroid/os/Bundle;

.field private AudioAttributesImplApi21Parcelizer:Ljava/lang/CharSequence;

.field private AudioAttributesImplApi26Parcelizer:Landroid/net/Uri;

.field private AudioAttributesImplBaseParcelizer:Ljava/lang/CharSequence;

.field private IconCompatParcelizer:Ljava/lang/CharSequence;

.field private RemoteActionCompatParcelizer:Ljava/lang/String;

.field private read:Landroid/graphics/Bitmap;

.field private write:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 465
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
    .registers 2

    .line 533
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->write:Landroid/net/Uri;

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
    .registers 2

    .line 509
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
    .registers 2

    .line 475
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final IconCompatParcelizer(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
    .registers 2

    .line 497
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
    .registers 2

    .line 544
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/os/Bundle;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
    .registers 2

    .line 486
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final read(Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
    .registers 2

    .line 521
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->read:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final read()Landroid/support/v4/media/MediaDescriptionCompat;
    .registers 11

    .line 566
    new-instance v9, Landroid/support/v4/media/MediaDescriptionCompat;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v2, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Ljava/lang/CharSequence;

    iget-object v3, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Ljava/lang/CharSequence;

    iget-object v4, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer:Ljava/lang/CharSequence;

    iget-object v5, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->read:Landroid/graphics/Bitmap;

    iget-object v6, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->write:Landroid/net/Uri;

    iget-object v7, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/os/Bundle;

    iget-object v8, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/net/Uri;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    return-object v9
.end method

.method public final write(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;
    .registers 2

    .line 555
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/net/Uri;

    return-object p0
.end method

###### Class android.support.v4.media.MediaDescriptionCompat.read (android.support.v4.media.MediaDescriptionCompat$read)
.class Landroid/support/v4/media/MediaDescriptionCompat$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaDescriptionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/media/MediaDescription;)Landroid/net/Uri;
    .registers 1

    .line 683
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getMediaUri()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method static IconCompatParcelizer(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V
    .registers 2

    .line 677
    invoke-virtual {p0, p1}, Landroid/media/MediaDescription$Builder;->setMediaUri(Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;

    return-void
.end method
