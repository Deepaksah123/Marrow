###### Class android.support.v4.media.session.MediaControllerCompat (android.support.v4.media.session.MediaControllerCompat)
.class public final Landroid/support/v4/media/session/MediaControllerCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;,
        Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;,
        Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;,
        Landroid/support/v4/media/session/MediaControllerCompat$write;,
        Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;,
        Landroid/support/v4/media/session/MediaControllerCompat$read;,
        Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi26Parcelizer;,
        Landroid/support/v4/media/session/MediaControllerCompat$MediaBrowserCompatCustomActionResultReceiver;,
        Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi21Parcelizer;,
        Landroid/support/v4/media/session/MediaControllerCompat$MediaBrowserCompatItemReceiver;
    }
.end annotation


# instance fields
.field private final RemoteActionCompatParcelizer:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private final read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

.field private final write:Landroid/support/v4/media/session/MediaSessionCompat$Token;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .registers 4

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1a

    .line 230
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->RemoteActionCompatParcelizer:Ljava/util/Set;

    .line 231
    iput-object p2, p0, Landroid/support/v4/media/session/MediaControllerCompat;->write:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 234
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat$write;

    invoke-direct {v0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$write;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

    return-void

    .line 228
    :cond_1a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "sessionToken must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat;)V
    .registers 3

    .line 217
    invoke-virtual {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 1

    .line 276
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p0

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V
    .registers 3

    const/4 v0, 0x0

    .line 538
    invoke-virtual {p0, p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat;->AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;Landroid/os/Handler;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;Landroid/os/Handler;)V
    .registers 4

    if-eqz p1, :cond_1b

    .line 554
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->RemoteActionCompatParcelizer:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    return-void

    :cond_b
    if-nez p2, :cond_12

    .line 559
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    .line 561
    :cond_12
    invoke-virtual {p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(Landroid/os/Handler;)V

    .line 562
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

    invoke-interface {p0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;Landroid/os/Handler;)V

    return-void

    .line 552
    :cond_1b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "callback must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final IconCompatParcelizer()Landroid/support/v4/media/MediaMetadataCompat;
    .registers 1

    .line 285
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;->IconCompatParcelizer()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method

.method public final IconCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V
    .registers 3

    if-eqz p1, :cond_1a

    .line 575
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->RemoteActionCompatParcelizer:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    return-void

    :cond_b
    const/4 v0, 0x0

    .line 580
    :try_start_c
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V
    :try_end_11
    .catchall {:try_start_c .. :try_end_11} :catchall_15

    .line 582
    invoke-virtual {p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(Landroid/os/Handler;)V

    return-void

    :catchall_15
    move-exception p0

    invoke-virtual {p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(Landroid/os/Handler;)V

    .line 583
    throw p0

    .line 573
    :cond_1a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "callback must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final IconCompatParcelizer(Landroid/view/KeyEvent;)Z
    .registers 2

    if-eqz p1, :cond_9

    .line 262
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0

    .line 260
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "KeyEvent may not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final RemoteActionCompatParcelizer()Landroid/support/v4/media/session/MediaControllerCompat$read;
    .registers 1

    .line 248
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;->read()Landroid/support/v4/media/session/MediaControllerCompat$read;

    move-result-object p0

    return-object p0
.end method

.method public final read()Landroid/app/PendingIntent;
    .registers 1

    .line 475
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;->write()Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public final write()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation

    .line 295
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->read:Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;

    invoke-interface {p0}, Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;->AudioAttributesCompatParcelizer()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.AudioAttributesCompatParcelizer (android.support.v4.media.session.MediaControllerCompat$AudioAttributesCompatParcelizer)
.class public final Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:I

.field private final IconCompatParcelizer:I

.field private final RemoteActionCompatParcelizer:I

.field private final read:Landroidx/media/AudioAttributesCompat;

.field private final write:I


# direct methods
.method constructor <init>(IIIII)V
    .registers 12

    .line 1362
    new-instance v0, Landroidx/media/AudioAttributesCompat$read;

    invoke-direct {v0}, Landroidx/media/AudioAttributesCompat$read;-><init>()V

    invoke-virtual {v0, p2}, Landroidx/media/AudioAttributesCompat$read;->write(I)Landroidx/media/AudioAttributesCompat$read;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/media/AudioAttributesCompat$read;->read()Landroidx/media/AudioAttributesCompat;

    move-result-object v2

    move-object v0, p0

    move v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;-><init>(ILandroidx/media/AudioAttributesCompat;III)V

    return-void
.end method

.method constructor <init>(ILandroidx/media/AudioAttributesCompat;III)V
    .registers 6

    .line 1367
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1368
    iput p1, p0, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 1369
    iput-object p2, p0, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;->read:Landroidx/media/AudioAttributesCompat;

    .line 1370
    iput p3, p0, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;->write:I

    .line 1371
    iput p4, p0, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 1372
    iput p5, p0, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    return-void
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.AudioAttributesImplApi21Parcelizer (android.support.v4.media.session.MediaControllerCompat$AudioAttributesImplApi21Parcelizer)
.class Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi21Parcelizer;
.super Landroid/support/v4/media/session/MediaControllerCompat$MediaBrowserCompatCustomActionResultReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesImplApi21Parcelizer"
.end annotation


# direct methods
.method constructor <init>(Landroid/media/session/MediaController$TransportControls;)V
    .registers 2

    .line 2576
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroid/media/session/MediaController$TransportControls;)V

    return-void
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.AudioAttributesImplApi26Parcelizer (android.support.v4.media.session.MediaControllerCompat$AudioAttributesImplApi26Parcelizer)
.class Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi26Parcelizer;
.super Landroid/support/v4/media/session/MediaControllerCompat$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesImplApi26Parcelizer"
.end annotation


# instance fields
.field protected final read:Landroid/media/session/MediaController$TransportControls;


# direct methods
.method constructor <init>(Landroid/media/session/MediaController$TransportControls;)V
    .registers 2

    .line 2404
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaControllerCompat$read;-><init>()V

    .line 2405
    iput-object p1, p0, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi26Parcelizer;->read:Landroid/media/session/MediaController$TransportControls;

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()V
    .registers 1

    .line 2439
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi26Parcelizer;->read:Landroid/media/session/MediaController$TransportControls;

    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->play()V

    return-void
.end method

.method public IconCompatParcelizer()V
    .registers 1

    .line 2449
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi26Parcelizer;->read:Landroid/media/session/MediaController$TransportControls;

    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->stop()V

    return-void
.end method

.method public RemoteActionCompatParcelizer()V
    .registers 1

    .line 2444
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi26Parcelizer;->read:Landroid/media/session/MediaController$TransportControls;

    invoke-virtual {p0}, Landroid/media/session/MediaController$TransportControls;->pause()V

    return-void
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.IconCompatParcelizer (android.support.v4.media.session.MediaControllerCompat$IconCompatParcelizer)
.class interface abstract Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "IconCompatParcelizer"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation
.end method

.method public abstract AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;Landroid/os/Handler;)V
.end method

.method public abstract IconCompatParcelizer()Landroid/support/v4/media/MediaMetadataCompat;
.end method

.method public abstract RemoteActionCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;
.end method

.method public abstract RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V
.end method

.method public abstract RemoteActionCompatParcelizer(Landroid/view/KeyEvent;)Z
.end method

.method public abstract read()Landroid/support/v4/media/session/MediaControllerCompat$read;
.end method

.method public abstract write()Landroid/app/PendingIntent;
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.MediaBrowserCompatCustomActionResultReceiver (android.support.v4.media.session.MediaControllerCompat$MediaBrowserCompatCustomActionResultReceiver)
.class Landroid/support/v4/media/session/MediaControllerCompat$MediaBrowserCompatCustomActionResultReceiver;
.super Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi26Parcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# direct methods
.method constructor <init>(Landroid/media/session/MediaController$TransportControls;)V
    .registers 2

    .line 2564
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi26Parcelizer;-><init>(Landroid/media/session/MediaController$TransportControls;)V

    return-void
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.MediaBrowserCompatItemReceiver (android.support.v4.media.session.MediaControllerCompat$MediaBrowserCompatItemReceiver)
.class Landroid/support/v4/media/session/MediaControllerCompat$MediaBrowserCompatItemReceiver;
.super Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi21Parcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaBrowserCompatItemReceiver"
.end annotation


# direct methods
.method constructor <init>(Landroid/media/session/MediaController$TransportControls;)V
    .registers 2

    .line 2603
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesImplApi21Parcelizer;-><init>(Landroid/media/session/MediaController$TransportControls;)V

    return-void
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21 (android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21)
.class Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/media/session/MediaControllerCompat$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaControllerImplApi21"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;,
        Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;",
            "Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field protected final IconCompatParcelizer:Landroid/media/session/MediaController;

.field final RemoteActionCompatParcelizer:Ljava/lang/Object;

.field final read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field private final write:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .registers 5

    .line 2007
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1996
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    .line 1998
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->write:Ljava/util/List;

    .line 2001
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->AudioAttributesCompatParcelizer:Ljava/util/HashMap;

    .line 2008
    iput-object p2, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 2010
    new-instance v0, Landroid/media/session/MediaController;

    invoke-virtual {p2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->write()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/session/MediaSession$Token;

    invoke-direct {v0, p1, v1}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    .line 2011
    invoke-virtual {p2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object p1

    if-nez p1, :cond_30

    .line 2012
    invoke-direct {p0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->AudioAttributesImplApi26Parcelizer()V

    :cond_30
    return-void
.end method

.method private AudioAttributesImplApi26Parcelizer()V
    .registers 4

    .line 2269
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;

    invoke-direct {v0, p0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;-><init>(Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;)V

    const-string v1, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;"
        }
    .end annotation

    .line 2099
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    invoke-virtual {p0}, Landroid/media/session/MediaController;->getQueue()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 2100
    invoke-static {p0}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->IconCompatParcelizer(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;Landroid/os/Handler;)V
    .registers 6

    .line 2018
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    iget-object v1, p1, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->read:Landroid/media/session/MediaController$Callback;

    invoke-virtual {v0, v1, p2}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;Landroid/os/Handler;)V

    .line 2019
    iget-object p2, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    monitor-enter p2

    .line 2020
    :try_start_a
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2e

    .line 2021
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$RemoteActionCompatParcelizer;

    invoke-direct {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$RemoteActionCompatParcelizer;-><init>(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V

    .line 2022
    iget-object v2, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->AudioAttributesCompatParcelizer:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2023
    iput-object v0, p1, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lo/RemoteActionCompatParcelizer;
    :try_end_1f
    .catchall {:try_start_a .. :try_end_1f} :catchall_37

    .line 2025
    :try_start_1f
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object p0

    invoke-interface {p0, v0}, Lo/AudioAttributesImplBaseParcelizer;->IconCompatParcelizer(Lo/RemoteActionCompatParcelizer;)V

    const/16 p0, 0xd

    .line 2026
    invoke-virtual {p1, p0, v1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V
    :try_end_2d
    .catch Landroid/os/RemoteException; {:try_start_1f .. :try_end_2d} :catch_35
    .catchall {:try_start_1f .. :try_end_2d} :catchall_37

    goto :goto_35

    .line 2032
    :cond_2e
    :try_start_2e
    iput-object v1, p1, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lo/RemoteActionCompatParcelizer;

    .line 2033
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->write:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_35
    .catchall {:try_start_2e .. :try_end_35} :catchall_37

    .line 2035
    :catch_35
    :goto_35
    monitor-exit p2

    return-void

    :catchall_37
    move-exception p0

    monitor-exit p2

    throw p0
.end method

.method public AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .registers 4

    .line 2231
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    invoke-virtual {p0, p1, p2, p3}, Landroid/media/session/MediaController;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    return-void
.end method

.method AudioAttributesImplBaseParcelizer()V
    .registers 5

    .line 2274
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    .line 2277
    :cond_9
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->write:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_37

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    .line 2278
    new-instance v2, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$RemoteActionCompatParcelizer;

    invoke-direct {v2, v1}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$RemoteActionCompatParcelizer;-><init>(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V

    .line 2279
    iget-object v3, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->AudioAttributesCompatParcelizer:Ljava/util/HashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2280
    iput-object v2, v1, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lo/RemoteActionCompatParcelizer;

    .line 2282
    :try_start_27
    iget-object v3, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {v3}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object v3

    invoke-interface {v3, v2}, Lo/AudioAttributesImplBaseParcelizer;->IconCompatParcelizer(Lo/RemoteActionCompatParcelizer;)V
    :try_end_30
    .catch Landroid/os/RemoteException; {:try_start_27 .. :try_end_30} :catch_37

    const/16 v2, 0xd

    const/4 v3, 0x0

    .line 2287
    invoke-virtual {v1, v2, v3, v3}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    goto :goto_f

    .line 2289
    :catch_37
    :cond_37
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->write:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public IconCompatParcelizer()Landroid/support/v4/media/MediaMetadataCompat;
    .registers 1

    .line 2093
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    invoke-virtual {p0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 2094
    invoke-static {p0}, Landroid/support/v4/media/MediaMetadataCompat;->read(Ljava/lang/Object;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method

.method public RemoteActionCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 2

    .line 2080
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 2082
    :try_start_8
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object v0

    invoke-interface {v0}, Lo/AudioAttributesImplBaseParcelizer;->AudioAttributesImplApi26Parcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p0
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_12} :catch_13

    return-object p0

    .line 2087
    :catch_13
    :cond_13
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    invoke-virtual {p0}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object p0

    if-eqz p0, :cond_20

    .line 2088
    invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompat;->write(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p0

    goto :goto_21

    :cond_20
    const/4 p0, 0x0

    :goto_21
    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V
    .registers 5

    .line 2040
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    iget-object v1, p1, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->read:Landroid/media/session/MediaController$Callback;

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->unregisterCallback(Landroid/media/session/MediaController$Callback;)V

    .line 2041
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    monitor-enter v0

    .line 2042
    :try_start_a
    iget-object v1, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object v1
    :try_end_10
    .catchall {:try_start_a .. :try_end_10} :catchall_30

    if-eqz v1, :cond_29

    .line 2044
    :try_start_12
    iget-object v1, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->AudioAttributesCompatParcelizer:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$RemoteActionCompatParcelizer;

    if-eqz v1, :cond_2e

    const/4 v2, 0x0

    .line 2046
    iput-object v2, p1, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lo/RemoteActionCompatParcelizer;

    .line 2047
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->AudioAttributesCompatParcelizer()Lo/AudioAttributesImplBaseParcelizer;

    move-result-object p0

    invoke-interface {p0, v1}, Lo/AudioAttributesImplBaseParcelizer;->AudioAttributesCompatParcelizer(Lo/RemoteActionCompatParcelizer;)V
    :try_end_28
    .catch Landroid/os/RemoteException; {:try_start_12 .. :try_end_28} :catch_2e
    .catchall {:try_start_12 .. :try_end_28} :catchall_30

    goto :goto_2e

    .line 2054
    :cond_29
    :try_start_29
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->write:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_2e
    .catchall {:try_start_29 .. :try_end_2e} :catchall_30

    .line 2056
    :catch_2e
    :cond_2e
    :goto_2e
    monitor-exit v0

    return-void

    :catchall_30
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/KeyEvent;)Z
    .registers 2

    .line 2061
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    invoke-virtual {p0, p1}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public read()Landroid/support/v4/media/session/MediaControllerCompat$read;
    .registers 2

    .line 2066
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    invoke-virtual {p0}, Landroid/media/session/MediaController;->getTransportControls()Landroid/media/session/MediaController$TransportControls;

    move-result-object p0

    .line 2068
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat$MediaBrowserCompatItemReceiver;

    invoke-direct {v0, p0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaBrowserCompatItemReceiver;-><init>(Landroid/media/session/MediaController$TransportControls;)V

    return-object v0
.end method

.method public write()Landroid/app/PendingIntent;
    .registers 1

    .line 2216
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->IconCompatParcelizer:Landroid/media/session/MediaController;

    invoke-virtual {p0}, Landroid/media/session/MediaController;->getSessionActivity()Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraBinderRequestResultReceiver (android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver)
.class Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ExtraBinderRequestResultReceiver"
.end annotation


# instance fields
.field private IconCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;)V
    .registers 3

    const/4 v0, 0x0

    .line 2317
    invoke-direct {p0, v0}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    .line 2318
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method protected onReceiveResult(ILandroid/os/Bundle;)V
    .registers 5

    .line 2323
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;

    if-eqz p0, :cond_31

    if-eqz p2, :cond_31

    .line 2327
    iget-object p1, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    monitor-enter p1

    .line 2328
    :try_start_f
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 2330
    const-string v1, "android.support.v4.media.session.EXTRA_BINDER"

    invoke-static {p2, v1}, Lo/_checkFromStringCoercion;->read(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    .line 2329
    invoke-static {v1}, Lo/AudioAttributesImplBaseParcelizer$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/IBinder;)Lo/AudioAttributesImplBaseParcelizer;

    move-result-object v1

    .line 2328
    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->IconCompatParcelizer(Lo/AudioAttributesImplBaseParcelizer;)V

    .line 2332
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->read:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 2333
    const-string v1, "android.support.v4.media.session.SESSION_TOKEN2"

    invoke-static {p2, v1}, Lo/getActivityLogo;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;Ljava/lang/String;)Lo/getApplicationInfo;

    move-result-object p2

    .line 2332
    invoke-virtual {v0, p2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->write(Lo/getApplicationInfo;)V

    .line 2335
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->AudioAttributesImplBaseParcelizer()V
    :try_end_2c
    .catchall {:try_start_f .. :try_end_2c} :catchall_2e

    .line 2336
    monitor-exit p1

    return-void

    :catchall_2e
    move-exception p0

    monitor-exit p1

    throw p0

    :cond_31
    return-void
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.RemoteActionCompatParcelizer (android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$RemoteActionCompatParcelizer)
.class Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$RemoteActionCompatParcelizer;
.super Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method constructor <init>(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V
    .registers 2

    .line 2342
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;-><init>(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2348
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public AudioAttributesCompatParcelizer(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2354
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public IconCompatParcelizer(Landroid/support/v4/media/session/ParcelableVolumeInfo;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2378
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public RemoteActionCompatParcelizer(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2360
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public write(Landroid/os/Bundle;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2372
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public write(Ljava/lang/CharSequence;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2366
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer (android.support.v4.media.session.MediaControllerCompat$RemoteActionCompatParcelizer)
.class public abstract Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "RemoteActionCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;,
        Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;,
        Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;
    }
.end annotation


# instance fields
.field IconCompatParcelizer:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;

.field RemoteActionCompatParcelizer:Lo/RemoteActionCompatParcelizer;

.field final read:Landroid/media/session/MediaController$Callback;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 671
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 673
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;

    invoke-direct {v0, p0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;-><init>(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->read:Landroid/media/session/MediaController$Callback;

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/os/Bundle;)V
    .registers 2

    return-void
.end method

.method public IconCompatParcelizer(I)V
    .registers 2

    return-void
.end method

.method public IconCompatParcelizer(Ljava/lang/CharSequence;)V
    .registers 2

    return-void
.end method

.method public IconCompatParcelizer(Z)V
    .registers 2

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;)V
    .registers 2

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 2

    return-void
.end method

.method public binderDied()V
    .registers 3

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 802
    invoke-virtual {p0, v0, v1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    return-void
.end method

.method public read()V
    .registers 1

    return-void
.end method

.method public read(I)V
    .registers 2

    return-void
.end method

.method public read(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public read(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public write()V
    .registers 1

    return-void
.end method

.method write(ILjava/lang/Object;Landroid/os/Bundle;)V
    .registers 4

    .line 822
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_e

    .line 823
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p0

    .line 824
    invoke-virtual {p0, p3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 825
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    :cond_e
    return-void
.end method

.method write(Landroid/os/Handler;)V
    .registers 3

    if-nez p1, :cond_12

    .line 810
    iget-object p1, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;

    if-eqz p1, :cond_11

    const/4 v0, 0x0

    .line 811
    iput-boolean v0, p1, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->IconCompatParcelizer:Z

    .line 812
    iget-object p1, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 813
    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;

    :cond_11
    return-void

    .line 816
    :cond_12
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;-><init>(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;Landroid/os/Looper;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;

    const/4 p0, 0x1

    .line 817
    iput-boolean p0, v0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->IconCompatParcelizer:Z

    return-void
.end method

.method public write(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 2

    return-void
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer.IconCompatParcelizer (android.support.v4.media.session.MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer)
.class Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;
.super Landroid/media/session/MediaController$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private final read:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 834
    invoke-direct {p0}, Landroid/media/session/MediaController$Callback;-><init>()V

    .line 835
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;->read:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onAudioInfoChanged(Landroid/media/session/MediaController$PlaybackInfo;)V
    .registers 9

    .line 908
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;->read:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_2b

    .line 911
    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getPlaybackType()I

    move-result v1

    .line 912
    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getAudioAttributes()Landroid/media/AudioAttributes;

    move-result-object v0

    invoke-static {v0}, Landroidx/media/AudioAttributesCompat;->write(Ljava/lang/Object;)Landroidx/media/AudioAttributesCompat;

    move-result-object v2

    .line 913
    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getVolumeControl()I

    move-result v3

    .line 914
    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getMaxVolume()I

    move-result v4

    .line 915
    new-instance v6, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getCurrentVolume()I

    move-result v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;-><init>(ILandroidx/media/AudioAttributesCompat;III)V

    .line 910
    invoke-virtual {p0, v6}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;)V

    :cond_2b
    return-void
.end method

.method public onExtrasChanged(Landroid/os/Bundle;)V
    .registers 2

    .line 899
    invoke-static {p1}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 900
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;->read:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_10

    .line 902
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)V

    :cond_10
    return-void
.end method

.method public onMetadataChanged(Landroid/media/MediaMetadata;)V
    .registers 2

    .line 875
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;->read:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_11

    .line 877
    invoke-static {p1}, Landroid/support/v4/media/MediaMetadataCompat;->read(Ljava/lang/Object;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(Landroid/support/v4/media/MediaMetadataCompat;)V

    :cond_11
    return-void
.end method

.method public onPlaybackStateChanged(Landroid/media/session/PlaybackState;)V
    .registers 3

    .line 862
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;->read:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_15

    .line 864
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lo/RemoteActionCompatParcelizer;

    if-nez v0, :cond_15

    .line 868
    invoke-static {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->write(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    .line 867
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    :cond_15
    return-void
.end method

.method public onQueueChanged(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/session/MediaSession$QueueItem;",
            ">;)V"
        }
    .end annotation

    .line 883
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;->read:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_11

    .line 885
    invoke-static {p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->IconCompatParcelizer(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->read(Ljava/util/List;)V

    :cond_11
    return-void
.end method

.method public onQueueTitleChanged(Ljava/lang/CharSequence;)V
    .registers 2

    .line 891
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;->read:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_d

    .line 893
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer(Ljava/lang/CharSequence;)V

    :cond_d
    return-void
.end method

.method public onSessionDestroyed()V
    .registers 1

    .line 840
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;->read:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_d

    .line 842
    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write()V

    :cond_d
    return-void
.end method

.method public onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 4

    .line 848
    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 849
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$IconCompatParcelizer;->read:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_12

    .line 851
    iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lo/RemoteActionCompatParcelizer;

    .line 855
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->read(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_12
    return-void
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer.HandlerC0001RemoteActionCompatParcelizer (android.support.v4.media.session.MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer)
.class Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field IconCompatParcelizer:Z

.field final synthetic read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;


# direct methods
.method constructor <init>(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;Landroid/os/Looper;)V
    .registers 3

    .line 1052
    iput-object p1, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    .line 1053
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 p1, 0x0

    .line 1050
    iput-boolean p1, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->IconCompatParcelizer:Z

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 3

    .line 1059
    iget-boolean v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->IconCompatParcelizer:Z

    if-eqz v0, :cond_8f

    .line 1062
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_90

    :pswitch_9
    return-void

    .line 1103
    :pswitch_a
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->read()V

    return-void

    .line 1088
    :pswitch_10
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->read(I)V

    return-void

    .line 1082
    :pswitch_1e
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer(Z)V

    return-void

    .line 1085
    :pswitch_2c
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer(I)V

    return-void

    .line 1100
    :pswitch_3a
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write()V

    return-void

    .line 1091
    :pswitch_40
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/os/Bundle;

    .line 1092
    invoke-static {p1}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1093
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)V

    return-void

    .line 1079
    :pswitch_4d
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer(Ljava/lang/CharSequence;)V

    return-void

    .line 1076
    :pswitch_57
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->read(Ljava/util/List;)V

    return-void

    .line 1097
    :pswitch_61
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;)V

    return-void

    .line 1073
    :pswitch_6b
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/support/v4/media/MediaMetadataCompat;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(Landroid/support/v4/media/MediaMetadataCompat;)V

    return-void

    .line 1070
    :pswitch_75
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/support/v4/media/session/PlaybackStateCompat;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    return-void

    .line 1064
    :pswitch_7f
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 1065
    invoke-static {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1066
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;->read:Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->read(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_8f
    return-void

    :pswitch_data_90
    .packed-switch 0x1
        :pswitch_7f
        :pswitch_75
        :pswitch_6b
        :pswitch_61
        :pswitch_57
        :pswitch_4d
        :pswitch_40
        :pswitch_3a
        :pswitch_2c
        :pswitch_9
        :pswitch_1e
        :pswitch_10
        :pswitch_a
    .end packed-switch
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer.read (android.support.v4.media.session.MediaControllerCompat$RemoteActionCompatParcelizer$read)
.class Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;
.super Lo/RemoteActionCompatParcelizer$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# instance fields
.field private final IconCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 923
    invoke-direct {p0}, Lo/RemoteActionCompatParcelizer$IconCompatParcelizer;-><init>()V

    .line 924
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 937
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_10

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 939
    invoke-virtual {p0, v0, v1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_10
    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 953
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_f

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 955
    invoke-virtual {p0, v0, p1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_f
    return-void
.end method

.method public IconCompatParcelizer(Landroid/support/v4/media/session/ParcelableVolumeInfo;)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1016
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_23

    const/4 v0, 0x0

    if-eqz p1, :cond_1e

    .line 1020
    new-instance v7, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;

    iget v2, p1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->AudioAttributesCompatParcelizer:I

    iget v3, p1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->write:I

    iget v4, p1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->IconCompatParcelizer:I

    iget v5, p1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->read:I

    iget v6, p1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->RemoteActionCompatParcelizer:I

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Landroid/support/v4/media/session/MediaControllerCompat$AudioAttributesCompatParcelizer;-><init>(IIIII)V

    goto :goto_1f

    :cond_1e
    move-object v7, v0

    :goto_1f
    const/4 p1, 0x4

    .line 1023
    invoke-virtual {p0, p1, v7, v0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_23
    return-void
.end method

.method public RemoteActionCompatParcelizer()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1029
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_10

    const/16 v0, 0xd

    const/4 v1, 0x0

    .line 1031
    invoke-virtual {p0, v0, v1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_10
    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 945
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_f

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 947
    invoke-virtual {p0, v0, p1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_f
    return-void
.end method

.method public RemoteActionCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 929
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_e

    const/4 v0, 0x1

    .line 931
    invoke-virtual {p0, v0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_e
    return-void
.end method

.method public RemoteActionCompatParcelizer(Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 961
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_f

    const/4 v0, 0x5

    const/4 v1, 0x0

    .line 963
    invoke-virtual {p0, v0, p1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_f
    return-void
.end method

.method public RemoteActionCompatParcelizer(Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 977
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_14

    .line 979
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v0, 0x0

    const/16 v1, 0xb

    invoke-virtual {p0, v1, p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_14
    return-void
.end method

.method public read(I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 986
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_14

    .line 988
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x0

    const/16 v1, 0x9

    invoke-virtual {p0, v1, p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_14
    return-void
.end method

.method public write(I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 999
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_14

    .line 1001
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x0

    const/16 v1, 0xc

    invoke-virtual {p0, v1, p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_14
    return-void
.end method

.method public write(Landroid/os/Bundle;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1008
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_f

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 1010
    invoke-virtual {p0, v0, p1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_f
    return-void
.end method

.method public write(Ljava/lang/CharSequence;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 969
    iget-object p0, p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_f

    const/4 v0, 0x6

    const/4 v1, 0x0

    .line 971
    invoke-virtual {p0, v0, p1, v1}, Landroid/support/v4/media/session/MediaControllerCompat$RemoteActionCompatParcelizer;->write(ILjava/lang/Object;Landroid/os/Bundle;)V

    :cond_f
    return-void
.end method

.method public write(Z)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.read (android.support.v4.media.session.MediaControllerCompat$read)
.class public abstract Landroid/support/v4/media/session/MediaControllerCompat$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "read"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()V
.end method

.method public abstract IconCompatParcelizer()V
.end method

.method public abstract RemoteActionCompatParcelizer()V
.end method

###### Class android.support.v4.media.session.MediaControllerCompat.write (android.support.v4.media.session.MediaControllerCompat$write)
.class Landroid/support/v4/media/session/MediaControllerCompat$write;
.super Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaControllerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .registers 3

    .line 2386
    invoke-direct {p0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    return-void
.end method
