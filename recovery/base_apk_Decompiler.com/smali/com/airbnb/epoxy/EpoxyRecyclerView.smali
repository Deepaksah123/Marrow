###### Class com.airbnb.epoxy.EpoxyRecyclerView (com.airbnb.epoxy.EpoxyRecyclerView)
.class public Lcom/airbnb/epoxy/EpoxyRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/epoxy/EpoxyRecyclerView$RemoteActionCompatParcelizer;,
        Lcom/airbnb/epoxy/EpoxyRecyclerView$read;,
        Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;,
        Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;,
        Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u0000 H2\u00020\u0001:\u0005H>X;YB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u000cJ\u000f\u0010\u0017\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u000cJ\u000f\u0010\u0018\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u000cJ\u000f\u0010\u0019\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u000cJ\u000f\u0010\u001a\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u000cJ\u000f\u0010\u001b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u000cJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\u0008\u001c\u0010\u0015J\u001d\u0010\u001e\u001a\u00020\n2\u000c\u0010\u0003\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020 \u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020 \u00a2\u0006\u0004\u0008#\u0010\"J\u0015\u0010$\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\u0008$\u0010%J\u0015\u0010&\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\u0008&\u0010%J\u0017\u0010\'\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\'\u0010%J\u0015\u0010(\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\u0008(\u0010%J\u0019\u0010)\u001a\u00020\n2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008,\u0010-J!\u00100\u001a\u00020\n2\u0010\u0010\u0003\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030/0.H\u0016\u00a2\u0006\u0004\u00080\u00101J\u0015\u00103\u001a\u00020\n2\u0006\u0010\u0003\u001a\u000202\u00a2\u0006\u0004\u00083\u00104J%\u00105\u001a\u00020\n2\u000c\u0010\u0003\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u000202H\u0016\u00a2\u0006\u0004\u00085\u00106J\u000f\u00107\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u00087\u0010\u000cJ\u000f\u00108\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u00088\u0010\u000cR\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0016\u0010A\u001a\u0002028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R&\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030C0B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u001e\u0010H\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030F0B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010ER\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0016\u0010N\u001a\u0002028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010@R\u001c\u0010Q\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u001a\u0010W\u001a\u00020R8\u0005X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010V"
    }
    d2 = {
        "Lcom/airbnb/epoxy/EpoxyRecyclerView;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "Landroid/content/Context;",
        "p0",
        "Landroid/util/AttributeSet;",
        "p1",
        "",
        "p2",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "onFastForward",
        "()V",
        "onPause",
        "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;",
        "onPrepareFromMediaId",
        "()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;",
        "Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;",
        "onCustomAction",
        "()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;",
        "RatingCompat",
        "(I)I",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "onPlay",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "onMediaButtonEvent",
        "requestLayout",
        "MediaDescriptionCompat",
        "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;",
        "setAdapter",
        "(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V",
        "Lo/getContentBufferedPosition;",
        "setController",
        "(Lo/getContentBufferedPosition;)V",
        "setControllerAndBuildModels",
        "setDelayMsWhenRemovingAdapterOnDetach",
        "(I)V",
        "setItemSpacingDp",
        "setItemSpacingPx",
        "setItemSpacingRes",
        "setLayoutManager",
        "(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V",
        "Landroid/view/ViewGroup$LayoutParams;",
        "setLayoutParams",
        "(Landroid/view/ViewGroup$LayoutParams;)V",
        "",
        "Lo/getCurrentPeriodIndex;",
        "setModels",
        "(Ljava/util/List;)V",
        "",
        "setRemoveAdapterWhenDetachedFromWindow",
        "(Z)V",
        "IconCompatParcelizer",
        "(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V",
        "onPlayFromMediaId",
        "onPrepare",
        "onSkipToNext",
        "I",
        "AudioAttributesCompatParcelizer",
        "setSessionImpl",
        "Lo/getContentBufferedPosition;",
        "read",
        "onStop",
        "Z",
        "write",
        "",
        "Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;",
        "onSkipToQueueItem",
        "Ljava/util/List;",
        "Lo/setThrowsWhenUsingWrongThread;",
        "MediaSessionCompatResultReceiverWrapper",
        "RemoteActionCompatParcelizer",
        "Ljava/lang/Runnable;",
        "ParcelableVolumeInfo",
        "Ljava/lang/Runnable;",
        "AudioAttributesImplApi21Parcelizer",
        "MediaSessionCompatQueueItem",
        "AudioAttributesImplApi26Parcelizer",
        "MediaSessionCompatToken",
        "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;",
        "AudioAttributesImplBaseParcelizer",
        "Lo/getCurrentTimeline;",
        "PlaybackStateCompat",
        "Lo/getCurrentTimeline;",
        "onCommand",
        "()Lo/getCurrentTimeline;",
        "MediaBrowserCompatCustomActionResultReceiver",
        "ModelBuilderCallbackController",
        "WithModelsController"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# static fields
.field public static final RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView$RemoteActionCompatParcelizer;

.field private static final onSkipToPrevious:Lo/updateAvailableCommands;


# instance fields
.field private MediaSessionCompatQueueItem:Z

.field private final MediaSessionCompatResultReceiverWrapper:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/setThrowsWhenUsingWrongThread<",
            "*>;>;"
        }
    .end annotation
.end field

.field private MediaSessionCompatToken:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;"
        }
    .end annotation
.end field

.field private final ParcelableVolumeInfo:Ljava/lang/Runnable;

.field private final PlaybackStateCompat:Lo/getCurrentTimeline;

.field private onSkipToNext:I

.field private final onSkipToQueueItem:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer<",
            "***>;>;"
        }
    .end annotation
.end field

.field private onStop:Z

.field private setSessionImpl:Lo/getContentBufferedPosition;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/airbnb/epoxy/EpoxyRecyclerView$RemoteActionCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/airbnb/epoxy/EpoxyRecyclerView$RemoteActionCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView$RemoteActionCompatParcelizer;

    .line 642
    new-instance v0, Lo/updateAvailableCommands;

    invoke-direct {v0}, Lo/updateAvailableCommands;-><init>()V

    sput-object v0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onSkipToPrevious:Lo/updateAvailableCommands;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 652
    invoke-direct/range {v0 .. v5}, Lcom/airbnb/epoxy/EpoxyRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 9

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 653
    invoke-direct/range {v0 .. v5}, Lcom/airbnb/epoxy/EpoxyRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    new-instance v0, Lo/getCurrentTimeline;

    invoke-direct {v0}, Lo/getCurrentTimeline;-><init>()V

    iput-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->PlaybackStateCompat:Lo/getCurrentTimeline;

    const/4 v0, 0x1

    .line 78
    iput-boolean v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatQueueItem:Z

    const/16 v0, 0x7d0

    .line 80
    iput v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onSkipToNext:I

    .line 88
    new-instance v0, Lcom/airbnb/epoxy/EpoxyRecyclerView$2;

    invoke-direct {v0, p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView$2;-><init>(Lcom/airbnb/epoxy/EpoxyRecyclerView;)V

    check-cast v0, Ljava/lang/Runnable;

    iput-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->ParcelableVolumeInfo:Ljava/lang/Runnable;

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatResultReceiverWrapper:Ljava/util/List;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onSkipToQueueItem:Ljava/util/List;

    if-eqz p2, :cond_46

    .line 216
    sget-object v0, Lo/setMaxInputSize$write;->EpoxyRecyclerView:[I

    const/4 v1, 0x0

    .line 215
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 221
    sget p2, Lo/setMaxInputSize$write;->EpoxyRecyclerView_itemSpacing:I

    .line 220
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    .line 219
    invoke-virtual {p0, p2}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setItemSpacingPx(I)V

    .line 225
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 228
    :cond_46
    invoke-virtual {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 55
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/epoxy/EpoxyRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Lcom/airbnb/epoxy/EpoxyRecyclerView;)V
    .registers 1

    .line 52
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onMediaButtonEvent()V

    return-void
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/EpoxyRecyclerView;)Z
    .registers 1

    .line 52
    iget-boolean p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onStop:Z

    return p0
.end method

.method protected static onCustomAction()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;
    .registers 1

    .line 261
    new-instance v0, Lo/moveMediaItems;

    invoke-direct {v0}, Lo/moveMediaItems;-><init>()V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    return-object v0
.end method

.method private final onFastForward()V
    .registers 2

    .line 630
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/updatePlayWhenReady;->AudioAttributesCompatParcelizer(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 631
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->AudioAttributesCompatParcelizer()V

    :cond_11
    return-void
.end method

.method private final onMediaButtonEvent()V
    .registers 4

    .line 603
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v0

    if-eqz v0, :cond_d

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 608
    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V

    .line 611
    iput-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatToken:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 615
    :cond_d
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onFastForward()V

    return-void
.end method

.method private final onPause()V
    .registers 2

    const/4 v0, 0x0

    .line 619
    iput-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatToken:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 620
    iget-boolean v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onStop:Z

    if-eqz v0, :cond_f

    .line 621
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->ParcelableVolumeInfo:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 622
    iput-boolean v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onStop:Z

    :cond_f
    return-void
.end method

.method private final onPlay()V
    .registers 4

    .line 251
    sget-object v0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onSkipToPrevious:Lo/updateAvailableCommands;

    .line 252
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    new-instance v2, Lcom/airbnb/epoxy/EpoxyRecyclerView$1;

    invoke-direct {v2, p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView$1;-><init>(Lcom/airbnb/epoxy/EpoxyRecyclerView;)V

    check-cast v2, Lo/getCreatedOnDateMs;

    .line 251
    invoke-virtual {v0, v1, v2}, Lo/updateAvailableCommands;->read(Landroid/content/Context;Lo/getCreatedOnDateMs;)Lo/lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl;

    move-result-object v0

    invoke-virtual {v0}, Lo/lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl;->read()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move-result-object v0

    .line 250
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setRecycledViewPool(Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;)V

    return-void
.end method

.method private final onPlayFromMediaId()V
    .registers 4

    .line 328
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    move-result-object v0

    .line 329
    iget-object p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setSessionImpl:Lo/getContentBufferedPosition;

    .line 330
    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v1, :cond_30

    if-eqz p0, :cond_30

    .line 332
    invoke-virtual {p0}, Lo/getContentBufferedPosition;->getSpanCount()I

    move-result v1

    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer()I

    move-result v2

    if-ne v1, v2, :cond_22

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer()Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    move-result-object v1

    invoke-virtual {p0}, Lo/getContentBufferedPosition;->getSpanSizeLookup()Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    move-result-object v2

    if-eq v1, v2, :cond_30

    .line 333
    :cond_22
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer()I

    move-result v1

    invoke-virtual {p0, v1}, Lo/getContentBufferedPosition;->setSpanCount(I)V

    .line 334
    invoke-virtual {p0}, Lo/getContentBufferedPosition;->getSpanSizeLookup()Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/GridLayoutManager;->read(Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;)V

    :cond_30
    return-void
.end method

.method private final onPrepare()V
    .registers 8

    .line 148
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatResultReceiverWrapper:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 646
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/setThrowsWhenUsingWrongThread;

    .line 148
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;)V

    goto :goto_8

    .line 149
    :cond_1a
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatResultReceiverWrapper:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 150
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v0

    if-eqz v0, :cond_8d

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    iget-object v1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onSkipToQueueItem:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 648
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_32
    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;

    .line 154
    instance-of v3, v0, Lo/getCurrentAdGroupIndex;

    if-eqz v3, :cond_60

    .line 155
    sget-object v3, Lo/setThrowsWhenUsingWrongThread;->AudioAttributesCompatParcelizer:Lo/setThrowsWhenUsingWrongThread$IconCompatParcelizer;

    .line 156
    move-object v3, v0

    check-cast v3, Lo/getCurrentAdGroupIndex;

    .line 157
    invoke-virtual {v2}, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->read()Lo/getCreatedOnDateMs;

    move-result-object v4

    .line 158
    invoke-virtual {v2}, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->write()Lo/MagicModuleSubmissionRequestBody;

    move-result-object v5

    .line 159
    invoke-virtual {v2}, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()I

    move-result v6

    .line 160
    invoke-virtual {v2}, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/setPlaylistMetadata;

    move-result-object v2

    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 155
    invoke-static {v3, v4, v5, v6, v2}, Lo/setThrowsWhenUsingWrongThread$IconCompatParcelizer;->IconCompatParcelizer(Lo/getCurrentAdGroupIndex;Lo/getCreatedOnDateMs;Lo/MagicModuleSubmissionRequestBody;ILjava/util/List;)Lo/setThrowsWhenUsingWrongThread;

    move-result-object v2

    goto :goto_80

    .line 163
    :cond_60
    iget-object v3, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setSessionImpl:Lo/getContentBufferedPosition;

    if-eqz v3, :cond_7f

    .line 164
    sget-object v4, Lo/setThrowsWhenUsingWrongThread;->AudioAttributesCompatParcelizer:Lo/setThrowsWhenUsingWrongThread$IconCompatParcelizer;

    .line 166
    invoke-virtual {v2}, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->read()Lo/getCreatedOnDateMs;

    move-result-object v4

    .line 167
    invoke-virtual {v2}, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->write()Lo/MagicModuleSubmissionRequestBody;

    move-result-object v5

    .line 168
    invoke-virtual {v2}, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()I

    move-result v6

    .line 169
    invoke-virtual {v2}, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/setPlaylistMetadata;

    move-result-object v2

    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 164
    invoke-static {v3, v4, v5, v6, v2}, Lo/setThrowsWhenUsingWrongThread$IconCompatParcelizer;->read(Lo/getContentBufferedPosition;Lo/getCreatedOnDateMs;Lo/MagicModuleSubmissionRequestBody;ILjava/util/List;)Lo/setThrowsWhenUsingWrongThread;

    move-result-object v2

    goto :goto_80

    :cond_7f
    const/4 v2, 0x0

    :goto_80
    if-eqz v2, :cond_32

    .line 173
    iget-object v3, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatResultReceiverWrapper:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;)V

    goto :goto_32

    :cond_8d
    return-void
.end method

.method private onPrepareFromMediaId()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
    .registers 4

    .line 299
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 302
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_19

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eqz v1, :cond_19

    .line 314
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    const/4 p0, 0x0

    invoke-direct {v0, p0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(IZ)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    return-object v0

    .line 304
    :cond_19
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-eq v1, v2, :cond_21

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-nez v0, :cond_25

    :cond_21
    const/4 v0, 0x1

    .line 306
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 310
    :cond_25
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>()V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    return-object v0
.end method

.method public static final synthetic read(Lcom/airbnb/epoxy/EpoxyRecyclerView;)V
    .registers 2

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onStop:Z

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;Z)V"
        }
    .end annotation

    .line 570
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V

    .line 572
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPause()V

    .line 573
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPrepare()V

    return-void
.end method

.method protected MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 2

    const/4 v0, 0x0

    .line 233
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 234
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPlay()V

    return-void
.end method

.method protected final MediaDescriptionCompat(I)I
    .registers 2

    .line 556
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p0

    return p0
.end method

.method protected final RatingCompat(I)I
    .registers 3

    int-to-float p1, p1

    .line 550
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    const/4 v0, 0x1

    .line 548
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    float-to-int p0, p0

    return p0
.end method

.method public onAttachedToWindow()V
    .registers 3

    .line 577
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->onAttachedToWindow()V

    .line 579
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatToken:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_b

    const/4 v1, 0x0

    .line 581
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V

    .line 583
    :cond_b
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPause()V

    return-void
.end method

.method protected final onCommand()Lo/getCurrentTimeline;
    .registers 1

    .line 58
    iget-object p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->PlaybackStateCompat:Lo/getCurrentTimeline;

    return-object p0
.end method

.method public onDetachedFromWindow()V
    .registers 5

    .line 587
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->onDetachedFromWindow()V

    .line 588
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatResultReceiverWrapper:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 651
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/setThrowsWhenUsingWrongThread;

    .line 588
    invoke-virtual {v1}, Lo/setThrowsWhenUsingWrongThread;->RemoteActionCompatParcelizer()V

    goto :goto_b

    .line 590
    :cond_1b
    iget-boolean v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatQueueItem:Z

    if-eqz v0, :cond_30

    .line 591
    iget v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onSkipToNext:I

    if-lez v0, :cond_2d

    const/4 v1, 0x1

    .line 593
    iput-boolean v1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onStop:Z

    .line 594
    iget-object v1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->ParcelableVolumeInfo:Ljava/lang/Runnable;

    int-to-long v2, v0

    invoke-virtual {p0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_30

    .line 596
    :cond_2d
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onMediaButtonEvent()V

    .line 599
    :cond_30
    :goto_30
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onFastForward()V

    return-void
.end method

.method public requestLayout()V
    .registers 1

    .line 342
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPlayFromMediaId()V

    .line 343
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    .line 560
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 562
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPause()V

    .line 563
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPrepare()V

    return-void
.end method

.method public final setController(Lo/getContentBufferedPosition;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 414
    iput-object p1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setSessionImpl:Lo/getContentBufferedPosition;

    .line 415
    invoke-virtual {p1}, Lo/getContentBufferedPosition;->getAdapter()Lo/getCurrentPosition;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 416
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPlayFromMediaId()V

    return-void
.end method

.method public final setControllerAndBuildModels(Lo/getContentBufferedPosition;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 430
    invoke-virtual {p1}, Lo/getContentBufferedPosition;->requestModelBuild()V

    .line 431
    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setController(Lo/getContentBufferedPosition;)V

    return-void
.end method

.method public final setDelayMsWhenRemovingAdapterOnDetach(I)V
    .registers 2

    .line 209
    iput p1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onSkipToNext:I

    return-void
.end method

.method public final setItemSpacingDp(I)V
    .registers 2

    .line 351
    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->RatingCompat(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setItemSpacingPx(I)V

    return-void
.end method

.method public setItemSpacingPx(I)V
    .registers 3

    .line 368
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->PlaybackStateCompat:Lo/getCurrentTimeline;

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;)V

    .line 369
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->PlaybackStateCompat:Lo/getCurrentTimeline;

    invoke-virtual {v0, p1}, Lo/getCurrentTimeline;->IconCompatParcelizer(I)V

    if-lez p1, :cond_15

    .line 372
    iget-object p1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->PlaybackStateCompat:Lo/getCurrentTimeline;

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;)V

    :cond_15
    return-void
.end method

.method public final setItemSpacingRes(I)V
    .registers 2

    .line 347
    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaDescriptionCompat(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setItemSpacingPx(I)V

    return-void
.end method

.method public setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V
    .registers 2

    .line 319
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V

    .line 320
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPlayFromMediaId()V

    return-void
.end method

.method public setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_d

    const/4 v0, 0x1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    .line 274
    :goto_e
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz v0, :cond_20

    .line 279
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    move-result-object p1

    if-nez p1, :cond_20

    .line 280
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPrepareFromMediaId()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V

    :cond_20
    return-void
.end method

.method public setModels(Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo/getCurrentPeriodIndex<",
            "*>;>;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setSessionImpl:Lo/getContentBufferedPosition;

    instance-of v1, v0, Lcom/airbnb/epoxy/SimpleEpoxyController;

    if-nez v1, :cond_c

    const/4 v0, 0x0

    :cond_c
    check-cast v0, Lcom/airbnb/epoxy/SimpleEpoxyController;

    if-nez v0, :cond_1b

    .line 389
    new-instance v0, Lcom/airbnb/epoxy/SimpleEpoxyController;

    invoke-direct {v0}, Lcom/airbnb/epoxy/SimpleEpoxyController;-><init>()V

    .line 390
    move-object v1, v0

    check-cast v1, Lo/getContentBufferedPosition;

    invoke-virtual {p0, v1}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->setController(Lo/getContentBufferedPosition;)V

    .line 393
    :cond_1b
    invoke-virtual {v0, p1}, Lcom/airbnb/epoxy/SimpleEpoxyController;->setModels(Ljava/util/List;)V

    return-void
.end method

.method public final setRemoveAdapterWhenDetachedFromWindow(Z)V
    .registers 2

    .line 194
    iput-boolean p1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView;->MediaSessionCompatQueueItem:Z

    return-void
.end method

###### Class com.airbnb.epoxy.EpoxyRecyclerView.AnonymousClass1 (com.airbnb.epoxy.EpoxyRecyclerView$1)
.class final Lcom/airbnb/epoxy/EpoxyRecyclerView$1;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/EpoxyRecyclerView;->onPlay()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;",
        "AudioAttributesCompatParcelizer",
        "()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic write:Lcom/airbnb/epoxy/EpoxyRecyclerView;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/EpoxyRecyclerView;)V
    .registers 2

    .line 254
    iput-object p1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$1;->write:Lcom/airbnb/epoxy/EpoxyRecyclerView;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;
    .registers 1

    .line 253
    invoke-static {}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->onCustomAction()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 52
    invoke-virtual {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView$1;->AudioAttributesCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.EpoxyRecyclerView.AnonymousClass2 (com.airbnb.epoxy.EpoxyRecyclerView$2)
.class final Lcom/airbnb/epoxy/EpoxyRecyclerView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/EpoxyRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "run",
        "()V"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/EpoxyRecyclerView;)V
    .registers 2

    .line 94
    iput-object p1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$2;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 89
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$2;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView;

    invoke-static {v0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/EpoxyRecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 92
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$2;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView;

    invoke-static {v0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->read(Lcom/airbnb/epoxy/EpoxyRecyclerView;)V

    .line 93
    iget-object p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$2;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView;

    invoke-static {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView;->AudioAttributesCompatParcelizer(Lcom/airbnb/epoxy/EpoxyRecyclerView;)V

    :cond_12
    return-void
.end method

###### Class com.airbnb.epoxy.EpoxyRecyclerView.AudioAttributesCompatParcelizer (com.airbnb.epoxy.EpoxyRecyclerView$AudioAttributesCompatParcelizer)
.class final Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/EpoxyRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lo/getCurrentPeriodIndex<",
        "*>;U::",
        "Lo/ExoPlayerImplExternalSyntheticLambda13;",
        "P::",
        "Lo/ExoPlayerImplExternalSyntheticLambda0;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:I

.field private final IconCompatParcelizer:Lo/setPlaylistMetadata;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/setPlaylistMetadata<",
            "TT;TU;TP;>;"
        }
    .end annotation
.end field

.field private final RemoteActionCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/MagicModuleSubmissionRequestBody<",
            "Landroid/content/Context;",
            "Ljava/lang/RuntimeException;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private final read:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "TP;>;"
        }
    .end annotation
.end field


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/setPlaylistMetadata;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/setPlaylistMetadata<",
            "TT;TU;TP;>;"
        }
    .end annotation

    .line 104
    iget-object p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Lo/setPlaylistMetadata;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()I
    .registers 1

    .line 102
    iget p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:I

    return p0
.end method

.method public final read()Lo/getCreatedOnDateMs;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/getCreatedOnDateMs<",
            "TP;>;"
        }
    .end annotation

    .line 105
    iget-object p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->read:Lo/getCreatedOnDateMs;

    return-object p0
.end method

.method public final write()Lo/MagicModuleSubmissionRequestBody;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/MagicModuleSubmissionRequestBody<",
            "Landroid/content/Context;",
            "Ljava/lang/RuntimeException;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 103
    iget-object p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;

    return-object p0
.end method

###### Class com.airbnb.epoxy.EpoxyRecyclerView.ModelBuilderCallbackController (com.airbnb.epoxy.EpoxyRecyclerView$ModelBuilderCallbackController)
.class final Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;
.super Lo/getContentBufferedPosition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/EpoxyRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ModelBuilderCallbackController"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0003R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c"
    }
    d2 = {
        "Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;",
        "Lo/getContentBufferedPosition;",
        "<init>",
        "()V",
        "",
        "buildModels",
        "Lcom/airbnb/epoxy/EpoxyRecyclerView$read;",
        "callback",
        "Lcom/airbnb/epoxy/EpoxyRecyclerView$read;",
        "getCallback",
        "()Lcom/airbnb/epoxy/EpoxyRecyclerView$read;",
        "setCallback",
        "(Lcom/airbnb/epoxy/EpoxyRecyclerView$read;)V"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private callback:Lcom/airbnb/epoxy/EpoxyRecyclerView$read;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 484
    invoke-direct {p0}, Lo/getContentBufferedPosition;-><init>()V

    .line 485
    new-instance v0, Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController$RemoteActionCompatParcelizer;-><init>()V

    check-cast v0, Lcom/airbnb/epoxy/EpoxyRecyclerView$read;

    iput-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;->callback:Lcom/airbnb/epoxy/EpoxyRecyclerView$read;

    return-void
.end method


# virtual methods
.method public final buildModels()V
    .registers 2

    .line 491
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;->callback:Lcom/airbnb/epoxy/EpoxyRecyclerView$read;

    check-cast p0, Lo/getContentBufferedPosition;

    invoke-interface {v0, p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView$read;->AudioAttributesCompatParcelizer(Lo/getContentBufferedPosition;)V

    return-void
.end method

.method public final getCallback()Lcom/airbnb/epoxy/EpoxyRecyclerView$read;
    .registers 1

    .line 485
    iget-object p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;->callback:Lcom/airbnb/epoxy/EpoxyRecyclerView$read;

    return-object p0
.end method

.method public final setCallback(Lcom/airbnb/epoxy/EpoxyRecyclerView$read;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 485
    iput-object p1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;->callback:Lcom/airbnb/epoxy/EpoxyRecyclerView$read;

    return-void
.end method

###### Class com.airbnb.epoxy.EpoxyRecyclerView.ModelBuilderCallbackController.RemoteActionCompatParcelizer (com.airbnb.epoxy.EpoxyRecyclerView$ModelBuilderCallbackController$RemoteActionCompatParcelizer)
.class public final Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/airbnb/epoxy/EpoxyRecyclerView$read;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 485
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/getContentBufferedPosition;)V
    .registers 2

    .line 486
    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

###### Class com.airbnb.epoxy.EpoxyRecyclerView.Companion (com.airbnb.epoxy.EpoxyRecyclerView$RemoteActionCompatParcelizer)
.class public final Lcom/airbnb/epoxy/EpoxyRecyclerView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/EpoxyRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RemoteActionCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lcom/airbnb/epoxy/EpoxyRecyclerView$RemoteActionCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Lo/updateAvailableCommands;",
        "onSkipToPrevious",
        "Lo/updateAvailableCommands;",
        "read"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 635
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 635
    invoke-direct {p0}, Lcom/airbnb/epoxy/EpoxyRecyclerView$RemoteActionCompatParcelizer;-><init>()V

    return-void
.end method

###### Class com.airbnb.epoxy.EpoxyRecyclerView.WithModelsController (com.airbnb.epoxy.EpoxyRecyclerView$WithModelsController)
.class final Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;
.super Lo/getContentBufferedPosition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/EpoxyRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "WithModelsController"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0003R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00068\u0007@\u0007X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c"
    }
    d2 = {
        "Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;",
        "Lo/getContentBufferedPosition;",
        "<init>",
        "()V",
        "",
        "buildModels",
        "Lkotlin/Function1;",
        "callback",
        "Lo/getAnswerMap;",
        "getCallback",
        "()Lo/getAnswerMap;",
        "setCallback",
        "(Lo/getAnswerMap;)V"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private callback:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "-",
            "Lo/getContentBufferedPosition;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 452
    invoke-direct {p0}, Lo/getContentBufferedPosition;-><init>()V

    .line 453
    sget-object v0, Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController$3;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController$3;

    check-cast v0, Lo/getAnswerMap;

    iput-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;->callback:Lo/getAnswerMap;

    return-void
.end method


# virtual methods
.method public final buildModels()V
    .registers 2

    .line 456
    iget-object v0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;->callback:Lo/getAnswerMap;

    invoke-interface {v0, p0}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final getCallback()Lo/getAnswerMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/getAnswerMap<",
            "Lo/getContentBufferedPosition;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 453
    iget-object p0, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;->callback:Lo/getAnswerMap;

    return-object p0
.end method

.method public final setCallback(Lo/getAnswerMap;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getAnswerMap<",
            "-",
            "Lo/getContentBufferedPosition;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    iput-object p1, p0, Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;->callback:Lo/getAnswerMap;

    return-void
.end method

###### Class com.airbnb.epoxy.EpoxyRecyclerView.WithModelsController.AnonymousClass3 (com.airbnb.epoxy.EpoxyRecyclerView$WithModelsController$3)
.class final Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController$3;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/getContentBufferedPosition;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lo/getContentBufferedPosition;",
        "",
        "RemoteActionCompatParcelizer",
        "(Lo/getContentBufferedPosition;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# static fields
.field public static final RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController$3;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 453
    new-instance v0, Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController$3;

    invoke-direct {v0}, Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController$3;-><init>()V

    sput-object v0, Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController$3;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController$3;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x1

    .line 454
    invoke-direct {p0, v0}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/getContentBufferedPosition;)V
    .registers 2

    .line 455
    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 452
    check-cast p1, Lo/getContentBufferedPosition;

    invoke-virtual {p0, p1}, Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController$3;->RemoteActionCompatParcelizer(Lo/getContentBufferedPosition;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class com.airbnb.epoxy.EpoxyRecyclerView.read (com.airbnb.epoxy.EpoxyRecyclerView$read)
.class public interface abstract Lcom/airbnb/epoxy/EpoxyRecyclerView$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/EpoxyRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "read"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lcom/airbnb/epoxy/EpoxyRecyclerView$read;",
        "",
        "Lo/getContentBufferedPosition;",
        "p0",
        "",
        "AudioAttributesCompatParcelizer",
        "(Lo/getContentBufferedPosition;)V"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer(Lo/getContentBufferedPosition;)V
.end method
