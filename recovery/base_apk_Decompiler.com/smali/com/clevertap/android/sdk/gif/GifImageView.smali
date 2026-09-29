###### Class com.clevertap.android.sdk.gif.GifImageView (com.clevertap.android.sdk.gif.GifImageView)
.class public Lcom/clevertap/android/sdk/gif/GifImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/clevertap/android/sdk/gif/GifImageView$write;,
        Lcom/clevertap/android/sdk/gif/GifImageView$AudioAttributesCompatParcelizer;,
        Lcom/clevertap/android/sdk/gif/GifImageView$IconCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/lang/Thread;

.field private AudioAttributesImplApi21Parcelizer:Z

.field private AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

.field private AudioAttributesImplBaseParcelizer:J

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Lcom/clevertap/android/sdk/gif/GifImageView$IconCompatParcelizer;

.field private final MediaBrowserCompatItemReceiver:Landroid/os/Handler;

.field private MediaBrowserCompatMediaItem:Z

.field private MediaDescriptionCompat:Landroid/graphics/Bitmap;

.field private final RatingCompat:Ljava/lang/Runnable;

.field private RemoteActionCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView$AudioAttributesCompatParcelizer;

.field private final read:Ljava/lang/Runnable;

.field private write:Lcom/clevertap/android/sdk/gif/GifImageView$write;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    .line 77
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->write:Lcom/clevertap/android/sdk/gif/GifImageView$write;

    .line 34
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->RemoteActionCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView$AudioAttributesCompatParcelizer;

    .line 38
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatCustomActionResultReceiver:Lcom/clevertap/android/sdk/gif/GifImageView$IconCompatParcelizer;

    const-wide/16 v0, -0x1

    .line 40
    iput-wide v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplBaseParcelizer:J

    .line 44
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatItemReceiver:Landroid/os/Handler;

    .line 52
    new-instance p1, Lcom/clevertap/android/sdk/gif/GifImageView$2;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/gif/GifImageView$2;-><init>(Lcom/clevertap/android/sdk/gif/GifImageView;)V

    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->read:Ljava/lang/Runnable;

    .line 62
    new-instance p1, Lcom/clevertap/android/sdk/gif/GifImageView$5;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/gif/GifImageView$5;-><init>(Lcom/clevertap/android/sdk/gif/GifImageView;)V

    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->RatingCompat:Ljava/lang/Runnable;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 73
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->write:Lcom/clevertap/android/sdk/gif/GifImageView$write;

    .line 34
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->RemoteActionCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView$AudioAttributesCompatParcelizer;

    .line 38
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatCustomActionResultReceiver:Lcom/clevertap/android/sdk/gif/GifImageView$IconCompatParcelizer;

    const-wide/16 p1, -0x1

    .line 40
    iput-wide p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplBaseParcelizer:J

    .line 44
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatItemReceiver:Landroid/os/Handler;

    .line 52
    new-instance p1, Lcom/clevertap/android/sdk/gif/GifImageView$2;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/gif/GifImageView$2;-><init>(Lcom/clevertap/android/sdk/gif/GifImageView;)V

    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->read:Ljava/lang/Runnable;

    .line 62
    new-instance p1, Lcom/clevertap/android/sdk/gif/GifImageView$5;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/gif/GifImageView$5;-><init>(Lcom/clevertap/android/sdk/gif/GifImageView;)V

    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->RatingCompat:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Lcom/clevertap/android/sdk/gif/GifImageView;)Lo/lambdaupdateStateAndInformListeners32;
    .registers 2

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

    return-object v0
.end method

.method private AudioAttributesImplApi21Parcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 237
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    .line 239
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesCompatParcelizer:Ljava/lang/Thread;

    if-eqz v0, :cond_d

    .line 240
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    const/4 v0, 0x0

    .line 241
    iput-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesCompatParcelizer:Ljava/lang/Thread;

    :cond_d
    return-void
.end method

.method static synthetic IconCompatParcelizer(Lcom/clevertap/android/sdk/gif/GifImageView;)Landroid/graphics/Bitmap;
    .registers 1

    .line 11
    iget-object p0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaDescriptionCompat:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private IconCompatParcelizer()V
    .registers 3

    .line 137
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

    invoke-virtual {v0}, Lo/lambdaupdateStateAndInformListeners32;->RemoteActionCompatParcelizer()I

    move-result v0

    if-nez v0, :cond_9

    return-void

    .line 140
    :cond_9
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/lambdaupdateStateAndInformListeners32;->IconCompatParcelizer(I)Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    if-nez v0, :cond_1c

    const/4 v0, 0x1

    .line 141
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi21Parcelizer:Z

    .line 142
    invoke-direct {p0}, Lcom/clevertap/android/sdk/gif/GifImageView;->RemoteActionCompatParcelizer()V

    :cond_1c
    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Lcom/clevertap/android/sdk/gif/GifImageView;)Ljava/lang/Thread;
    .registers 2

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesCompatParcelizer:Ljava/lang/Thread;

    return-object v0
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 2

    .line 256
    invoke-direct {p0}, Lcom/clevertap/android/sdk/gif/GifImageView;->write()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 257
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesCompatParcelizer:Ljava/lang/Thread;

    .line 258
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_10
    return-void
.end method

.method static synthetic read(Lcom/clevertap/android/sdk/gif/GifImageView;)Z
    .registers 2

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatMediaItem:Z

    return v0
.end method

.method static synthetic write(Lcom/clevertap/android/sdk/gif/GifImageView;)Landroid/graphics/Bitmap;
    .registers 2

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaDescriptionCompat:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private write()Z
    .registers 2

    .line 252
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz v0, :cond_12

    :cond_8
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

    if-eqz v0, :cond_12

    iget-object p0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesCompatParcelizer:Ljava/lang/Thread;

    if-nez p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 2

    const/4 v0, 0x1

    .line 232
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    .line 233
    invoke-direct {p0}, Lcom/clevertap/android/sdk/gif/GifImageView;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 1

    .line 247
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatImageView;->onDetachedFromWindow()V

    .line 248
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/gif/GifImageView;->read()V

    return-void
.end method

.method public final read()V
    .registers 2

    const/4 v0, 0x0

    .line 81
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    .line 82
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi21Parcelizer:Z

    const/4 v0, 0x1

    .line 83
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatMediaItem:Z

    .line 84
    invoke-direct {p0}, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi21Parcelizer()V

    .line 85
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatItemReceiver:Landroid/os/Handler;

    iget-object p0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->read:Ljava/lang/Runnable;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public run()V
    .registers 8

    .line 162
    :cond_0
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz v0, :cond_5d

    .line 165
    :cond_8
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

    invoke-virtual {v0}, Lo/lambdaupdateStateAndInformListeners32;->AudioAttributesCompatParcelizer()Z

    move-result v0

    const-wide/16 v1, 0x0

    .line 170
    :try_start_10
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    .line 171
    iget-object v5, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

    invoke-virtual {v5}, Lo/lambdaupdateStateAndInformListeners32;->IconCompatParcelizer()Landroid/graphics/Bitmap;

    move-result-object v5

    iput-object v5, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaDescriptionCompat:Landroid/graphics/Bitmap;

    .line 172
    iget-object v5, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatCustomActionResultReceiver:Lcom/clevertap/android/sdk/gif/GifImageView$IconCompatParcelizer;

    if-eqz v5, :cond_26

    .line 173
    invoke-interface {v5}, Lcom/clevertap/android/sdk/gif/GifImageView$IconCompatParcelizer;->IconCompatParcelizer()Landroid/graphics/Bitmap;

    move-result-object v5

    iput-object v5, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaDescriptionCompat:Landroid/graphics/Bitmap;

    .line 175
    :cond_26
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long/2addr v5, v3

    const-wide/32 v3, 0xf4240

    div-long/2addr v5, v3
    :try_end_2f
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_10 .. :try_end_2f} :catch_37
    .catch Ljava/lang/IllegalArgumentException; {:try_start_10 .. :try_end_2f} :catch_37

    .line 176
    :try_start_2f
    iget-object v3, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatItemReceiver:Landroid/os/Handler;

    iget-object v4, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->RatingCompat:Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_36
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2f .. :try_end_36} :catch_38
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2f .. :try_end_36} :catch_38

    goto :goto_38

    :catch_37
    move-wide v5, v1

    :catch_38
    :goto_38
    const/4 v3, 0x0

    .line 181
    iput-boolean v3, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi21Parcelizer:Z

    .line 182
    iget-boolean v4, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    if-eqz v4, :cond_5b

    if-eqz v0, :cond_5b

    .line 187
    :try_start_41
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

    invoke-virtual {v0}, Lo/lambdaupdateStateAndInformListeners32;->write()I

    move-result v0

    int-to-long v3, v0

    sub-long/2addr v3, v5

    long-to-int v0, v3

    if-lez v0, :cond_56

    .line 193
    iget-wide v3, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplBaseParcelizer:J

    cmp-long v1, v3, v1

    if-gtz v1, :cond_53

    int-to-long v3, v0

    :cond_53
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_56
    .catch Ljava/lang/InterruptedException; {:try_start_41 .. :try_end_56} :catch_56

    .line 198
    :catch_56
    :cond_56
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    if-nez v0, :cond_0

    goto :goto_5d

    .line 183
    :cond_5b
    iput-boolean v3, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    .line 200
    :cond_5d
    :goto_5d
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatMediaItem:Z

    if-eqz v0, :cond_68

    .line 201
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatItemReceiver:Landroid/os/Handler;

    iget-object v1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->read:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_68
    const/4 v0, 0x0

    .line 203
    iput-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesCompatParcelizer:Ljava/lang/Thread;

    return-void
.end method

.method public setBytes([B)V
    .registers 3

    .line 211
    new-instance v0, Lo/lambdaupdateStateAndInformListeners32;

    invoke-direct {v0}, Lo/lambdaupdateStateAndInformListeners32;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

    .line 213
    :try_start_7
    invoke-virtual {v0, p1}, Lo/lambdaupdateStateAndInformListeners32;->read([B)I
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_a} :catch_16

    .line 220
    iget-boolean p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer:Z

    if-eqz p1, :cond_12

    .line 221
    invoke-direct {p0}, Lcom/clevertap/android/sdk/gif/GifImageView;->RemoteActionCompatParcelizer()V

    return-void

    .line 223
    :cond_12
    invoke-direct {p0}, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer()V

    return-void

    :catch_16
    const/4 p1, 0x0

    .line 215
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplApi26Parcelizer:Lo/lambdaupdateStateAndInformListeners32;

    return-void
.end method

.method public setFramesDisplayDuration(J)V
    .registers 3

    .line 109
    iput-wide p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesImplBaseParcelizer:J

    return-void
.end method

.method public setOnAnimationStart(Lcom/clevertap/android/sdk/gif/GifImageView$write;)V
    .registers 2

    .line 228
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->write:Lcom/clevertap/android/sdk/gif/GifImageView$write;

    return-void
.end method

.method public setOnAnimationStop(Lcom/clevertap/android/sdk/gif/GifImageView$AudioAttributesCompatParcelizer;)V
    .registers 2

    .line 125
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->RemoteActionCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView$AudioAttributesCompatParcelizer;

    return-void
.end method

.method public setOnFrameAvailable(Lcom/clevertap/android/sdk/gif/GifImageView$IconCompatParcelizer;)V
    .registers 2

    .line 133
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView;->MediaBrowserCompatCustomActionResultReceiver:Lcom/clevertap/android/sdk/gif/GifImageView$IconCompatParcelizer;

    return-void
.end method

###### Class com.clevertap.android.sdk.gif.GifImageView.AnonymousClass2 (com.clevertap.android.sdk.gif.GifImageView$2)
.class final Lcom/clevertap/android/sdk/gif/GifImageView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/gif/GifImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;


# direct methods
.method constructor <init>(Lcom/clevertap/android/sdk/gif/GifImageView;)V
    .registers 2

    .line 52
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView$2;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 55
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView$2;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    invoke-static {v0}, Lcom/clevertap/android/sdk/gif/GifImageView;->write(Lcom/clevertap/android/sdk/gif/GifImageView;)Landroid/graphics/Bitmap;

    .line 56
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView$2;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    invoke-static {v0}, Lcom/clevertap/android/sdk/gif/GifImageView;->AudioAttributesCompatParcelizer(Lcom/clevertap/android/sdk/gif/GifImageView;)Lo/lambdaupdateStateAndInformListeners32;

    .line 57
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView$2;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    invoke-static {v0}, Lcom/clevertap/android/sdk/gif/GifImageView;->RemoteActionCompatParcelizer(Lcom/clevertap/android/sdk/gif/GifImageView;)Ljava/lang/Thread;

    .line 58
    iget-object p0, p0, Lcom/clevertap/android/sdk/gif/GifImageView$2;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    invoke-static {p0}, Lcom/clevertap/android/sdk/gif/GifImageView;->read(Lcom/clevertap/android/sdk/gif/GifImageView;)Z

    return-void
.end method

###### Class com.clevertap.android.sdk.gif.GifImageView.AnonymousClass5 (com.clevertap.android.sdk.gif.GifImageView$5)
.class final Lcom/clevertap/android/sdk/gif/GifImageView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/gif/GifImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;


# direct methods
.method constructor <init>(Lcom/clevertap/android/sdk/gif/GifImageView;)V
    .registers 2

    .line 62
    iput-object p1, p0, Lcom/clevertap/android/sdk/gif/GifImageView$5;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 65
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView$5;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    invoke-static {v0}, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer(Lcom/clevertap/android/sdk/gif/GifImageView;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView$5;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    invoke-static {v0}, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer(Lcom/clevertap/android/sdk/gif/GifImageView;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_24

    .line 66
    iget-object v0, p0, Lcom/clevertap/android/sdk/gif/GifImageView$5;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    invoke-static {v0}, Lcom/clevertap/android/sdk/gif/GifImageView;->IconCompatParcelizer(Lcom/clevertap/android/sdk/gif/GifImageView;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 67
    iget-object p0, p0, Lcom/clevertap/android/sdk/gif/GifImageView$5;->AudioAttributesCompatParcelizer:Lcom/clevertap/android/sdk/gif/GifImageView;

    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_24
    return-void
.end method

###### Class com.clevertap.android.sdk.gif.GifImageView.AudioAttributesCompatParcelizer (com.clevertap.android.sdk.gif.GifImageView$AudioAttributesCompatParcelizer)
.class public interface abstract Lcom/clevertap/android/sdk/gif/GifImageView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/gif/GifImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesCompatParcelizer"
.end annotation

###### Class com.clevertap.android.sdk.gif.GifImageView.IconCompatParcelizer (com.clevertap.android.sdk.gif.GifImageView$IconCompatParcelizer)
.class public interface abstract Lcom/clevertap/android/sdk/gif/GifImageView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/gif/GifImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IconCompatParcelizer"
.end annotation


# virtual methods
.method public abstract IconCompatParcelizer()Landroid/graphics/Bitmap;
.end method

###### Class com.clevertap.android.sdk.gif.GifImageView.write (com.clevertap.android.sdk.gif.GifImageView$write)
.class public interface abstract Lcom/clevertap/android/sdk/gif/GifImageView$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/gif/GifImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation
