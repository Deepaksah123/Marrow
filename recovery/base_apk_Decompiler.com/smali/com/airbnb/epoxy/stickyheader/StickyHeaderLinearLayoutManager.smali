###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager)
.class public final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;,
        Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001:\u0002\u0019KB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ+\u0010\u000e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\nR\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0012J#\u0010\u0013\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\nR\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ!\u0010\u0014\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u000c2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010 J!\u0010\u0016\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u000c2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008%\u0010&J+\u0010\u0014\u001a\u00020\r2\u000c\u0010\u0003\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\'2\u000c\u0010\u0005\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\'H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010(J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010)J5\u0010\u0013\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0003\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u00060\nR\u00020\u000b2\u0006\u0010*\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010+J#\u0010\u000e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\nR\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010,J\u0019\u0010\u0014\u001a\u00020\r2\u0008\u0010\u0003\u001a\u0004\u0018\u00010-H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010.J\u000f\u0010/\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008/\u00100J#\u0010\u0019\u001a\u00028\u0000\"\u0004\u0008\u0000\u001012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u000002H\u0002\u00a2\u0006\u0004\u0008\u0019\u00103J\u001d\u0010\u0013\u001a\u00020\r2\u000c\u0010\u0003\u001a\u0008\u0018\u00010\nR\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0013\u00104J-\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\nR\u00020\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0019\u00105J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0019\u00106J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0019\u00107J\'\u00108\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00088\u00107J-\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\nR\u00020\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0016\u00105J\u001d\u0010\u0019\u001a\u00020\r2\u000c\u0010\u0003\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\'H\u0002\u00a2\u0006\u0004\u0008\u0019\u00109J\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0011\u00107J#\u0010\u0016\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\nR\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010:R\u0018\u0010\u0013\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010<R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00040=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010>R\u0018\u0010\u0016\u001a\u00060?R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010@R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010AR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010AR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010AR\u0016\u00108\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0016\u0010J\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008I\u0010H"
    }
    d2 = {
        "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "Landroid/content/Context;",
        "p0",
        "",
        "p1",
        "",
        "p2",
        "<init>",
        "(Landroid/content/Context;IZ)V",
        "Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "Landroid/view/View;",
        "",
        "write",
        "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroid/view/View;I)V",
        "Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;",
        "MediaBrowserCompatItemReceiver",
        "(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I",
        "AudioAttributesCompatParcelizer",
        "IconCompatParcelizer",
        "Landroid/graphics/PointF;",
        "RemoteActionCompatParcelizer",
        "(I)Landroid/graphics/PointF;",
        "AudioAttributesImplBaseParcelizer",
        "read",
        "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V",
        "MediaBrowserCompatSearchResultReceiver",
        "(I)I",
        "MediaMetadataCompat",
        "RatingCompat",
        "",
        "(Landroid/view/View;Landroid/view/View;)F",
        "onPlay",
        "(Landroid/view/View;)Z",
        "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;",
        "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z",
        "onPause",
        "(Landroid/view/View;)V",
        "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;",
        "(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V",
        "(Landroidx/recyclerview/widget/RecyclerView;)V",
        "p3",
        "(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;",
        "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V",
        "Landroid/os/Parcelable;",
        "(Landroid/os/Parcelable;)V",
        "onAddQueueItem",
        "()Landroid/os/Parcelable;",
        "T",
        "Lkotlin/Function0;",
        "(Lo/getCreatedOnDateMs;)Ljava/lang/Object;",
        "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V",
        "(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I",
        "(I)V",
        "(II)V",
        "AudioAttributesImplApi21Parcelizer",
        "(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V",
        "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Z)V",
        "Lo/updatePriorityTaskManagerForIsLoadingChange;",
        "Lo/updatePriorityTaskManagerForIsLoadingChange;",
        "",
        "Ljava/util/List;",
        "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;",
        "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;",
        "I",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "onCommand",
        "Landroid/view/View;",
        "handleMediaPlayPauseIfPendingOnHandler",
        "MediaBrowserCompatCustomActionResultReceiver",
        "onCustomAction",
        "F",
        "onMediaButtonEvent",
        "AudioAttributesImplApi26Parcelizer",
        "SavedState"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Lo/updatePriorityTaskManagerForIsLoadingChange;

.field private final IconCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field private final RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:I

.field private onCommand:Landroid/view/View;

.field private onCustomAction:F

.field private onMediaButtonEvent:F


# direct methods
.method private constructor <init>(Landroid/content/Context;IZ)V
    .registers 5

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(IZ)V

    .line 42
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    .line 43
    new-instance p1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;

    invoke-direct {p1, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)V

    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;

    const/4 p1, -0x1

    .line 47
    iput p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 50
    iput p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IZILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x1

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 32
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    return-void
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 4

    .line 29
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 29
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplBaseParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Landroid/view/View;
    .registers 1

    .line 29
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    return-object p0
.end method

.method private final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 4

    .line 342
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    if-eqz v0, :cond_23

    const/4 v1, 0x0

    .line 343
    iput-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    const/4 v1, -0x1

    .line 344
    iput v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    const/4 v1, 0x0

    .line 347
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 348
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 351
    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer:Lo/updatePriorityTaskManagerForIsLoadingChange;

    if-eqz v1, :cond_18

    invoke-virtual {v1, v0}, Lo/updatePriorityTaskManagerForIsLoadingChange;->write(Landroid/view/View;)V

    .line 354
    :cond_18
    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onMediaButtonEvent(Landroid/view/View;)V

    .line 357
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromMediaId(Landroid/view/View;)V

    if-eqz p1, :cond_23

    .line 358
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write(Landroid/view/View;)V

    :cond_23
    return-void
.end method

.method private final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V
    .registers 4

    .line 283
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer(I)Landroid/view/View;

    move-result-object p1

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer:Lo/updatePriorityTaskManagerForIsLoadingChange;

    if-eqz v0, :cond_10

    invoke-virtual {v0, p1}, Lo/updatePriorityTaskManagerForIsLoadingChange;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    .line 290
    :cond_10
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    .line 291
    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onPause(Landroid/view/View;)V

    .line 294
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onCustomAction(Landroid/view/View;)V

    .line 296
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    .line 297
    iput p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    return-void
.end method

.method private final AudioAttributesImplApi21Parcelizer(II)V
    .registers 8

    const/4 v0, -0x1

    const/high16 v1, -0x80000000

    .line 121
    invoke-direct {p0, v0, v1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatItemReceiver(II)V

    .line 130
    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaMetadataCompat(I)I

    move-result v2

    if-eq v2, v0, :cond_42

    .line 131
    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatSearchResultReceiver(I)I

    move-result v3

    if-ne v3, v0, :cond_42

    add-int/lit8 v3, p1, -0x1

    .line 137
    invoke-direct {p0, v3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatSearchResultReceiver(I)I

    move-result v4

    if-eq v4, v0, :cond_1e

    .line 138
    invoke-super {p0, v3, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(II)V

    return-void

    .line 143
    :cond_1e
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    if-eqz v0, :cond_3b

    iget v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatSearchResultReceiver(I)I

    move-result v0

    if-ne v2, v0, :cond_3b

    if-ne p2, v1, :cond_2d

    const/4 p2, 0x0

    .line 144
    :cond_2d
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    invoke-static {v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/2addr p2, v0

    .line 145
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(II)V

    return-void

    .line 150
    :cond_3b
    invoke-direct {p0, p1, p2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatItemReceiver(II)V

    .line 151
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(II)V

    return-void

    .line 132
    :cond_42
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(II)V

    return-void
.end method

.method public static final synthetic AudioAttributesImplApi21Parcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)V
    .registers 2

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    return-void
.end method

.method public static final synthetic AudioAttributesImplApi26Parcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 29
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public static final synthetic AudioAttributesImplApi26Parcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)V
    .registers 3

    const/4 v0, -0x1

    const/high16 v1, -0x80000000

    .line 29
    invoke-direct {p0, v0, v1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatItemReceiver(II)V

    return-void
.end method

.method private final IconCompatParcelizer(Landroid/view/View;Landroid/view/View;)F
    .registers 9

    .line 426
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatSearchResultReceiver()I

    move-result v0

    if-eqz v0, :cond_9

    .line 442
    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCustomAction:F

    return p0

    .line 429
    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1b

    .line 430
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    add-float/2addr v1, v0

    :cond_1b
    if-eqz p2, :cond_61

    .line 433
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v3, 0x0

    if-nez v2, :cond_27

    move-object v0, v3

    :cond_27
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v2, 0x0

    if-eqz v0, :cond_2f

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_30

    :cond_2f
    move v0, v2

    .line 434
    :goto_30
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    instance-of v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    if-nez v5, :cond_39

    goto :goto_3a

    :cond_39
    move-object v3, v4

    :goto_3a
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v3, :cond_40

    iget v2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 436
    :cond_40
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat()Z

    move-result p0

    if-eqz p0, :cond_51

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result p0

    add-int/2addr p0, v2

    int-to-float p0, p0

    invoke-static {p0, v1}, Lo/getQues;->read(FF)F

    move-result p0

    return p0

    .line 437
    :cond_51
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result p0

    sub-int/2addr p0, v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    sub-int/2addr p0, p1

    int-to-float p0, p0

    invoke-static {p0, v1}, Lo/getQues;->write(FF)F

    move-result p0

    return p0

    :cond_61
    return v1
.end method

.method public static final synthetic IconCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)I
    .registers 1

    .line 29
    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onAddQueueItem:I

    return p0
.end method

.method public static final synthetic IconCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 29
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public static final synthetic MediaBrowserCompatItemReceiver(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)I
    .registers 1

    .line 29
    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    return p0
.end method

.method private final MediaBrowserCompatItemReceiver(II)V
    .registers 3

    .line 498
    iput p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 499
    iput p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onAddQueueItem:I

    return-void
.end method

.method private final MediaBrowserCompatSearchResultReceiver(I)I
    .registers 6

    .line 451
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_9
    if-gt v1, v0, :cond_32

    add-int v2, v1, v0

    .line 453
    div-int/lit8 v2, v2, 0x2

    .line 455
    iget-object v3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-le v3, p1, :cond_20

    add-int/lit8 v0, v2, -0x1

    goto :goto_9

    .line 456
    :cond_20
    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ge v1, p1, :cond_31

    add-int/lit8 v1, v2, 0x1

    goto :goto_9

    :cond_31
    return v2

    :cond_32
    const/4 p0, -0x1

    return p0
.end method

.method private final MediaMetadataCompat(I)I
    .registers 6

    .line 468
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_9
    if-gt v1, v0, :cond_3e

    add-int v2, v1, v0

    .line 470
    div-int/lit8 v2, v2, 0x2

    .line 472
    iget-object v3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-le v3, p1, :cond_20

    add-int/lit8 v0, v2, -0x1

    goto :goto_9

    .line 473
    :cond_20
    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_3d

    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    add-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-le v1, p1, :cond_3b

    goto :goto_3d

    :cond_3b
    move v1, v3

    goto :goto_9

    :cond_3d
    :goto_3d
    return v2

    :cond_3e
    const/4 p0, -0x1

    return p0
.end method

.method private final RatingCompat(I)I
    .registers 7

    .line 485
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_9
    if-gt v1, v0, :cond_35

    add-int v2, v1, v0

    .line 487
    div-int/lit8 v2, v2, 0x2

    if-lez v2, :cond_23

    .line 489
    iget-object v3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    add-int/lit8 v4, v2, -0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-lt v3, p1, :cond_23

    move v0, v4

    goto :goto_9

    .line 490
    :cond_23
    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ge v1, p1, :cond_34

    add-int/lit8 v1, v2, 0x1

    goto :goto_9

    :cond_34
    return v2

    :cond_35
    const/4 p0, -0x1

    return p0
.end method

.method private final RemoteActionCompatParcelizer(Landroid/view/View;Landroid/view/View;)F
    .registers 9

    .line 401
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatSearchResultReceiver()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a

    .line 417
    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onMediaButtonEvent:F

    return p0

    .line 404
    :cond_a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1c

    .line 405
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    add-float/2addr v1, v0

    :cond_1c
    if-eqz p2, :cond_62

    .line 408
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v3, 0x0

    if-nez v2, :cond_28

    move-object v0, v3

    :cond_28
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v2, 0x0

    if-eqz v0, :cond_30

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_31

    :cond_30
    move v0, v2

    .line 409
    :goto_31
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    instance-of v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    if-nez v5, :cond_3a

    goto :goto_3b

    :cond_3a
    move-object v3, v4

    :goto_3b
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v3, :cond_41

    iget v2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 411
    :cond_41
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat()Z

    move-result p0

    if-eqz p0, :cond_52

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result p0

    add-int/2addr p0, v0

    int-to-float p0, p0

    invoke-static {p0, v1}, Lo/getQues;->read(FF)F

    move-result p0

    return p0

    .line 412
    :cond_52
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p0

    sub-int/2addr p0, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    sub-int/2addr p0, p1

    int-to-float p0, p0

    invoke-static {p0, v1}, Lo/getQues;->write(FF)F

    move-result p0

    return p0

    :cond_62
    return v1
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)I
    .registers 1

    .line 29
    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    return p0
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)I
    .registers 2

    .line 29
    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RatingCompat(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 29
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method private final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Z)V
    .registers 11

    .line 216
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 217
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v1

    if-lez v0, :cond_c6

    if-lez v1, :cond_c6

    const/4 v2, 0x0

    :goto_f
    const/4 v3, 0x0

    if-ge v2, v1, :cond_37

    .line 224
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v4

    .line 225
    invoke-static {v4}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    if-eqz v5, :cond_2f

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 226
    invoke-direct {p0, v4, v5}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result v6

    if-eqz v6, :cond_2c

    .line 229
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->N_()I

    move-result v1

    goto :goto_38

    :cond_2c
    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    .line 225
    :cond_2f
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_37
    move-object v4, v3

    :goto_38
    if-eqz v4, :cond_c6

    const/4 v5, -0x1

    if-eq v1, v5, :cond_c6

    .line 234
    invoke-direct {p0, v1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaMetadataCompat(I)I

    move-result v6

    if-eq v6, v5, :cond_50

    .line 235
    iget-object v7, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    goto :goto_51

    :cond_50
    move v7, v5

    :goto_51
    add-int/lit8 v6, v6, 0x1

    if-le v0, v6, :cond_62

    .line 236
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_63

    :cond_62
    move v0, v5

    :goto_63
    if-eq v7, v5, :cond_c6

    if-ne v7, v1, :cond_6d

    .line 243
    invoke-direct {p0, v4}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onPlay(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_c6

    :cond_6d
    add-int/lit8 v4, v7, 0x1

    if-eq v0, v4, :cond_c6

    .line 247
    iget-object v4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    if-eqz v4, :cond_89

    invoke-static {v4}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v4

    iget-object v6, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer:Lo/updatePriorityTaskManagerForIsLoadingChange;

    if-eqz v6, :cond_86

    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemViewType(I)I

    move-result v6

    if-eq v4, v6, :cond_89

    .line 249
    :cond_86
    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 253
    :cond_89
    iget-object v4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    if-nez v4, :cond_90

    invoke-direct {p0, p1, v7}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V

    :cond_90
    if-nez p2, :cond_9d

    .line 255
    iget-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    invoke-static {p2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p2

    if-eq p2, v7, :cond_a5

    :cond_9d
    iget-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    invoke-static {p2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, v7}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroid/view/View;I)V

    .line 259
    :cond_a5
    iget-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    if-eqz p1, :cond_cd

    if-eq v0, v5, :cond_b7

    sub-int/2addr v0, v1

    add-int/2addr v2, v0

    .line 261
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p2

    .line 263
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    if-ne p2, v0, :cond_b6

    goto :goto_b7

    :cond_b6
    move-object v3, p2

    .line 265
    :cond_b7
    :goto_b7
    invoke-direct {p0, p1, v3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer(Landroid/view/View;Landroid/view/View;)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 266
    invoke-direct {p0, p1, v3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/view/View;)F

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationY(F)V

    return-void

    .line 273
    :cond_c6
    iget-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    if-eqz p2, :cond_cd

    .line 274
    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    :cond_cd
    return-void
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 3

    .line 29
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    return-void
.end method

.method private final onPause(Landroid/view/View;)V
    .registers 6

    .line 328
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onCommand(Landroid/view/View;)V

    .line 329
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatSearchResultReceiver()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_20

    .line 331
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v3, p0

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/view/View;->layout(IIII)V

    return-void

    .line 330
    :cond_20
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result p0

    sub-int/2addr v1, p0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    invoke-virtual {p1, v0, v2, v1, p0}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private final onPlay(Landroid/view/View;)Z
    .registers 5

    .line 384
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatSearchResultReceiver()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_38

    .line 390
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p1

    sub-float/2addr v0, p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result p1

    int-to-float p1, p1

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCustomAction:F

    add-float/2addr p1, p0

    cmpl-float p0, v0, p1

    if-lez p0, :cond_25

    return v2

    :cond_25
    return v1

    .line 391
    :cond_26
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p1

    add-float/2addr v0, p1

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCustomAction:F

    cmpg-float p0, v0, p0

    if-gez p0, :cond_37

    return v2

    :cond_37
    return v1

    .line 386
    :cond_38
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat()Z

    move-result v0

    if-eqz v0, :cond_56

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    sub-float/2addr v0, p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result p1

    int-to-float p1, p1

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onMediaButtonEvent:F

    add-float/2addr p1, p0

    cmpl-float p0, v0, p1

    if-lez p0, :cond_55

    return v2

    :cond_55
    return v1

    .line 387
    :cond_56
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    add-float/2addr v0, p1

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onMediaButtonEvent:F

    cmpg-float p0, v0, p0

    if-gez p0, :cond_67

    return v2

    :cond_67
    return v1
.end method

.method public static final synthetic read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)I
    .registers 2

    .line 29
    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatSearchResultReceiver(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 4

    .line 29
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public static final synthetic read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 29
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public static final synthetic read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;
    .registers 5

    .line 29
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lo/getCreatedOnDateMs<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    if-eqz v0, :cond_a

    .line 640
    move-object v1, p0

    check-cast v1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    .line 183
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->a_(Landroid/view/View;)V

    .line 184
    :cond_a
    invoke-interface {p1}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    move-result-object p1

    .line 185
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCommand:Landroid/view/View;

    if-eqz v0, :cond_18

    .line 640
    move-object v1, p0

    check-cast v1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    .line 185
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/View;)V

    :cond_18
    return-object p1
.end method

.method public static final synthetic read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Lo/updatePriorityTaskManagerForIsLoadingChange;
    .registers 1

    .line 29
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer:Lo/updatePriorityTaskManagerForIsLoadingChange;

    return-object p0
.end method

.method private final read(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer:Lo/updatePriorityTaskManagerForIsLoadingChange;

    if-eqz v0, :cond_b

    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V

    .line 66
    :cond_b
    instance-of v0, p1, Lo/updatePriorityTaskManagerForIsLoadingChange;

    if-eqz v0, :cond_22

    .line 67
    check-cast p1, Lo/updatePriorityTaskManagerForIsLoadingChange;

    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer:Lo/updatePriorityTaskManagerForIsLoadingChange;

    if-eqz p1, :cond_1c

    .line 68
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V

    .line 69
    :cond_1c
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$read;->read()V

    return-void

    :cond_22
    const/4 p1, 0x0

    .line 71
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer:Lo/updatePriorityTaskManagerForIsLoadingChange;

    .line 72
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static final synthetic write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 29
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public static final synthetic write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)Landroid/graphics/PointF;
    .registers 2

    .line 29
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(I)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;
    .registers 1

    .line 29
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer:Ljava/util/List;

    return-object p0
.end method

.method private final write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroid/view/View;I)V
    .registers 4

    .line 305
    invoke-virtual {p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write(Landroid/view/View;I)V

    .line 306
    iput p3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 307
    invoke-direct {p0, p2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onPause(Landroid/view/View;)V

    .line 310
    iget p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    const/4 p3, -0x1

    if-eq p1, p3, :cond_1b

    .line 311
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance p3, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;

    invoke-direct {p3, p0, p2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroid/view/View;)V

    check-cast p3, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {p1, p3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1b
    return-void
.end method

.method private final write(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 5

    .line 366
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_73

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->R_()Z

    move-result p2

    if-nez p2, :cond_73

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatSearchResultReceiver()I

    move-result p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_44

    .line 372
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat()Z

    move-result p2

    if-eqz p2, :cond_32

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p1

    add-float/2addr p2, p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result p1

    int-to-float p1, p1

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCustomAction:F

    add-float/2addr p1, p0

    cmpg-float p0, p2, p1

    if-gtz p0, :cond_31

    return v0

    :cond_31
    return v1

    .line 373
    :cond_32
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p1

    sub-float/2addr p2, p1

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onCustomAction:F

    cmpl-float p0, p2, p0

    if-ltz p0, :cond_43

    return v0

    :cond_43
    return v1

    .line 368
    :cond_44
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat()Z

    move-result p2

    if-eqz p2, :cond_62

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    add-float/2addr p2, p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result p1

    int-to-float p1, p1

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onMediaButtonEvent:F

    add-float/2addr p1, p0

    cmpg-float p0, p2, p1

    if-gtz p0, :cond_61

    return v0

    :cond_61
    return v1

    .line 369
    :cond_62
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    sub-float/2addr p2, p1

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onMediaButtonEvent:F

    cmpl-float p0, p2, p0

    if-ltz p0, :cond_73

    return v0

    :cond_73
    return v1
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$4;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$4;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;
    .registers 12

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 55
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    return-void
.end method

.method public final AudioAttributesImplBaseParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$1;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$1;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$2;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$2;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public final IconCompatParcelizer(Landroid/os/Parcelable;)V
    .registers 3

    .line 85
    instance-of v0, p1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    if-nez v0, :cond_5

    const/4 p1, 0x0

    :cond_5
    check-cast p1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    if-eqz p1, :cond_1c

    .line 86
    invoke-virtual {p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->write()I

    move-result v0

    iput v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 87
    invoke-virtual {p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->IconCompatParcelizer()I

    move-result v0

    iput v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onAddQueueItem:I

    .line 88
    invoke-virtual {p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->AudioAttributesCompatParcelizer()Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroid/os/Parcelable;)V

    :cond_1c
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    .line 59
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 60
    invoke-direct {p0, p2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    return-void
.end method

.method public final MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$5;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$5;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 5

    const-string v0, ""

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eqz p1, :cond_1c

    const/4 p3, 0x0

    .line 95
    invoke-direct {p0, p2, p3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Z)V

    :cond_1c
    return p1
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$10;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$10;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(I)Landroid/graphics/PointF;
    .registers 3

    .line 169
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$3;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$3;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/PointF;

    return-object p0
.end method

.method public final onAddQueueItem()Landroid/os/Parcelable;
    .registers 4

    .line 78
    invoke-super {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->onAddQueueItem()Landroid/os/Parcelable;

    move-result-object v0

    .line 79
    iget v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 80
    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->onAddQueueItem:I

    .line 77
    new-instance v2, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    invoke-direct {v2, v0, v1, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;-><init>(Landroid/os/Parcelable;II)V

    check-cast v2, Landroid/os/Parcelable;

    return-object v2
.end method

.method public final read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 5

    const-string v0, ""

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eqz p1, :cond_1c

    const/4 p3, 0x0

    .line 103
    invoke-direct {p0, p2, p3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Z)V

    :cond_1c
    return p1
.end method

.method public final read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$7;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$7;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public final read(I)V
    .registers 3

    const/high16 v0, -0x80000000

    .line 115
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(II)V

    return-void
.end method

.method public final read(II)V
    .registers 3

    .line 117
    invoke-direct {p0, p1, p2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesImplApi21Parcelizer(II)V

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;

    invoke-direct {v0, p0, p1, p2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;-><init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    check-cast v0, Lo/getCreatedOnDateMs;

    invoke-direct {p0, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lo/getCreatedOnDateMs;)Ljava/lang/Object;

    .line 110
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p2

    if-nez p2, :cond_1c

    const/4 p2, 0x1

    .line 111
    invoke-direct {p0, p1, p2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Z)V

    :cond_1c
    return-void
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass1 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$1)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$1;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesImplBaseParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Integer;",
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
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "RemoteActionCompatParcelizer",
        "()I"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $read:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic IconCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 3

    .line 158
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$1;->IconCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$1;->$read:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()I
    .registers 2

    .line 157
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$1;->IconCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$1;->$read:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$1;->RemoteActionCompatParcelizer()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass10 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$10)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$10;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Integer;",
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
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "IconCompatParcelizer",
        "()I"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 3

    .line 160
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$10;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$10;->$write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()I
    .registers 2

    .line 159
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$10;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$10;->$write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$10;->IconCompatParcelizer()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass13 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$13)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Integer;",
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
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "read",
        "()I"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

.field private synthetic $RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic $read:I

.field private synthetic IconCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 5

    .line 94
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;->IconCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;->$read:I

    iput-object p3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;->$AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iput-object p4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;->$RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;->read()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public final read()I
    .registers 4

    .line 93
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;->IconCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;->$read:I

    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;->$AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$13;->$RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, v1, v2, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass2 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$2)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$2;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Integer;",
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
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "IconCompatParcelizer",
        "()I"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 3

    .line 168
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$2;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$2;->$write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()I
    .registers 2

    .line 167
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$2;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$2;->$write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$2;->IconCompatParcelizer()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass3 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$3)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$3;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(I)Landroid/graphics/PointF;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Landroid/graphics/PointF;",
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroid/graphics/PointF;",
        "RemoteActionCompatParcelizer",
        "()Landroid/graphics/PointF;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $AudioAttributesCompatParcelizer:I

.field private synthetic RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)V
    .registers 3

    .line 170
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$3;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$3;->$AudioAttributesCompatParcelizer:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()Landroid/graphics/PointF;
    .registers 2

    .line 169
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$3;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$3;->$AudioAttributesCompatParcelizer:I

    invoke-static {v0, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$3;->RemoteActionCompatParcelizer()Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass4 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$4)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$4;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Integer;",
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
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "RemoteActionCompatParcelizer",
        "()I"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 3

    .line 166
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$4;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$4;->$write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()I
    .registers 2

    .line 165
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$4;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$4;->$write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$4;->RemoteActionCompatParcelizer()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass5 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$5)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$5;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Integer;",
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
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "AudioAttributesCompatParcelizer",
        "()I"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 3

    .line 164
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$5;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$5;->$AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 2

    .line 163
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$5;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$5;->$AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$5;->AudioAttributesCompatParcelizer()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass6 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$6)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Landroid/view/View;",
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroid/view/View;",
        "AudioAttributesCompatParcelizer",
        "()Landroid/view/View;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $IconCompatParcelizer:I

.field private synthetic $RemoteActionCompatParcelizer:Landroid/view/View;

.field private synthetic $read:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

.field private synthetic $write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 6

    .line 177
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->$RemoteActionCompatParcelizer:Landroid/view/View;

    iput p3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->$IconCompatParcelizer:I

    iput-object p4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->$read:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iput-object p5, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->$write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Landroid/view/View;
    .registers 5

    .line 176
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->$RemoteActionCompatParcelizer:Landroid/view/View;

    iget v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->$IconCompatParcelizer:I

    iget-object v3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->$read:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->$write:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, v1, v2, v3, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$6;->AudioAttributesCompatParcelizer()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass7 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$7)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$7;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Integer;",
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
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "read",
        "()I"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 3

    .line 162
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$7;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$7;->$AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$7;->read()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public final read()I
    .registers 2

    .line 161
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$7;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$7;->$AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesImplApi26Parcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass8 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$8)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Integer;",
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
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "AudioAttributesCompatParcelizer",
        "()I"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private synthetic $AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic $IconCompatParcelizer:I

.field private synthetic $read:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

.field private synthetic write:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 5

    .line 102
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;->write:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;->$IconCompatParcelizer:I

    iput-object p3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;->$read:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iput-object p4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;->$AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 4

    .line 101
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;->write:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;->$IconCompatParcelizer:I

    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;->$read:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;->$AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, v1, v2, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$8;->AudioAttributesCompatParcelizer()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.AnonymousClass9 (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$9)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
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
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "RemoteActionCompatParcelizer",
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
.field private synthetic $IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

.field private synthetic $RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field private synthetic read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 4

    .line 110
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;->$IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iput-object p3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;->$RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()V
    .registers 3

    .line 109
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;->read:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;->$IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;->$RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-static {v0, v1, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    return-void
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 29
    invoke-virtual {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$9;->RemoteActionCompatParcelizer()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.RemoteActionCompatParcelizer (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer)
.class public final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private synthetic IconCompatParcelizer:Landroid/view/View;

.field private synthetic RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;Landroid/view/View;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 311
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    iput-object p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .registers 4

    .line 314
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 315
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_29

    .line 316
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)I

    move-result v1

    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->IconCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(II)V

    .line 317
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesImplApi26Parcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)V

    :cond_29
    return-void
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.SavedState (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$SavedState)
.class public final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SavedState"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState$read;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\n\u0008\u0086\u0008\u0018\u00002\u00020\u0001B!\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0002\u001a\u0004\u0018\u00010\nH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00038\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00038\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u001a\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0018\u0010\u001d"
    }
    d2 = {
        "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;",
        "Landroid/os/Parcelable;",
        "p0",
        "",
        "p1",
        "p2",
        "<init>",
        "(Landroid/os/Parcelable;II)V",
        "describeContents",
        "()I",
        "",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Landroid/os/Parcel;",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "IconCompatParcelizer",
        "I",
        "AudioAttributesCompatParcelizer",
        "RemoteActionCompatParcelizer",
        "write",
        "read",
        "Landroid/os/Parcelable;",
        "()Landroid/os/Parcelable;"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final IconCompatParcelizer:I

.field private final RemoteActionCompatParcelizer:I

.field private final read:Landroid/os/Parcelable;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 511
    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState$read;

    invoke-direct {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState$read;-><init>()V

    sput-object v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;II)V
    .registers 4

    .line 507
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->read:Landroid/os/Parcelable;

    iput p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->RemoteActionCompatParcelizer:I

    iput p3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->IconCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Landroid/os/Parcelable;
    .registers 1

    .line 508
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->read:Landroid/os/Parcelable;

    return-object p0
.end method

.method public final IconCompatParcelizer()I
    .registers 1

    .line 510
    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->IconCompatParcelizer:I

    return p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 4

    if-eq p0, p1, :cond_20

    .line 513
    instance-of v0, p1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    if-eqz v0, :cond_1e

    check-cast p1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->read:Landroid/os/Parcelable;

    iget-object v1, p1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->read:Landroid/os/Parcelable;

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    iget v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->RemoteActionCompatParcelizer:I

    iget v1, p1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->RemoteActionCompatParcelizer:I

    if-ne v0, v1, :cond_1e

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->IconCompatParcelizer:I

    iget p1, p1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->IconCompatParcelizer:I

    if-eq p0, p1, :cond_20

    :cond_1e
    const/4 p0, 0x0

    return p0

    :cond_20
    const/4 p0, 0x1

    return p0
.end method

.method public final hashCode()I
    .registers 3

    .line 514
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->read:Landroid/os/Parcelable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->RemoteActionCompatParcelizer:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->IconCompatParcelizer:I

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 515
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SavedState(IconCompatParcelizer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->read:Landroid/os/Parcelable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", write="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", AudioAttributesCompatParcelizer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->IconCompatParcelizer:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()I
    .registers 1

    .line 509
    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->RemoteActionCompatParcelizer:I

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    .line 516
    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->read:Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget p2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;->IconCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.SavedState.read (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$SavedState$read)
.class public final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState$read;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "read"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 508
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;
    .registers 4

    .line 509
    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    const-class v1, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;-><init>(Landroid/os/Parcelable;II)V

    return-object v0
.end method

.method private static read(I)[Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;
    .registers 1

    .line 510
    new-array p0, p0, [Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 507
    invoke-static {p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState$read;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 507
    invoke-static {p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState$read;->read(I)[Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.read (com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$read)
.class final Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;
.super Landroidx/recyclerview/widget/RecyclerView$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "read"
.end annotation


# instance fields
.field private synthetic AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;


# direct methods
.method public constructor <init>(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 518
    iput-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$read;-><init>()V

    return-void
.end method

.method private final read(I)V
    .registers 4

    .line 629
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 630
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_27

    .line 632
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void

    .line 634
    :cond_27
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(II)V
    .registers 8

    .line 538
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, -0x1

    if-lez v0, :cond_38

    .line 540
    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)I

    move-result v2

    :goto_13
    if-eq v2, v1, :cond_38

    if-ge v2, v0, :cond_38

    .line 542
    iget-object v3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v4}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    add-int/2addr v4, p2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    :cond_38
    move v0, p1

    :goto_39
    add-int v2, p2, p1

    if-ge v0, v2, :cond_71

    .line 549
    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Lo/updatePriorityTaskManagerForIsLoadingChange;

    move-result-object v2

    if-eqz v2, :cond_6e

    invoke-virtual {v2, v0}, Lo/updatePriorityTaskManagerForIsLoadingChange;->RemoteActionCompatParcelizer(I)Z

    move-result v2

    if-eqz v2, :cond_6e

    .line 551
    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2, v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)I

    move-result v2

    if-eq v2, v1, :cond_61

    .line 553
    iget-object v3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_6e

    .line 555
    :cond_61
    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6e
    :goto_6e
    add-int/lit8 v0, v0, 0x1

    goto :goto_39

    :cond_71
    return-void
.end method

.method public final RemoteActionCompatParcelizer(II)V
    .registers 9

    .line 590
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_ab

    const/4 v1, -0x1

    if-ge p1, p2, :cond_5e

    .line 593
    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2, p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)I

    move-result v2

    :goto_15
    if-eq v2, v1, :cond_ab

    if-ge v2, v0, :cond_ab

    .line 595
    iget-object v3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-lt v3, p1, :cond_43

    add-int/lit8 v4, p1, 0x1

    if-ge v3, v4, :cond_43

    .line 597
    iget-object v4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v4}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v4

    sub-int v5, p2, p1

    sub-int/2addr v3, v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 598
    invoke-direct {p0, v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->read(I)V

    goto :goto_5b

    :cond_43
    add-int/lit8 v4, p1, 0x1

    if-lt v3, v4, :cond_ab

    if-gt v3, p2, :cond_ab

    .line 600
    iget-object v4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v4}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v4

    add-int/lit8 v3, v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 601
    invoke-direct {p0, v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->read(I)V

    :goto_5b
    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    .line 608
    :cond_5e
    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2, p2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)I

    move-result v2

    :goto_64
    if-eq v2, v1, :cond_ab

    if-ge v2, v0, :cond_ab

    .line 610
    iget-object v3, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v3}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-lt v3, p1, :cond_92

    add-int/lit8 v4, p1, 0x1

    if-ge v3, v4, :cond_92

    .line 613
    iget-object v4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v4}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v4

    sub-int v5, p2, p1

    add-int/2addr v3, v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 614
    invoke-direct {p0, v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->read(I)V

    goto :goto_a8

    :cond_92
    if-gt p2, v3, :cond_ab

    if-lt p1, v3, :cond_ab

    .line 617
    iget-object v4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v4}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 618
    invoke-direct {p0, v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->read(I)V

    :goto_a8
    add-int/lit8 v2, v2, 0x1

    goto :goto_64

    :cond_ab
    return-void
.end method

.method public final read()V
    .registers 5

    .line 521
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 522
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Lo/updatePriorityTaskManagerForIsLoadingChange;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v0

    goto :goto_18

    :cond_17
    move v0, v1

    :goto_18
    if-ge v1, v0, :cond_38

    .line 524
    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Lo/updatePriorityTaskManagerForIsLoadingChange;

    move-result-object v2

    if-eqz v2, :cond_35

    invoke-virtual {v2, v1}, Lo/updatePriorityTaskManagerForIsLoadingChange;->RemoteActionCompatParcelizer(I)Z

    move-result v2

    if-eqz v2, :cond_35

    .line 526
    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_35
    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    .line 531
    :cond_38
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_5b

    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatItemReceiver(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5b

    .line 532
    iget-object p0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {p0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesImplApi21Parcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)V

    :cond_5b
    return-void
.end method

.method public final read(II)V
    .registers 9

    .line 562
    iget-object v0, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v0}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_79

    add-int v1, p1, p2

    add-int/lit8 v2, v1, -0x1

    const/4 v3, -0x1

    if-lt v2, p1, :cond_2b

    .line 566
    :goto_13
    iget-object v4, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v4, v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->read(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)I

    move-result v4

    if-eq v4, v3, :cond_26

    .line 568
    iget-object v5, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v5}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    :cond_26
    if-eq v2, p1, :cond_2b

    add-int/lit8 v2, v2, -0x1

    goto :goto_13

    .line 574
    :cond_2b
    iget-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4e

    iget-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->MediaBrowserCompatItemReceiver(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4e

    .line 575
    iget-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {p1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->AudioAttributesImplApi21Parcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)V

    .line 579
    :cond_4e
    iget-object p1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {p1, v1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->RemoteActionCompatParcelizer(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;I)I

    move-result p1

    :goto_54
    if-eq p1, v3, :cond_79

    if-ge p1, v0, :cond_79

    .line 581
    iget-object v1, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v1}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;->AudioAttributesCompatParcelizer:Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;

    invoke-static {v2}, Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;->write(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sub-int/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    goto :goto_54

    :cond_79
    return-void
.end method
