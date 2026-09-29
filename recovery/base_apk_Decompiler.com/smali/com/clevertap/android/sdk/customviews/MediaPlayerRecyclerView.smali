###### Class com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView (com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView)
.class public final Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$RemoteActionCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0019\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B!\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u000eR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\'\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "Landroid/content/Context;",
        "p0",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "p1",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "p2",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "()V",
        "onCustomAction",
        "onCommand",
        "onPlayFromMediaId",
        "Lo/SimpleBasePlayerPlaylistTimeline;",
        "onFastForward",
        "()Lo/SimpleBasePlayerPlaylistTimeline;",
        "onMediaButtonEvent",
        "onPause",
        "onPrepare",
        "Landroid/graphics/drawable/Drawable;",
        "onPlay",
        "()Landroid/graphics/drawable/Drawable;",
        "onPlayFromSearch",
        "onPrepareFromMediaId",
        "Lo/lambdaonDrmKeysLoaded62;",
        "RemoteActionCompatParcelizer",
        "Lo/lambdaonDrmKeysLoaded62;",
        "IconCompatParcelizer",
        "Landroid/graphics/Rect;",
        "setSessionImpl",
        "Landroid/graphics/Rect;",
        "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;",
        "onSkipToNext",
        "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;",
        "AudioAttributesCompatParcelizer",
        "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;",
        "onStop",
        "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;",
        "read",
        "onSkipToPrevious",
        "Lo/SimpleBasePlayerPlaylistTimeline;",
        "write"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

.field private final onSkipToNext:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

.field private onSkipToPrevious:Lo/SimpleBasePlayerPlaylistTimeline;

.field private final onStop:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

.field private final setSessionImpl:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 26
    sget-object p1, Lo/lambdaonDownstreamFormatChanged28;->read:Lo/lambdaonDrmSessionReleased66;

    sget-object v0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1d

    .line 28
    new-instance p1, Lo/lambdaonIsPlayingChanged38;

    invoke-direct {p1}, Lo/lambdaonIsPlayingChanged38;-><init>()V

    check-cast p1, Lo/lambdaonDrmKeysLoaded62;

    goto :goto_24

    .line 31
    :cond_1d
    new-instance p1, Lo/lambdaonDrmSessionManagerError63;

    invoke-direct {p1}, Lo/lambdaonDrmSessionManagerError63;-><init>()V

    check-cast p1, Lo/lambdaonDrmKeysLoaded62;

    .line 26
    :goto_24
    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    .line 34
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->setSessionImpl:Landroid/graphics/Rect;

    .line 35
    new-instance p1, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver;-><init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToNext:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    .line 44
    new-instance p1, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;-><init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onStop:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    .line 61
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onMediaButtonEvent()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    sget-object p1, Lo/lambdaonDownstreamFormatChanged28;->read:Lo/lambdaonDrmSessionReleased66;

    sget-object p2, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_20

    .line 28
    new-instance p1, Lo/lambdaonIsPlayingChanged38;

    invoke-direct {p1}, Lo/lambdaonIsPlayingChanged38;-><init>()V

    check-cast p1, Lo/lambdaonDrmKeysLoaded62;

    goto :goto_27

    .line 31
    :cond_20
    new-instance p1, Lo/lambdaonDrmSessionManagerError63;

    invoke-direct {p1}, Lo/lambdaonDrmSessionManagerError63;-><init>()V

    check-cast p1, Lo/lambdaonDrmKeysLoaded62;

    .line 26
    :goto_27
    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    .line 34
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->setSessionImpl:Landroid/graphics/Rect;

    .line 35
    new-instance p1, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver;-><init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToNext:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    .line 44
    new-instance p1, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;-><init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onStop:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    .line 71
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onMediaButtonEvent()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    sget-object p1, Lo/lambdaonDownstreamFormatChanged28;->read:Lo/lambdaonDrmSessionReleased66;

    sget-object p2, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_20

    .line 28
    new-instance p1, Lo/lambdaonIsPlayingChanged38;

    invoke-direct {p1}, Lo/lambdaonIsPlayingChanged38;-><init>()V

    check-cast p1, Lo/lambdaonDrmKeysLoaded62;

    goto :goto_27

    .line 31
    :cond_20
    new-instance p1, Lo/lambdaonDrmSessionManagerError63;

    invoke-direct {p1}, Lo/lambdaonDrmSessionManagerError63;-><init>()V

    check-cast p1, Lo/lambdaonDrmKeysLoaded62;

    .line 26
    :goto_27
    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    .line 34
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->setSessionImpl:Landroid/graphics/Rect;

    .line 35
    new-instance p1, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver;-><init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToNext:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    .line 44
    new-instance p1, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;

    invoke-direct {p1, p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;-><init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onStop:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    .line 82
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onMediaButtonEvent()V

    return-void
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V
    .registers 1

    .line 22
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onPrepare()V

    return-void
.end method

.method public static final synthetic IconCompatParcelizer(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V
    .registers 1

    .line 22
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onPause()V

    return-void
.end method

.method private static final MediaBrowserCompatItemReceiver(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)Ljava/lang/Float;
    .registers 2

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    invoke-interface {v0}, Lo/lambdaonDrmKeysLoaded62;->IconCompatParcelizer()V

    .line 132
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    invoke-interface {p0}, Lo/lambdaonDrmKeysLoaded62;->RemoteActionCompatParcelizer()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 22
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onPlay()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private final onFastForward()Lo/SimpleBasePlayerPlaylistTimeline;
    .registers 11

    .line 160
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver()I

    move-result v0

    goto :goto_f

    :cond_e
    move v0, v1

    .line 161
    :goto_f
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaMetadataCompat()I

    move-result v2

    goto :goto_1d

    :cond_1c
    move v2, v1

    :goto_1d
    const/4 v3, 0x0

    if-gt v0, v2, :cond_5d

    move v4, v0

    move v5, v1

    move-object v6, v3

    :goto_23
    sub-int v7, v4, v0

    .line 165
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    if-nez v7, :cond_2c

    goto :goto_57

    .line 167
    :cond_2c
    invoke-virtual {v7}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lo/SimpleBasePlayerPlaylistTimeline;

    if-eqz v8, :cond_37

    check-cast v7, Lo/SimpleBasePlayerPlaylistTimeline;

    goto :goto_38

    :cond_37
    move-object v7, v3

    :goto_38
    if-eqz v7, :cond_57

    .line 169
    invoke-virtual {v7}, Lo/SimpleBasePlayerPlaylistTimeline;->AudioAttributesCompatParcelizer()Z

    move-result v8

    if-nez v8, :cond_41

    goto :goto_57

    .line 172
    :cond_41
    iget-object v8, v7, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    iget-object v9, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->setSessionImpl:Landroid/graphics/Rect;

    invoke-virtual {v8, v9}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v8

    if-eqz v8, :cond_52

    .line 174
    iget-object v8, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->setSessionImpl:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v8

    goto :goto_53

    :cond_52
    move v8, v1

    :goto_53
    if-le v8, v5, :cond_57

    move-object v6, v7

    move v5, v8

    :cond_57
    :goto_57
    if-eq v4, v2, :cond_5c

    add-int/lit8 v4, v4, 0x1

    goto :goto_23

    :cond_5c
    return-object v6

    :cond_5d
    return-object v3
.end method

.method private final onMediaButtonEvent()V
    .registers 6

    .line 188
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    .line 189
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    new-instance v3, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$AudioAttributesCompatParcelizer;

    invoke-direct {v3, p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lo/getCreatedOnDateMs;

    .line 191
    new-instance v4, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$write;

    invoke-direct {v4, p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$write;-><init>(Ljava/lang/Object;)V

    check-cast v4, Lo/getCreatedOnDateMs;

    .line 188
    invoke-interface {v0, v1, v3, v4}, Lo/lambdaonDrmKeysLoaded62;->AudioAttributesCompatParcelizer(Landroid/content/Context;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V

    .line 193
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    .line 194
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    new-instance v2, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$read;

    invoke-direct {v2, p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$read;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lo/getCreatedOnDateMs;

    .line 193
    invoke-interface {v0, v1, v2}, Lo/lambdaonDrmKeysLoaded62;->IconCompatParcelizer(Landroid/content/Context;Lo/getCreatedOnDateMs;)V

    .line 197
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onPlayFromSearch()V

    return-void
.end method

.method private final onPause()V
    .registers 1

    .line 201
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToPrevious:Lo/SimpleBasePlayerPlaylistTimeline;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lo/SimpleBasePlayerPlaylistTimeline;->read()V

    :cond_7
    return-void
.end method

.method private final onPlay()Landroid/graphics/drawable/Drawable;
    .registers 3

    .line 209
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lo/RendererCapabilitiesAdaptiveSupport$read;->ct_audio:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lo/_parseDoublePrimitive;->read(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    return-object p0
.end method

.method private final onPlayFromSearch()V
    .registers 2

    .line 213
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToNext:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;)V

    .line 214
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onStop:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;)V

    .line 215
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToNext:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;)V

    .line 216
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onStop:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;)V

    return-void
.end method

.method private final onPrepare()V
    .registers 1

    .line 205
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToPrevious:Lo/SimpleBasePlayerPlaylistTimeline;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lo/SimpleBasePlayerPlaylistTimeline;->MediaBrowserCompatCustomActionResultReceiver()V

    :cond_7
    return-void
.end method

.method private final onPrepareFromMediaId()V
    .registers 2

    .line 220
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    invoke-interface {v0}, Lo/lambdaonDrmKeysLoaded62;->write()V

    .line 221
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToPrevious:Lo/SimpleBasePlayerPlaylistTimeline;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Lo/SimpleBasePlayerPlaylistTimeline;->AudioAttributesImplApi26Parcelizer()V

    :cond_c
    return-void
.end method

.method private static final read(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;Ljava/lang/String;ZZ)Ljava/lang/Void;
    .registers 6

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    iget-object v1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    invoke-interface {v1, p0, p1, p2, p3}, Lo/lambdaonDrmKeysLoaded62;->write(Landroid/content/Context;Ljava/lang/String;ZZ)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final synthetic read(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)Lo/SimpleBasePlayerPlaylistTimeline;
    .registers 1

    .line 22
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToPrevious:Lo/SimpleBasePlayerPlaylistTimeline;

    return-object p0
.end method

.method public static synthetic write(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)Ljava/lang/Float;
    .registers 1

    .line 222
    invoke-static {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->MediaBrowserCompatItemReceiver(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic write(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;Ljava/lang/String;ZZ)Ljava/lang/Void;
    .registers 4

    .line 223
    invoke-static {p0, p1, p2, p3}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->read(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;Ljava/lang/String;ZZ)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 2

    .line 86
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lo/lambdaonDrmKeysLoaded62;->RemoteActionCompatParcelizer(Z)V

    return-void
.end method

.method public final onCommand()V
    .registers 6

    .line 95
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onFastForward()Lo/SimpleBasePlayerPlaylistTimeline;

    move-result-object v0

    if-nez v0, :cond_a

    .line 99
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onPrepareFromMediaId()V

    return-void

    .line 104
    :cond_a
    iget-object v1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToPrevious:Lo/SimpleBasePlayerPlaylistTimeline;

    if-eqz v1, :cond_40

    .line 105
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {v2, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_40

    .line 106
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    iget-object v2, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->setSessionImpl:Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_39

    .line 108
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->setSessionImpl:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    const/16 v2, 0x190

    if-lt v0, v2, :cond_39

    .line 113
    invoke-virtual {v1}, Lo/SimpleBasePlayerPlaylistTimeline;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-eqz v0, :cond_39

    .line 114
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lo/lambdaonDrmKeysLoaded62;->RemoteActionCompatParcelizer(Z)V

    return-void

    .line 116
    :cond_39
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lo/lambdaonDrmKeysLoaded62;->RemoteActionCompatParcelizer(Z)V

    return-void

    .line 125
    :cond_40
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onPrepareFromMediaId()V

    .line 126
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onMediaButtonEvent()V

    .line 127
    iget-object v1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    invoke-interface {v1}, Lo/lambdaonDrmKeysLoaded62;->RemoteActionCompatParcelizer()F

    move-result v1

    .line 128
    new-instance v2, Lo/lambdahandleReplaceMediaItems30;

    invoke-direct {v2, p0}, Lo/lambdahandleReplaceMediaItems30;-><init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    new-instance v3, Lo/lambdaincreaseDeviceVolume25;

    invoke-direct {v3, p0}, Lo/lambdaincreaseDeviceVolume25;-><init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    .line 143
    iget-object v4, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    invoke-interface {v4}, Lo/lambdaonDrmKeysLoaded62;->read()Landroid/view/View;

    move-result-object v4

    .line 128
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/SimpleBasePlayerPlaylistTimeline;->IconCompatParcelizer(FLo/getCreatedOnDateMs;Lo/getModuleData;Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_64

    .line 146
    iput-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToPrevious:Lo/SimpleBasePlayerPlaylistTimeline;

    :cond_64
    return-void
.end method

.method public final onCustomAction()V
    .registers 1

    .line 90
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onMediaButtonEvent()V

    .line 91
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onCommand()V

    return-void
.end method

.method public final onPlayFromMediaId()V
    .registers 2

    .line 154
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer:Lo/lambdaonDrmKeysLoaded62;

    invoke-interface {v0}, Lo/lambdaonDrmKeysLoaded62;->write()V

    const/4 v0, 0x0

    .line 155
    iput-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onSkipToPrevious:Lo/SimpleBasePlayerPlaylistTimeline;

    return-void
.end method

###### Class com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView.AudioAttributesCompatParcelizer (com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$AudioAttributesCompatParcelizer)
.class final synthetic Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$AudioAttributesCompatParcelizer;
.super Lo/MagicModuleRepositoryImpl_Factory;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onMediaButtonEvent()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1010
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleRepositoryImpl_Factory;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const/4 v1, 0x0

    .line 191
    const-class v3, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    const-string v4, "onPause"

    const-string v5, "onPause()V"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lo/MagicModuleRepositoryImpl_Factory;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 190
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$AudioAttributesCompatParcelizer;->read()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final read()V
    .registers 1

    .line 190
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Ljava/lang/Object;

    check-cast p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    invoke-static {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->IconCompatParcelizer(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    return-void
.end method

###### Class com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView.IconCompatParcelizer (com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$IconCompatParcelizer)
.class public final Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private synthetic read:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;


# direct methods
.method constructor <init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V
    .registers 2

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;->read:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 2

    .line 50
    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final read(Landroid/view/View;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;->read:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    invoke-static {v0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->read(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)Lo/SimpleBasePlayerPlaylistTimeline;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$IconCompatParcelizer;->read:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    .line 48
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {v0, p1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 49
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onPlayFromMediaId()V

    :cond_1a
    return-void
.end method

###### Class com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView.MediaBrowserCompatCustomActionResultReceiver (com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver)
.class public final Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver;
.super Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private synthetic write:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;


# direct methods
.method constructor <init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V
    .registers 2

    iput-object p1, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver;->write:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    .line 35
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_f

    .line 39
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$MediaBrowserCompatCustomActionResultReceiver;->write:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onCommand()V

    :cond_f
    return-void
.end method

###### Class com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView.RemoteActionCompatParcelizer (com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$RemoteActionCompatParcelizer)
.class public final synthetic Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1011
    name = "RemoteActionCompatParcelizer"
.end annotation


# static fields
.field public static final synthetic RemoteActionCompatParcelizer:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    invoke-static {}, Lo/lambdaonDrmSessionReleased66;->values()[Lo/lambdaonDrmSessionReleased66;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_7
    sget-object v1, Lo/lambdaonDrmSessionReleased66;->write:Lo/lambdaonDrmSessionReleased66;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_10} :catch_10

    :catch_10
    sput-object v0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:[I

    return-void
.end method

###### Class com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView.read (com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$read)
.class final synthetic Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$read;
.super Lo/MagicModuleRepositoryImpl_Factory;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onMediaButtonEvent()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1010
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleRepositoryImpl_Factory;",
        "Lo/getCreatedOnDateMs<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const/4 v1, 0x0

    .line 196
    const-class v3, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    const-string v4, "onPlay"

    const-string v5, "onPlay()Landroid/graphics/drawable/Drawable;"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lo/MagicModuleRepositoryImpl_Factory;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 195
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$read;->AudioAttributesImplApi26Parcelizer:Ljava/lang/Object;

    check-cast p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    invoke-static {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->RemoteActionCompatParcelizer(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 195
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$read;->AudioAttributesCompatParcelizer()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

###### Class com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView.write (com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView$write)
.class final synthetic Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$write;
.super Lo/MagicModuleRepositoryImpl_Factory;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->onMediaButtonEvent()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1010
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleRepositoryImpl_Factory;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const/4 v1, 0x0

    .line 192
    const-class v3, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    const-string v4, "onPrepare"

    const-string v5, "onPrepare()V"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lo/MagicModuleRepositoryImpl_Factory;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()V
    .registers 1

    .line 191
    iget-object p0, p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$write;->AudioAttributesImplApi26Parcelizer:Ljava/lang/Object;

    check-cast p0, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    invoke-static {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->AudioAttributesCompatParcelizer(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V

    return-void
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 191
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView$write;->RemoteActionCompatParcelizer()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class kotlin.lambdahandleReplaceMediaItems30 (o.lambdahandleReplaceMediaItems30)
.class public final synthetic Lo/lambdahandleReplaceMediaItems30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field private synthetic write:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;


# direct methods
.method public synthetic constructor <init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/lambdahandleReplaceMediaItems30;->write:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/lambdahandleReplaceMediaItems30;->write:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    invoke-static {p0}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->write(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.lambdaincreaseDeviceVolume25 (o.lambdaincreaseDeviceVolume25)
.class public final synthetic Lo/lambdaincreaseDeviceVolume25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getModuleData;


# instance fields
.field private synthetic IconCompatParcelizer:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;


# direct methods
.method public synthetic constructor <init>(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/lambdaincreaseDeviceVolume25;->IconCompatParcelizer:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 0
    iget-object p0, p0, Lo/lambdaincreaseDeviceVolume25;->IconCompatParcelizer:Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-static {p0, p1, p2, p3}, Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;->write(Lcom/clevertap/android/sdk/customviews/MediaPlayerRecyclerView;Ljava/lang/String;ZZ)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method
