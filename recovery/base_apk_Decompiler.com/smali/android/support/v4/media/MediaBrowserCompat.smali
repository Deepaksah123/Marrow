###### Class android.support.v4.media.MediaBrowserCompat (android.support.v4.media.MediaBrowserCompat)
.class public final Landroid/support/v4/media/MediaBrowserCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesCompatParcelizer;,
        Landroid/support/v4/media/MediaBrowserCompat$write;,
        Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;,
        Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;,
        Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$read;,
        Landroid/support/v4/media/MediaBrowserCompat$ItemReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatCustomActionResultReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi21Parcelizer;,
        Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaItem;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;
    }
.end annotation


# static fields
.field static final IconCompatParcelizer:Z


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 126
    const-string v0, "MediaBrowserCompat"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroid/support/v4/media/MediaBrowserCompat;->IconCompatParcelizer:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;Landroid/os/Bundle;)V
    .registers 6

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi21Parcelizer;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi21Parcelizer;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;Landroid/os/Bundle;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()V
    .registers 1

    .line 235
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;->read()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 1

    .line 291
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;->MediaBrowserCompatCustomActionResultReceiver()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p0

    return-object p0
.end method

.method public final write()V
    .registers 1

    .line 227
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer()V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.AudioAttributesCompatParcelizer (android.support.v4.media.MediaBrowserCompat$AudioAttributesCompatParcelizer)
.class Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# direct methods
.method static read(Landroid/media/browse/MediaBrowser$MediaItem;)I
    .registers 1

    .line 2394
    invoke-virtual {p0}, Landroid/media/browse/MediaBrowser$MediaItem;->getFlags()I

    move-result p0

    return p0
.end method

.method static write(Landroid/media/browse/MediaBrowser$MediaItem;)Landroid/media/MediaDescription;
    .registers 1

    .line 2389
    invoke-virtual {p0}, Landroid/media/browse/MediaBrowser$MediaItem;->getDescription()Landroid/media/MediaDescription;

    move-result-object p0

    return-object p0
.end method

###### Class android.support.v4.media.MediaBrowserCompat.AudioAttributesImplApi21Parcelizer (android.support.v4.media.MediaBrowserCompat$AudioAttributesImplApi21Parcelizer)
.class Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi21Parcelizer;
.super Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatCustomActionResultReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesImplApi21Parcelizer"
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;Landroid/os/Bundle;)V
    .registers 5

    .line 2041
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;Landroid/os/Bundle;)V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.AudioAttributesImplApi26Parcelizer (android.support.v4.media.MediaBrowserCompat$AudioAttributesImplApi26Parcelizer)
.class interface abstract Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "AudioAttributesImplApi26Parcelizer"
.end annotation


# virtual methods
.method public abstract MediaBrowserCompatCustomActionResultReceiver()Landroid/support/v4/media/session/MediaSessionCompat$Token;
.end method

.method public abstract RemoteActionCompatParcelizer()V
.end method

.method public abstract read()V
.end method

###### Class android.support.v4.media.MediaBrowserCompat.AudioAttributesImplBaseParcelizer (android.support.v4.media.MediaBrowserCompat$AudioAttributesImplBaseParcelizer)
.class interface abstract Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "AudioAttributesImplBaseParcelizer"
.end annotation


# virtual methods
.method public abstract IconCompatParcelizer(Landroid/os/Messenger;)V
.end method

.method public abstract RemoteActionCompatParcelizer(Landroid/os/Messenger;Ljava/lang/String;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;)V
.end method

.method public abstract read(Landroid/os/Messenger;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Messenger;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;",
            "Landroid/os/Bundle;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation
.end method

###### Class android.support.v4.media.MediaBrowserCompat.CustomActionResultReceiver (android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver)
.class Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;
.super Landroid/support/v4/os/ResultReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CustomActionResultReceiver"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;

.field private final AudioAttributesImplBaseParcelizer:Landroid/os/Bundle;

.field private final RemoteActionCompatParcelizer:Ljava/lang/String;


# virtual methods
.method public AudioAttributesCompatParcelizer(ILandroid/os/Bundle;)V
    .registers 4

    .line 2361
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;

    if-nez v0, :cond_5

    return-void

    .line 2364
    :cond_5
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2d

    if-eqz p1, :cond_23

    const/4 v0, 0x1

    if-eq p1, v0, :cond_19

    .line 2376
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->AudioAttributesImplBaseParcelizer:Landroid/os/Bundle;

    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-void

    .line 2367
    :cond_19
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->AudioAttributesImplBaseParcelizer:Landroid/os/Bundle;

    invoke-virtual {p1, v0, p0, p2}, Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void

    .line 2370
    :cond_23
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->AudioAttributesImplBaseParcelizer:Landroid/os/Bundle;

    invoke-virtual {p1, v0, p0, p2}, Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void

    .line 2373
    :cond_2d
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->AudioAttributesCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;->AudioAttributesImplBaseParcelizer:Landroid/os/Bundle;

    invoke-virtual {p1, v0, p0, p2}, Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;->write(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.IconCompatParcelizer (android.support.v4.media.MediaBrowserCompat$IconCompatParcelizer)
.class public Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "IconCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;,
        Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;
    }
.end annotation


# instance fields
.field RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;

.field final read:Landroid/media/browse/MediaBrowser$ConnectionCallback;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 646
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 648
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;

    invoke-direct {v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;-><init>(Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->read:Landroid/media/browse/MediaBrowser$ConnectionCallback;

    return-void
.end method


# virtual methods
.method AudioAttributesCompatParcelizer(Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;)V
    .registers 2

    .line 685
    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;

    return-void
.end method

.method public IconCompatParcelizer()V
    .registers 1

    return-void
.end method

.method public RemoteActionCompatParcelizer()V
    .registers 1

    return-void
.end method

.method public write()V
    .registers 1

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.IconCompatParcelizer.C0000IconCompatParcelizer (android.support.v4.media.MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer)
.class Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;
.super Landroid/media/browse/MediaBrowser$ConnectionCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;


# direct methods
.method constructor <init>(Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;)V
    .registers 2

    .line 696
    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ConnectionCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected()V
    .registers 2

    .line 701
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;

    if-eqz v0, :cond_d

    .line 702
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;

    invoke-interface {v0}, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;->write()V

    .line 704
    :cond_d
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    invoke-virtual {p0}, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public onConnectionFailed()V
    .registers 2

    .line 717
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;

    if-eqz v0, :cond_d

    .line 718
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;

    invoke-interface {v0}, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;->AudioAttributesCompatParcelizer()V

    .line 720
    :cond_d
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    invoke-virtual {p0}, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->IconCompatParcelizer()V

    return-void
.end method

.method public onConnectionSuspended()V
    .registers 2

    .line 709
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;

    if-eqz v0, :cond_d

    .line 710
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;

    invoke-interface {v0}, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;->IconCompatParcelizer()V

    .line 712
    :cond_d
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;

    invoke-virtual {p0}, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->write()V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.IconCompatParcelizer.read (android.support.v4.media.MediaBrowserCompat$IconCompatParcelizer$read)
.class interface abstract Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "read"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()V
.end method

.method public abstract IconCompatParcelizer()V
.end method

.method public abstract write()V
.end method

###### Class android.support.v4.media.MediaBrowserCompat.ItemReceiver (android.support.v4.media.MediaBrowserCompat$ItemReceiver)
.class Landroid/support/v4/media/MediaBrowserCompat$ItemReceiver;
.super Landroid/support/v4/os/ResultReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ItemReceiver"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private final RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$read;


# virtual methods
.method public AudioAttributesCompatParcelizer(ILandroid/os/Bundle;)V
    .registers 4

    if-eqz p2, :cond_6

    .line 2292
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    :cond_6
    if-nez p1, :cond_2c

    if-eqz p2, :cond_2c

    .line 2295
    const-string p1, "media_item"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 2299
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_24

    .line 2300
    instance-of p2, p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    if-nez p2, :cond_24

    .line 2303
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ItemReceiver;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$read;

    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$ItemReceiver;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/support/v4/media/MediaBrowserCompat$read;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    return-void

    .line 2301
    :cond_24
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$ItemReceiver;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$read;

    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$read;->AudioAttributesCompatParcelizer(Landroid/support/v4/media/MediaBrowserCompat$MediaItem;)V

    return-void

    .line 2296
    :cond_2c
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ItemReceiver;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$read;

    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$ItemReceiver;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/support/v4/media/MediaBrowserCompat$read;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaBrowserCompatCustomActionResultReceiver (android.support.v4.media.MediaBrowserCompat$MediaBrowserCompatCustomActionResultReceiver)
.class Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatCustomActionResultReceiver;
.super Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;Landroid/os/Bundle;)V
    .registers 5

    .line 2024
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;Landroid/os/Bundle;)V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaBrowserCompatItemReceiver (android.support.v4.media.MediaBrowserCompat$MediaBrowserCompatItemReceiver)
.class Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplApi26Parcelizer;
.implements Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;
.implements Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaBrowserCompatItemReceiver"
.end annotation


# instance fields
.field protected final AudioAttributesCompatParcelizer:Landroid/media/browse/MediaBrowser;

.field private AudioAttributesImplApi21Parcelizer:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field private final AudioAttributesImplApi26Parcelizer:Lo/setTitleOptional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/setTitleOptional<",
            "Ljava/lang/String;",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;",
            ">;"
        }
    .end annotation
.end field

.field protected AudioAttributesImplBaseParcelizer:I

.field protected IconCompatParcelizer:Landroid/os/Messenger;

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Bundle;

.field protected MediaBrowserCompatItemReceiver:Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;

.field final RemoteActionCompatParcelizer:Landroid/content/Context;

.field protected final read:Landroid/os/Bundle;

.field protected final write:Landroid/support/v4/media/MediaBrowserCompat$write;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;Landroid/os/Bundle;)V
    .registers 7

    .line 1662
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1652
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$write;

    invoke-direct {v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$write;-><init>(Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->write:Landroid/support/v4/media/MediaBrowserCompat$write;

    .line 1653
    new-instance v0, Lo/setTitleOptional;

    invoke-direct {v0}, Lo/setTitleOptional;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer:Lo/setTitleOptional;

    .line 1663
    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroid/content/Context;

    .line 1664
    new-instance v0, Landroid/os/Bundle;

    if-eqz p4, :cond_1b

    invoke-direct {v0, p4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_1e

    :cond_1b
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_1e
    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->read:Landroid/os/Bundle;

    .line 1665
    const-string p4, "extra_client_version"

    const/4 v1, 0x1

    invoke-virtual {v0, p4, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1666
    const-string p4, "extra_calling_pid"

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-virtual {v0, p4, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1667
    invoke-virtual {p3, p0}, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer$read;)V

    .line 1668
    new-instance p4, Landroid/media/browse/MediaBrowser;

    iget-object p3, p3, Landroid/support/v4/media/MediaBrowserCompat$IconCompatParcelizer;->read:Landroid/media/browse/MediaBrowser$ConnectionCallback;

    invoke-direct {p4, p1, p2, p3, v0}, Landroid/media/browse/MediaBrowser;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/media/browse/MediaBrowser$ConnectionCallback;Landroid/os/Bundle;)V

    iput-object p4, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:Landroid/media/browse/MediaBrowser;

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()V
    .registers 1

    return-void
.end method

.method public IconCompatParcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 1952
    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;

    .line 1953
    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer:Landroid/os/Messenger;

    .line 1954
    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 1955
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->write:Landroid/support/v4/media/MediaBrowserCompat$write;

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaBrowserCompat$write;->RemoteActionCompatParcelizer(Landroid/os/Messenger;)V

    return-void
.end method

.method public IconCompatParcelizer(Landroid/os/Messenger;)V
    .registers 2

    return-void
.end method

.method public MediaBrowserCompatCustomActionResultReceiver()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 2

    .line 1714
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    if-nez v0, :cond_10

    .line 1715
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:Landroid/media/browse/MediaBrowser;

    .line 1716
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object v0

    .line 1715
    invoke-static {v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 1718
    :cond_10
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    return-object p0
.end method

.method public RemoteActionCompatParcelizer()V
    .registers 1

    .line 1674
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:Landroid/media/browse/MediaBrowser;

    invoke-virtual {p0}, Landroid/media/browse/MediaBrowser;->connect()V

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/os/Messenger;Ljava/lang/String;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;)V
    .registers 5

    return-void
.end method

.method public read()V
    .registers 3

    .line 1679
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;

    if-eqz v0, :cond_b

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer:Landroid/os/Messenger;

    if-eqz v1, :cond_b

    .line 1681
    :try_start_8
    invoke-virtual {v0, v1}, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;->write(Landroid/os/Messenger;)V
    :try_end_b
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_b} :catch_b

    .line 1686
    :catch_b
    :cond_b
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:Landroid/media/browse/MediaBrowser;

    invoke-virtual {p0}, Landroid/media/browse/MediaBrowser;->disconnect()V

    return-void
.end method

.method public read(Landroid/os/Messenger;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Messenger;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;",
            "Landroid/os/Bundle;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .line 1978
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer:Landroid/os/Messenger;

    if-ne v0, p1, :cond_35

    .line 1983
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer:Lo/setTitleOptional;

    invoke-virtual {p1, p2}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;

    if-nez p1, :cond_11

    .line 1985
    sget-boolean p0, Landroid/support/v4/media/MediaBrowserCompat;->IconCompatParcelizer:Z

    return-void

    .line 1992
    :cond_11
    invoke-virtual {p1, p4}, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->write(Landroid/os/Bundle;)Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    move-result-object p1

    if-eqz p1, :cond_35

    const/4 v0, 0x0

    if-nez p4, :cond_28

    if-nez p3, :cond_20

    .line 1996
    invoke-virtual {p1, p2}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->read(Ljava/lang/String;)V

    return-void

    .line 1998
    :cond_20
    iput-object p5, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Bundle;

    .line 1999
    invoke-virtual {p1, p2, p3}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/util/List;)V

    .line 2000
    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Bundle;

    return-void

    :cond_28
    if-nez p3, :cond_2e

    .line 2004
    invoke-virtual {p1, p2, p4}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    .line 2006
    :cond_2e
    iput-object p5, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Bundle;

    .line 2007
    invoke-virtual {p1, p2, p3, p4}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V

    .line 2008
    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Bundle;

    :cond_35
    return-void
.end method

.method public write()V
    .registers 5

    .line 1921
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:Landroid/media/browse/MediaBrowser;

    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->getExtras()Landroid/os/Bundle;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_6} :catch_51

    if-eqz v0, :cond_51

    .line 1930
    const-string v1, "extra_service_version"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesImplBaseParcelizer:I

    .line 1931
    const-string v1, "extra_messenger"

    invoke-static {v0, v1}, Lo/_checkFromStringCoercion;->read(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_39

    .line 1933
    new-instance v2, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;

    iget-object v3, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->read:Landroid/os/Bundle;

    invoke-direct {v2, v1, v3}, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;-><init>(Landroid/os/IBinder;Landroid/os/Bundle;)V

    iput-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;

    .line 1934
    new-instance v1, Landroid/os/Messenger;

    iget-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->write:Landroid/support/v4/media/MediaBrowserCompat$write;

    invoke-direct {v1, v2}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer:Landroid/os/Messenger;

    .line 1935
    iget-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->write:Landroid/support/v4/media/MediaBrowserCompat$write;

    invoke-virtual {v2, v1}, Landroid/support/v4/media/MediaBrowserCompat$write;->RemoteActionCompatParcelizer(Landroid/os/Messenger;)V

    .line 1937
    :try_start_30
    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;

    iget-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroid/content/Context;

    iget-object v3, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer:Landroid/os/Messenger;

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;->read(Landroid/content/Context;Landroid/os/Messenger;)V
    :try_end_39
    .catch Landroid/os/RemoteException; {:try_start_30 .. :try_end_39} :catch_39

    .line 1943
    :catch_39
    :cond_39
    const-string v1, "extra_session_binder"

    invoke-static {v0, v1}, Lo/_checkFromStringCoercion;->read(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    .line 1942
    invoke-static {v0}, Lo/AudioAttributesImplBaseParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/IBinder;)Lo/AudioAttributesImplBaseParcelizer;

    move-result-object v0

    if-eqz v0, :cond_51

    .line 1945
    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:Landroid/media/browse/MediaBrowser;

    .line 1946
    invoke-virtual {v1}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object v1

    .line 1945
    invoke-static {v1, v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Lo/AudioAttributesImplBaseParcelizer;)Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    :catch_51
    :cond_51
    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaBrowserCompatMediaItem (android.support.v4.media.MediaBrowserCompat$MediaBrowserCompatMediaItem)
.class Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaBrowserCompatMediaItem"
.end annotation


# instance fields
.field private final RemoteActionCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field private final write:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 2080
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2081
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->write:Ljava/util/List;

    .line 2082
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->RemoteActionCompatParcelizer:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .line 2090
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->RemoteActionCompatParcelizer:Ljava/util/List;

    return-object p0
.end method

.method public read()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;",
            ">;"
        }
    .end annotation

    .line 2094
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->write:Ljava/util/List;

    return-object p0
.end method

.method public write(Landroid/os/Bundle;)Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;
    .registers 4

    const/4 v0, 0x0

    .line 2098
    :goto_1
    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_23

    .line 2099
    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    invoke-static {v1, p1}, Lo/JsonFormatVisitorWrapper;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_20

    .line 2100
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->write:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    return-object p0

    :cond_20
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_23
    const/4 p0, 0x0

    return-object p0
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaBrowserCompatSearchResultReceiver (android.support.v4.media.MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver)
.class public abstract Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "MediaBrowserCompatSearchResultReceiver"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 926
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public IconCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public write(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaDescriptionCompat (android.support.v4.media.MediaBrowserCompat$MediaDescriptionCompat)
.class public abstract Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "MediaDescriptionCompat"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field final IconCompatParcelizer:Landroid/os/IBinder;

.field RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;",
            ">;"
        }
    .end annotation
.end field

.field final read:Landroid/media/browse/MediaBrowser$SubscriptionCallback;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 733
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 734
    new-instance v0, Landroid/os/Binder;

    invoke-direct {v0}, Landroid/os/Binder;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->IconCompatParcelizer:Landroid/os/IBinder;

    .line 736
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$RemoteActionCompatParcelizer;

    invoke-direct {v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$RemoteActionCompatParcelizer;-><init>(Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->read:Landroid/media/browse/MediaBrowser$SubscriptionCallback;

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public read(Ljava/lang/String;)V
    .registers 2

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaDescriptionCompat.IconCompatParcelizer (android.support.v4.media.MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer)
.class Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;
.super Landroid/media/browse/MediaBrowser$SubscriptionCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;


# direct methods
.method constructor <init>(Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;)V
    .registers 2

    .line 799
    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$SubscriptionCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildrenLoaded(Ljava/lang/String;Ljava/util/List;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;)V"
        }
    .end annotation

    .line 805
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_8

    const/4 v0, 0x0

    goto :goto_12

    :cond_8
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;

    :goto_12
    if-nez v0, :cond_1e

    .line 807
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    .line 808
    invoke-static {p2}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->read(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 807
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/util/List;)V

    return-void

    .line 811
    :cond_1e
    invoke-static {p2}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->read(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 812
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->read()Ljava/util/List;

    move-result-object v1

    .line 813
    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatMediaItem;->AudioAttributesCompatParcelizer()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    .line 814
    :goto_2b
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_4b

    .line 815
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    if-nez v3, :cond_3f

    .line 817
    iget-object v3, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    invoke-virtual {v3, p1, p2}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_48

    .line 819
    :cond_3f
    iget-object v4, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    .line 820
    invoke-virtual {p0, p2, v3}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;->read(Ljava/util/List;Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v5

    .line 819
    invoke-virtual {v4, p1, v5, v3}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V

    :goto_48
    add-int/lit8 v2, v2, 0x1

    goto :goto_2b

    :cond_4b
    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .registers 2

    .line 828
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->read(Ljava/lang/String;)V

    return-void
.end method

.method read(Ljava/util/List;Landroid/os/Bundle;)Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 836
    :cond_4
    const-string p0, "android.media.browse.extra.PAGE"

    const/4 v0, -0x1

    invoke-virtual {p2, p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    .line 837
    const-string v1, "android.media.browse.extra.PAGE_SIZE"

    invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p2

    if-ne p0, v0, :cond_16

    if-ne p2, v0, :cond_16

    return-object p1

    :cond_16
    mul-int v0, p2, p0

    add-int v1, v0, p2

    if-ltz p0, :cond_33

    if-lez p2, :cond_33

    .line 843
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    if-ge v0, p0, :cond_33

    .line 846
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    if-le v1, p0, :cond_2e

    .line 847
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 849
    :cond_2e
    invoke-interface {p1, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 844
    :cond_33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaDescriptionCompat.RemoteActionCompatParcelizer (android.support.v4.media.MediaBrowserCompat$MediaDescriptionCompat$RemoteActionCompatParcelizer)
.class Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$RemoteActionCompatParcelizer;
.super Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field final synthetic read:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;


# direct methods
.method constructor <init>(Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;)V
    .registers 2

    .line 856
    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    invoke-direct {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$IconCompatParcelizer;-><init>(Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;)V

    return-void
.end method


# virtual methods
.method public onChildrenLoaded(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .line 863
    invoke-static {p3}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 864
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    .line 865
    invoke-static {p2}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->read(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 864
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V

    return-void
.end method

.method public onError(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 870
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 871
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;

    invoke-virtual {p0, p1, p2}, Landroid/support/v4/media/MediaBrowserCompat$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaItem (android.support.v4.media.MediaBrowserCompat$MediaItem)
.class public Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MediaItem"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final read:Landroid/support/v4/media/MediaDescriptionCompat;

.field private final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 584
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem$3;

    invoke-direct {v0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem$3;-><init>()V

    sput-object v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 558
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 559
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->write:I

    .line 560
    sget-object v0, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/MediaDescriptionCompat;

    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->read:Landroid/support/v4/media/MediaDescriptionCompat;

    return-void
.end method

.method public constructor <init>(Landroid/support/v4/media/MediaDescriptionCompat;I)V
    .registers 4

    .line 544
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1c

    .line 548
    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesImplApi26Parcelizer()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 551
    iput p2, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->write:I

    .line 552
    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->read:Landroid/support/v4/media/MediaDescriptionCompat;

    return-void

    .line 549
    :cond_14
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "description must have a non-empty media id"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 546
    :cond_1c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "description cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static read(Ljava/lang/Object;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .registers 3

    if-eqz p0, :cond_16

    .line 510
    check-cast p0, Landroid/media/browse/MediaBrowser$MediaItem;

    .line 511
    invoke-static {p0}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesCompatParcelizer;->read(Landroid/media/browse/MediaBrowser$MediaItem;)I

    move-result v0

    .line 513
    invoke-static {p0}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesCompatParcelizer;->write(Landroid/media/browse/MediaBrowser$MediaItem;)Landroid/media/MediaDescription;

    move-result-object p0

    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p0

    .line 514
    new-instance v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-direct {v1, p0, v0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    return-object v1

    :cond_16
    const/4 p0, 0x0

    return-object p0
.end method

.method public static read(Ljava/util/List;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_22

    .line 531
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 532
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 533
    invoke-static {v1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->read(Ljava/lang/Object;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_21
    return-object v0

    :cond_22
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 577
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediaItem{mFlags="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 578
    iget v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->write:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 579
    const-string v1, ", mDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->read:Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x7d

    .line 580
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 581
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    .line 570
    iget v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->write:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 571
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->read:Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-virtual {p0, p1, p2}, Landroid/support/v4/media/MediaDescriptionCompat;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaItem.AnonymousClass3 (android.support.v4.media.MediaBrowserCompat$MediaItem$3)
.class Landroid/support/v4/media/MediaBrowserCompat$MediaItem$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 585
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .registers 2

    .line 588
    new-instance p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-direct {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(I)[Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    .registers 2

    .line 593
    new-array p0, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    return-object p0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 585
    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem$3;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 585
    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem$3;->RemoteActionCompatParcelizer(I)[Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object p0

    return-object p0
.end method

###### Class android.support.v4.media.MediaBrowserCompat.MediaMetadataCompat (android.support.v4.media.MediaBrowserCompat$MediaMetadataCompat)
.class Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaMetadataCompat"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroid/os/Bundle;

.field private RemoteActionCompatParcelizer:Landroid/os/Messenger;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;Landroid/os/Bundle;)V
    .registers 4

    .line 2191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2192
    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p1}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;->RemoteActionCompatParcelizer:Landroid/os/Messenger;

    .line 2193
    iput-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;->AudioAttributesCompatParcelizer:Landroid/os/Bundle;

    return-void
.end method

.method private RemoteActionCompatParcelizer(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2269
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 2270
    iput p1, v0, Landroid/os/Message;->what:I

    const/4 p1, 0x1

    .line 2271
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 2272
    invoke-virtual {v0, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 2273
    iput-object p3, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 2274
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;->RemoteActionCompatParcelizer:Landroid/os/Messenger;

    invoke-virtual {p0, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    return-void
.end method


# virtual methods
.method read(Landroid/content/Context;Landroid/os/Messenger;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2238
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2239
    const-string v1, "data_package_name"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2240
    const-string p1, "data_calling_pid"

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2241
    const-string p1, "data_root_hints"

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;->AudioAttributesCompatParcelizer:Landroid/os/Bundle;

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const/4 p1, 0x6

    .line 2242
    invoke-direct {p0, p1, v0, p2}, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;->RemoteActionCompatParcelizer(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    return-void
.end method

.method write(Landroid/os/Messenger;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 2246
    invoke-direct {p0, v0, v1, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaMetadataCompat;->RemoteActionCompatParcelizer(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.RemoteActionCompatParcelizer (android.support.v4.media.MediaBrowserCompat$RemoteActionCompatParcelizer)
.class public abstract Landroid/support/v4/media/MediaBrowserCompat$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 952
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .registers 4

    return-void
.end method

.method public RemoteActionCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .registers 4

    return-void
.end method

.method public write(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .registers 4

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.SearchResultReceiver (android.support.v4.media.MediaBrowserCompat$SearchResultReceiver)
.class Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;
.super Landroid/support/v4/os/ResultReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SearchResultReceiver"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/os/Bundle;

.field private final AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

.field private final RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver;


# virtual methods
.method public AudioAttributesCompatParcelizer(ILandroid/os/Bundle;)V
    .registers 6

    if-eqz p2, :cond_6

    .line 2325
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    :cond_6
    if-nez p1, :cond_40

    if-eqz p2, :cond_40

    .line 2328
    const-string p1, "search_results"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_40

    .line 2332
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_36

    .line 2335
    new-instance p2, Ljava/util/ArrayList;

    array-length v0, p1

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 2336
    array-length v0, p1

    const/4 v1, 0x0

    :goto_20
    if-ge v1, v0, :cond_2c

    aget-object v2, p1, v1

    .line 2337
    check-cast v2, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_20

    .line 2339
    :cond_2c
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver;

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->AudioAttributesCompatParcelizer:Landroid/os/Bundle;

    invoke-virtual {p1, v0, p0, p2}, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver;->IconCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;)V

    return-void

    .line 2341
    :cond_36
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver;

    iget-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->AudioAttributesCompatParcelizer:Landroid/os/Bundle;

    invoke-virtual {p1, p2, p0}, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver;->write(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    .line 2329
    :cond_40
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->RemoteActionCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver;

    iget-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;->AudioAttributesCompatParcelizer:Landroid/os/Bundle;

    invoke-virtual {p1, p2, p0}, Landroid/support/v4/media/MediaBrowserCompat$MediaBrowserCompatSearchResultReceiver;->write(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.read (android.support.v4.media.MediaBrowserCompat$read)
.class public abstract Landroid/support/v4/media/MediaBrowserCompat$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "read"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaBrowserCompat$read$write;
    }
.end annotation


# instance fields
.field final write:Landroid/media/browse/MediaBrowser$ItemCallback;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 882
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 884
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$read$write;

    invoke-direct {v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$read$write;-><init>(Landroid/support/v4/media/MediaBrowserCompat$read;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$read;->write:Landroid/media/browse/MediaBrowser$ItemCallback;

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/support/v4/media/MediaBrowserCompat$MediaItem;)V
    .registers 2

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Ljava/lang/String;)V
    .registers 2

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.read.write (android.support.v4.media.MediaBrowserCompat$read$write)
.class Landroid/support/v4/media/MediaBrowserCompat$read$write;
.super Landroid/media/browse/MediaBrowser$ItemCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat$read;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "write"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$read;


# direct methods
.method constructor <init>(Landroid/support/v4/media/MediaBrowserCompat$read;)V
    .registers 2

    .line 908
    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$read$write;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$read;

    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ItemCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;)V
    .registers 2

    .line 918
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$read$write;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$read;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$read;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    return-void
.end method

.method public onItemLoaded(Landroid/media/browse/MediaBrowser$MediaItem;)V
    .registers 2

    .line 913
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$read$write;->IconCompatParcelizer:Landroid/support/v4/media/MediaBrowserCompat$read;

    invoke-static {p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->read(Ljava/lang/Object;)Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$read;->AudioAttributesCompatParcelizer(Landroid/support/v4/media/MediaBrowserCompat$MediaItem;)V

    return-void
.end method

###### Class android.support.v4.media.MediaBrowserCompat.write (android.support.v4.media.MediaBrowserCompat$write)
.class Landroid/support/v4/media/MediaBrowserCompat$write;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# instance fields
.field private final IconCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/os/Messenger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;)V
    .registers 3

    .line 2123
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2124
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$write;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method RemoteActionCompatParcelizer(Landroid/os/Messenger;)V
    .registers 3

    .line 2183
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$write;->RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .registers 11

    .line 2130
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$write;->RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_82

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_82

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$write;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    .line 2131
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_82

    .line 2134
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 2135
    invoke-static {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 2136
    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$write;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;

    .line 2137
    iget-object p0, p0, Landroid/support/v4/media/MediaBrowserCompat$write;->RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/Messenger;

    const/4 v8, 0x1

    .line 2139
    :try_start_2a
    iget v2, p1, Landroid/os/Message;->what:I
    :try_end_2c
    .catch Landroid/os/BadParcelableException; {:try_start_2a .. :try_end_2c} :catch_7b

    const-string v3, "data_media_item_id"

    if-eq v2, v8, :cond_62

    const/4 v4, 0x2

    if-eq v2, v4, :cond_5e

    const/4 v4, 0x3

    if-eq v2, v4, :cond_3c

    .line 2168
    :try_start_36
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget p0, p1, Landroid/os/Message;->arg1:I

    return-void

    .line 2153
    :cond_3c
    const-string v2, "data_options"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    .line 2154
    invoke-static {v6}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 2157
    const-string v2, "data_notify_children_changed_options"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    .line 2158
    invoke-static {v7}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 2161
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2162
    const-string v2, "data_media_item_list"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    move-object v2, v1

    move-object v3, p0

    .line 2160
    invoke-interface/range {v2 .. v7}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;->read(Landroid/os/Messenger;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void

    .line 2150
    :cond_5e
    invoke-interface {v1, p0}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;->IconCompatParcelizer(Landroid/os/Messenger;)V

    return-void

    .line 2141
    :cond_62
    const-string v2, "data_root_hints"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 2142
    invoke-static {v2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 2145
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2146
    const-string v4, "data_media_session_token"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 2144
    invoke-interface {v1, p0, v3, v0, v2}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;->RemoteActionCompatParcelizer(Landroid/os/Messenger;Ljava/lang/String;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;)V
    :try_end_7a
    .catch Landroid/os/BadParcelableException; {:try_start_36 .. :try_end_7a} :catch_7b

    return-void

    .line 2176
    :catch_7b
    iget p1, p1, Landroid/os/Message;->what:I

    if-ne p1, v8, :cond_82

    .line 2177
    invoke-interface {v1, p0}, Landroid/support/v4/media/MediaBrowserCompat$AudioAttributesImplBaseParcelizer;->IconCompatParcelizer(Landroid/os/Messenger;)V

    :cond_82
    return-void
.end method
