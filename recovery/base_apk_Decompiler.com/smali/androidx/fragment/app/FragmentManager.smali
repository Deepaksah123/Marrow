###### Class androidx.fragment.app.FragmentManager (androidx.fragment.app.FragmentManager)
.class public abstract Landroidx/fragment/app/FragmentManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/FragmentManager$RemoteActionCompatParcelizer;,
        Landroidx/fragment/app/FragmentManager$IconCompatParcelizer;,
        Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;,
        Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;,
        Landroidx/fragment/app/FragmentManager$read;,
        Landroidx/fragment/app/FragmentManager$write;,
        Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;,
        Landroidx/fragment/app/FragmentManager$MediaBrowserCompatItemReceiver;
    }
.end annotation


# static fields
.field static write:Z = true


# instance fields
.field AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

.field private final AudioAttributesImplApi21Parcelizer:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final AudioAttributesImplApi26Parcelizer:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/fragment/app/BackStackState;",
            ">;"
        }
    .end annotation
.end field

.field private AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field IconCompatParcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/FragmentManager$read;",
            ">;"
        }
    .end annotation
.end field

.field private MediaBrowserCompatCustomActionResultReceiver:Lo/getAlwaysAsId;

.field private MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;"
        }
    .end annotation
.end field

.field private MediaBrowserCompatMediaItem:I

.field private MediaBrowserCompatSearchResultReceiver:Ljava/lang/Runnable;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/NopAnnotationIntrospector1;

.field private MediaDescriptionCompat:Z

.field private MediaMetadataCompat:Lo/getAnySetterField;

.field private MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;"
        }
    .end annotation
.end field

.field private PlaybackStateCompat:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private RatingCompat:Z

.field RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;",
            ">;"
        }
    .end annotation
.end field

.field private handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/pessimisticallyValidateBounds<",
            "*>;"
        }
    .end annotation
.end field

.field private onAddQueueItem:Z

.field private final onCommand:Lo/_property;

.field private onCustomAction:Z

.field private final onFastForward:Lo/getResolverType;

.field private onMediaButtonEvent:Lo/NopAnnotationIntrospector1;

.field private final onPause:Lo/UntypedObjectDeserializerNRScope;

.field private onPlay:Z

.field private final onPlayFromMediaId:Lo/getGeneratorType;

.field private final onPlayFromSearch:Lo/wrapAsJsonMappingException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/wrapAsJsonMappingException<",
            "Landroid/content/res/Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private final onPlayFromUri:Lo/onRemoveQueueItemAt;

.field private final onPrepare:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lo/_addInjectables;",
            ">;"
        }
    .end annotation
.end field

.field private onPrepareFromMediaId:Lo/onSetRating;

.field private onPrepareFromSearch:Lo/_addMethods;

.field private final onPrepareFromUri:Lo/wrapAsJsonMappingException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/wrapAsJsonMappingException<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final onRemoveQueueItem:Lo/wrapAsJsonMappingException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/wrapAsJsonMappingException<",
            "Lo/_isIntNumber;",
            ">;"
        }
    .end annotation
.end field

.field private final onRemoveQueueItemAt:Lo/wrapAsJsonMappingException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/wrapAsJsonMappingException<",
            "Lo/_checkTextualNull;",
            ">;"
        }
    .end annotation
.end field

.field private final onRewind:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/FragmentManager$write;",
            ">;"
        }
    .end annotation
.end field

.field private onSeekTo:Landroidx/fragment/app/Fragment;

.field private onSetCaptioningEnabled:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final onSetPlaybackSpeed:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field private onSetRating:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private onSetRepeatMode:Lo/getAnySetterField;

.field private final onSetShuffleMode:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private onSkipToNext:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;"
        }
    .end annotation
.end field

.field private onSkipToPrevious:Lo/getJsonValueAccessor$write;

.field private onSkipToQueueItem:Z

.field private onStop:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field read:Lo/_refinePropertyInclusion;

.field private setSessionImpl:Z


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 507
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    .line 510
    new-instance v0, Lo/_property;

    invoke-direct {v0}, Lo/_property;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    .line 511
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    .line 513
    new-instance v0, Lo/getResolverType;

    invoke-direct {v0, p0}, Lo/getResolverType;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->onFastForward:Lo/getResolverType;

    const/4 v0, 0x0

    .line 517
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    const/4 v1, 0x0

    .line 521
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentManager;->onAddQueueItem:Z

    .line 522
    new-instance v1, Landroidx/fragment/app/FragmentManager$2;

    invoke-direct {v1, p0}, Landroidx/fragment/app/FragmentManager$2;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromUri:Lo/onRemoveQueueItemAt;

    .line 589
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi21Parcelizer:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 591
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 592
    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi26Parcelizer:Ljava/util/Map;

    .line 594
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 595
    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed:Ljava/util/Map;

    .line 596
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 597
    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onSetShuffleMode:Ljava/util/Map;

    .line 599
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    .line 600
    new-instance v1, Lo/getGeneratorType;

    invoke-direct {v1, p0}, Lo/getGeneratorType;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromMediaId:Lo/getGeneratorType;

    .line 602
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepare:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 605
    new-instance v1, Lo/POJOPropertiesCollector;

    invoke-direct {v1, p0}, Lo/POJOPropertiesCollector;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromSearch:Lo/wrapAsJsonMappingException;

    .line 610
    new-instance v1, Lo/_addCreatorParam;

    invoke-direct {v1, p0}, Lo/_addCreatorParam;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromUri:Lo/wrapAsJsonMappingException;

    .line 615
    new-instance v1, Lo/_propNameFromSimple;

    invoke-direct {v1, p0}, Lo/_propNameFromSimple;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItemAt:Lo/wrapAsJsonMappingException;

    .line 621
    new-instance v1, Lo/_anyIndexed;

    invoke-direct {v1, p0}, Lo/_anyIndexed;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItem:Lo/wrapAsJsonMappingException;

    .line 628
    new-instance v1, Landroidx/fragment/app/FragmentManager$4;

    invoke-direct {v1, p0}, Landroidx/fragment/app/FragmentManager$4;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPause:Lo/UntypedObjectDeserializerNRScope;

    const/4 v1, -0x1

    .line 650
    iput v1, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    .line 657
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/NopAnnotationIntrospector1;

    .line 658
    new-instance v1, Landroidx/fragment/app/FragmentManager$5;

    invoke-direct {v1, p0}, Landroidx/fragment/app/FragmentManager$5;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onMediaButtonEvent:Lo/NopAnnotationIntrospector1;

    .line 666
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSetRepeatMode:Lo/getAnySetterField;

    .line 667
    new-instance v0, Landroidx/fragment/app/FragmentManager$1;

    invoke-direct {v0, p0}, Landroidx/fragment/app/FragmentManager$1;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaMetadataCompat:Lo/getAnySetterField;

    .line 680
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;

    .line 700
    new-instance v0, Landroidx/fragment/app/FragmentManager$8;

    invoke-direct {v0, p0}, Landroidx/fragment/app/FragmentManager$8;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/Runnable;

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Ljava/lang/String;IZ)I
    .registers 8

    .line 2639
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_a

    return v1

    :cond_a
    if-nez p1, :cond_1b

    if-gez p2, :cond_1b

    if-eqz p3, :cond_12

    const/4 p0, 0x0

    return p0

    .line 2646
    :cond_12
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0

    .line 2651
    :cond_1b
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_23
    if-ltz v0, :cond_42

    .line 2653
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_refinePropertyInclusion;

    if-eqz p1, :cond_39

    .line 2654
    invoke-virtual {v2}, Lo/_refinePropertyInclusion;->MediaBrowserCompatItemReceiver()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_42

    :cond_39
    if-ltz p2, :cond_3f

    .line 2657
    iget v2, v2, Lo/_refinePropertyInclusion;->write:I

    if-eq p2, v2, :cond_42

    :cond_3f
    add-int/lit8 v0, v0, -0x1

    goto :goto_23

    :cond_42
    if-gez v0, :cond_45

    return v0

    :cond_45
    if-eqz p3, :cond_69

    :goto_47
    if-lez v0, :cond_68

    .line 2668
    iget-object p3, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p3, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lo/_refinePropertyInclusion;

    if-eqz p1, :cond_5f

    .line 2669
    invoke-virtual {p3}, Lo/_refinePropertyInclusion;->MediaBrowserCompatItemReceiver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_65

    :cond_5f
    if-ltz p2, :cond_68

    iget p3, p3, Lo/_refinePropertyInclusion;->write:I

    if-ne p2, p3, :cond_68

    :cond_65
    add-int/lit8 v0, v0, -0x1

    goto :goto_47

    :cond_68
    return v0

    .line 2676
    :cond_69
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    if-ne v0, p0, :cond_74

    return v1

    :cond_74
    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/fragment/app/Fragment;
    .registers 3

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_17

    .line 1317
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->write(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_a

    return-object v1

    .line 1321
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    .line 1322
    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_15

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_15
    move-object p0, v0

    goto :goto_0

    :cond_17
    return-object v0
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager;)Lo/_property;
    .registers 1

    .line 108
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer(Lo/_addInjectables;)V
    .registers 2

    .line 3644
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPrepare:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private AudioAttributesCompatParcelizer(ZZ)V
    .registers 5

    if-eqz p2, :cond_12

    .line 3349
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v0, v0, Lo/_findCoercionFromEmptyArray;

    if-eqz v0, :cond_12

    .line 3350
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/lang/RuntimeException;)V

    .line 3355
    :cond_12
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->read()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1c
    :goto_1c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1c

    .line 3357
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performPictureInPictureModeChanged(Z)V

    if-eqz p2, :cond_1c

    .line 3359
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(ZZ)V

    goto :goto_1c

    :cond_36
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 2374
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    monitor-enter v0

    .line 2375
    :try_start_3
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_4b

    const/4 v2, 0x0

    if-eqz v1, :cond_e

    .line 2376
    monitor-exit v0

    return v2

    .line 2380
    :cond_e
    :try_start_e
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    move v3, v2

    :goto_15
    if-ge v2, v1, :cond_27

    .line 2382
    iget-object v4, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/FragmentManager$write;

    invoke-interface {v4, p1, p2}, Landroidx/fragment/app/FragmentManager$write;->read(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v4
    :try_end_23
    .catchall {:try_start_e .. :try_end_23} :catchall_39

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    .line 2387
    :cond_27
    :try_start_27
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    .line 2388
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p1}, Lo/pessimisticallyValidateBounds;->MediaBrowserCompatItemReceiver()Landroid/os/Handler;

    move-result-object p1

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/Runnable;

    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    :try_end_37
    .catchall {:try_start_27 .. :try_end_37} :catchall_4b

    .line 2390
    monitor-exit v0

    return v3

    :catchall_39
    move-exception p1

    .line 2387
    :try_start_3a
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->clear()V

    .line 2388
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p2}, Lo/pessimisticallyValidateBounds;->MediaBrowserCompatItemReceiver()Landroid/os/Handler;

    move-result-object p2

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/Runnable;

    invoke-virtual {p2, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2389
    throw p1
    :try_end_4b
    .catchall {:try_start_3a .. :try_end_4b} :catchall_4b

    :catchall_4b
    move-exception p0

    .line 2390
    monitor-exit v0

    throw p0
.end method

.method public static IconCompatParcelizer(I)I
    .registers 4

    const/16 v0, 0x2002

    const/16 v1, 0x1001

    if-eq p0, v1, :cond_1a

    if-eq p0, v0, :cond_19

    const/16 v0, 0x1004

    const/16 v1, 0x2005

    if-eq p0, v1, :cond_18

    const/16 v2, 0x1003

    if-eq p0, v2, :cond_17

    if-eq p0, v0, :cond_16

    const/4 p0, 0x0

    return p0

    :cond_16
    return v1

    :cond_17
    return v2

    :cond_18
    return v0

    :cond_19
    return v1

    :cond_1a
    return v0
.end method

.method static IconCompatParcelizer(Lo/_refinePropertyInclusion;)Ljava/util/Set;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/_refinePropertyInclusion;",
            ")",
            "Ljava/util/Set<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    .line 2408
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    .line 2409
    :goto_6
    iget-object v2, p0, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_24

    .line 2410
    iget-object v2, p0, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_doAddInjectable$write;

    iget-object v2, v2, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_21

    .line 2411
    iget-boolean v3, p0, Lo/_doAddInjectable;->RemoteActionCompatParcelizer:Z

    if-eqz v3, :cond_21

    .line 2412
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_21
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_24
    return-object v0
.end method

.method private IconCompatParcelizer(Ljava/lang/RuntimeException;)V
    .registers 6

    .line 708
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 710
    new-instance v0, Lo/_replaceCreatorProperty;

    const-string v1, "FragmentManager"

    invoke-direct {v0, v1}, Lo/_replaceCreatorProperty;-><init>(Ljava/lang/String;)V

    .line 711
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 712
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    const/4 v2, 0x0

    const-string v3, "  "

    if-eqz v0, :cond_1c

    .line 714
    :try_start_16
    new-array p0, v2, [Ljava/lang/String;

    invoke-virtual {v0, v3, v1, p0}, Lo/pessimisticallyValidateBounds;->write(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto :goto_22

    .line 720
    :cond_1c
    new-array v0, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v3, v2, v1, v0}, Landroidx/fragment/app/FragmentManager;->write(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_22} :catch_22

    .line 725
    :catch_22
    :goto_22
    throw p1
.end method

.method private static IconCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    :goto_0
    if-ge p2, p3, :cond_26

    .line 2273
    invoke-virtual {p0, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/_refinePropertyInclusion;

    .line 2274
    invoke-virtual {p1, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1c

    const/4 v1, -0x1

    .line 2276
    invoke-virtual {v0, v1}, Lo/_refinePropertyInclusion;->write(I)V

    .line 2277
    invoke-virtual {v0}, Lo/_refinePropertyInclusion;->AudioAttributesImplBaseParcelizer()V

    goto :goto_23

    :cond_1c
    const/4 v1, 0x1

    .line 2279
    invoke-virtual {v0, v1}, Lo/_refinePropertyInclusion;->write(I)V

    .line 2280
    invoke-virtual {v0}, Lo/_refinePropertyInclusion;->AudioAttributesImplApi26Parcelizer()V

    :goto_23
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_26
    return-void
.end method

.method private IconCompatParcelizer(Z)V
    .registers 4

    .line 1946
    iget-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat:Z

    if-nez v0, :cond_4c

    .line 1950
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    if-nez v0, :cond_1c

    .line 1951
    iget-boolean p0, p0, Landroidx/fragment/app/FragmentManager;->RatingCompat:Z

    if-eqz p0, :cond_14

    .line 1952
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "FragmentManager has been destroyed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1954
    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "FragmentManager has not been attached to a host."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1958
    :cond_1c
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v1}, Lo/pessimisticallyValidateBounds;->MediaBrowserCompatItemReceiver()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_44

    if-nez p1, :cond_31

    .line 1963
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetShuffleMode()V

    .line 1966
    :cond_31
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    if-nez p1, :cond_43

    .line 1967
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    .line 1968
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat:Ljava/util/ArrayList;

    :cond_43
    return-void

    .line 1959
    :cond_44
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Must be called from main thread of fragment host"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1947
    :cond_4c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "FragmentManager is already executing transactions"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private IconCompatParcelizer(ZZ)V
    .registers 5

    if-eqz p2, :cond_12

    .line 3331
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v0, v0, Lo/_findCoercionFromBlankString;

    if-eqz v0, :cond_12

    .line 3332
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/lang/RuntimeException;)V

    .line 3336
    :cond_12
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->read()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1c
    :goto_1c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1c

    .line 3338
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performMultiWindowModeChanged(Z)V

    if-eqz p2, :cond_1c

    .line 3340
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(ZZ)V

    goto :goto_1c

    :cond_36
    return-void
.end method

.method private IconCompatParcelizer(II)Z
    .registers 11

    const/4 v0, 0x0

    .line 1099
    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Z)Z

    const/4 v0, 0x1

    .line 1100
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Z)V

    .line 1102
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_19

    if-gez p1, :cond_19

    .line 1105
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    .line 1106
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItemAt()Z

    move-result v1

    if-eqz v1, :cond_19

    return v0

    .line 1112
    :cond_19
    iget-object v3, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat:Ljava/util/ArrayList;

    const/4 v5, 0x0

    move-object v2, p0

    move v6, p1

    move v7, p2

    invoke-virtual/range {v2 .. v7}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_39

    .line 1114
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat:Z

    .line 1116
    :try_start_29
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat:Ljava/util/ArrayList;

    invoke-direct {p0, p2, v0}, Landroidx/fragment/app/FragmentManager;->write(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_30
    .catchall {:try_start_29 .. :try_end_30} :catchall_34

    .line 1118
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed()V

    goto :goto_39

    :catchall_34
    move-exception p1

    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed()V

    .line 1119
    throw p1

    .line 1122
    :cond_39
    :goto_39
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatQueueItem()V

    .line 1123
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->setSessionImpl()V

    .line 1124
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->IconCompatParcelizer()V

    return p1
.end method

.method private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;
    .registers 4

    .line 2306
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_7

    .line 2307
    iget-object p0, p1, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    return-object p0

    .line 2310
    :cond_7
    iget v0, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    const/4 v1, 0x0

    if-gtz v0, :cond_d

    return-object v1

    .line 2317
    :cond_d
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatCustomActionResultReceiver:Lo/getAlwaysAsId;

    invoke-virtual {v0}, Lo/getAlwaysAsId;->AudioAttributesCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_24

    .line 2318
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatCustomActionResultReceiver:Lo/getAlwaysAsId;

    iget p1, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    invoke-virtual {p0, p1}, Lo/getAlwaysAsId;->read(I)Landroid/view/View;

    move-result-object p0

    .line 2320
    instance-of p1, p0, Landroid/view/ViewGroup;

    if-eqz p1, :cond_24

    .line 2321
    check-cast p0, Landroid/view/ViewGroup;

    return-object p0

    :cond_24
    return-object v1
.end method

.method private MediaSessionCompatQueueItem()V
    .registers 5

    .line 788
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    monitor-enter v0

    .line 789
    :try_start_3
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-nez v1, :cond_1d

    .line 790
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromUri:Lo/onRemoveQueueItemAt;

    invoke-virtual {v1, v3}, Lo/onRemoveQueueItemAt;->setEnabled(Z)V

    .line 791
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v1

    if-eqz v1, :cond_1b

    .line 792
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_1b
    .catchall {:try_start_3 .. :try_end_1b} :catchall_3c

    .line 795
    :cond_1b
    monitor-exit v0

    return-void

    .line 797
    :cond_1d
    monitor-exit v0

    .line 801
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onCustomAction()I

    move-result v0

    if-lez v0, :cond_2c

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    .line 802
    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem(Landroidx/fragment/app/Fragment;)Z

    move-result v0

    if-nez v0, :cond_2d

    :cond_2c
    const/4 v3, 0x0

    .line 803
    :cond_2d
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_36

    .line 804
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 809
    :cond_36
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromUri:Lo/onRemoveQueueItemAt;

    invoke-virtual {p0, v3}, Lo/onRemoveQueueItemAt;->setEnabled(Z)V

    return-void

    :catchall_3c
    move-exception p0

    .line 797
    monitor-exit v0

    throw p0
.end method

.method private MediaSessionCompatResultReceiverWrapper()V
    .registers 4

    .line 1925
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    monitor-enter v0

    .line 1926
    :try_start_3
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_25

    .line 1928
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v1}, Lo/pessimisticallyValidateBounds;->MediaBrowserCompatItemReceiver()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1929
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v1}, Lo/pessimisticallyValidateBounds;->MediaBrowserCompatItemReceiver()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1930
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatQueueItem()V
    :try_end_25
    .catchall {:try_start_3 .. :try_end_25} :catchall_27

    .line 1932
    :cond_25
    monitor-exit v0

    return-void

    :catchall_27
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private MediaSessionCompatToken()Landroidx/fragment/app/Fragment;
    .registers 1

    .line 3524
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    return-object p0
.end method

.method private ParcelableVolumeInfo()V
    .registers 3

    .line 1696
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v0}, Lo/_property;->write()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/_addSetterMethod;

    .line 1697
    invoke-virtual {p0, v1}, Landroidx/fragment/app/FragmentManager;->read(Lo/_addSetterMethod;)V

    goto :goto_a

    :cond_1a
    return-void
.end method

.method private PlaybackStateCompat()Z
    .registers 4

    .line 3683
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->AudioAttributesCompatParcelizer()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_1e

    .line 3685
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->onFastForward(Landroidx/fragment/app/Fragment;)Z

    move-result v1

    :cond_1e
    if-eqz v1, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_22
    return v0
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/fragment/app/FragmentManager;)V
    .registers 1

    .line 108
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSkipToNext()V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    .line 2129
    invoke-virtual {p1, p3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/_refinePropertyInclusion;

    iget-boolean v0, v0, Lo/_doAddInjectable;->handleMediaPlayPauseIfPendingOnHandler:Z

    .line 2131
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onStop:Ljava/util/ArrayList;

    if-nez v1, :cond_14

    .line 2132
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/FragmentManager;->onStop:Ljava/util/ArrayList;

    goto :goto_17

    .line 2134
    :cond_14
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    .line 2136
    :goto_17
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onStop:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v2}, Lo/_property;->read()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 2137
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatToken()Landroidx/fragment/app/Fragment;

    move-result-object v1

    const/4 v2, 0x0

    move v3, p3

    move v4, v2

    :goto_29
    const/4 v5, 0x1

    if-ge v3, p4, :cond_57

    .line 2139
    invoke-virtual {p1, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo/_refinePropertyInclusion;

    .line 2140
    invoke-virtual {p2, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_45

    .line 2142
    iget-object v7, p0, Landroidx/fragment/app/FragmentManager;->onStop:Ljava/util/ArrayList;

    invoke-virtual {v6, v7, v1}, Lo/_refinePropertyInclusion;->read(Ljava/util/ArrayList;Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    goto :goto_4b

    .line 2144
    :cond_45
    iget-object v7, p0, Landroidx/fragment/app/FragmentManager;->onStop:Ljava/util/ArrayList;

    invoke-virtual {v6, v7, v1}, Lo/_refinePropertyInclusion;->IconCompatParcelizer(Ljava/util/ArrayList;Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    :goto_4b
    if-nez v4, :cond_53

    .line 2146
    iget-boolean v4, v6, Lo/_doAddInjectable;->RemoteActionCompatParcelizer:Z

    if-nez v4, :cond_53

    move v4, v2

    goto :goto_54

    :cond_53
    move v4, v5

    :goto_54
    add-int/lit8 v3, v3, 0x1

    goto :goto_29

    .line 2148
    :cond_57
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onStop:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    if-nez v0, :cond_92

    .line 2150
    iget v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    if-lez v0, :cond_92

    move v0, p3

    :goto_63
    if-ge v0, p4, :cond_92

    .line 2154
    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/_refinePropertyInclusion;

    .line 2155
    iget-object v1, v1, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_71
    :goto_71
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_doAddInjectable$write;

    .line 2156
    iget-object v2, v2, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_71

    .line 2157
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v3, :cond_71

    .line 2159
    invoke-virtual {p0, v2}, Landroidx/fragment/app/FragmentManager;->read(Landroidx/fragment/app/Fragment;)Lo/_addSetterMethod;

    move-result-object v2

    .line 2160
    iget-object v3, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v3, v2}, Lo/_property;->IconCompatParcelizer(Lo/_addSetterMethod;)V

    goto :goto_71

    :cond_8f
    add-int/lit8 v0, v0, 0x1

    goto :goto_63

    .line 2165
    :cond_92
    invoke-static {p1, p2, p3, p4}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v0, p4, -0x1

    .line 2169
    invoke-virtual {p2, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v4, :cond_112

    .line 2171
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_112

    .line 2172
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2174
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/_refinePropertyInclusion;

    .line 2175
    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Lo/_refinePropertyInclusion;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_b4

    .line 2177
    :cond_c8
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    if-nez v2, :cond_112

    .line 2179
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_ef

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/FragmentManager$read;

    .line 2181
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/Fragment;

    goto :goto_e2

    .line 2185
    :cond_ef
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_f5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_112

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/FragmentManager$read;

    .line 2187
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_105
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/Fragment;

    goto :goto_105

    :cond_112
    move v1, p3

    :goto_113
    if-ge v1, p4, :cond_15d

    .line 2196
    invoke-virtual {p1, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_refinePropertyInclusion;

    if-eqz v0, :cond_13c

    .line 2199
    iget-object v3, v2, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    sub-int/2addr v3, v5

    :goto_124
    if-ltz v3, :cond_15a

    .line 2200
    iget-object v6, v2, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo/_doAddInjectable$write;

    .line 2201
    iget-object v6, v6, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v6, :cond_139

    .line 2204
    invoke-virtual {p0, v6}, Landroidx/fragment/app/FragmentManager;->read(Landroidx/fragment/app/Fragment;)Lo/_addSetterMethod;

    move-result-object v6

    .line 2205
    invoke-virtual {v6}, Lo/_addSetterMethod;->RemoteActionCompatParcelizer()V

    :cond_139
    add-int/lit8 v3, v3, -0x1

    goto :goto_124

    .line 2209
    :cond_13c
    iget-object v2, v2, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_142
    :goto_142
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/_doAddInjectable$write;

    .line 2210
    iget-object v3, v3, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_142

    .line 2213
    invoke-virtual {p0, v3}, Landroidx/fragment/app/FragmentManager;->read(Landroidx/fragment/app/Fragment;)Lo/_addSetterMethod;

    move-result-object v3

    .line 2214
    invoke-virtual {v3}, Lo/_addSetterMethod;->RemoteActionCompatParcelizer()V

    goto :goto_142

    :cond_15a
    add-int/lit8 v1, v1, 0x1

    goto :goto_113

    .line 2221
    :cond_15d
    iget v1, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    invoke-direct {p0, v1, v5}, Landroidx/fragment/app/FragmentManager;->read(IZ)V

    .line 2222
    invoke-virtual {p0, p1, p3, p4}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Ljava/util/ArrayList;II)Ljava/util/Set;

    move-result-object v1

    .line 2224
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_16a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_180

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_renameUsing;

    .line 2225
    invoke-virtual {v2, v0}, Lo/_renameUsing;->RemoteActionCompatParcelizer(Z)V

    .line 2226
    invoke-virtual {v2}, Lo/_renameUsing;->AudioAttributesImplApi26Parcelizer()V

    .line 2227
    invoke-virtual {v2}, Lo/_renameUsing;->read()V

    goto :goto_16a

    :cond_180
    :goto_180
    if-ge p3, p4, :cond_1a1

    .line 2231
    invoke-virtual {p1, p3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/_refinePropertyInclusion;

    .line 2232
    invoke-virtual {p2, p3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_19b

    .line 2233
    iget v1, v0, Lo/_refinePropertyInclusion;->write:I

    if-ltz v1, :cond_19b

    const/4 v1, -0x1

    .line 2234
    iput v1, v0, Lo/_refinePropertyInclusion;->write:I

    .line 2236
    :cond_19b
    invoke-virtual {v0}, Lo/_refinePropertyInclusion;->MediaBrowserCompatCustomActionResultReceiver()V

    add-int/lit8 p3, p3, 0x1

    goto :goto_180

    :cond_1a1
    if-eqz v4, :cond_1a6

    .line 2239
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSkipToPrevious()V

    :cond_1a6
    return-void
.end method

.method private handleMediaPlayPauseIfPendingOnHandler(Landroidx/fragment/app/Fragment;)Lo/_addMethods;
    .registers 2

    .line 1428
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {p0, p1}, Lo/_addMethods;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/Fragment;)Lo/_addMethods;

    move-result-object p0

    return-object p0
.end method

.method public static onAddQueueItem(Landroidx/fragment/app/Fragment;)V
    .registers 2

    const/4 v0, 0x2

    .line 1782
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1783
    :cond_a
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    if-eqz v0, :cond_17

    const/4 v0, 0x0

    .line 1784
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 1787
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    :cond_17
    return-void
.end method

.method private onCommand(Landroidx/fragment/app/Fragment;)V
    .registers 3

    if-eqz p1, :cond_11

    .line 3499
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_11

    .line 3500
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->performPrimaryNavigationFragmentChanged()V

    :cond_11
    return-void
.end method

.method private static onFastForward(Landroidx/fragment/app/Fragment;)Z
    .registers 2

    .line 3695
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    if-nez v0, :cond_10

    :cond_8
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat()Z

    move-result p0

    if-eqz p0, :cond_12

    :cond_10
    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method private onPlay(Landroidx/fragment/app/Fragment;)V
    .registers 4

    .line 2292
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;

    move-result-object p0

    if-eqz p0, :cond_37

    .line 2294
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getEnterAnim()I

    move-result v0

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getExitAnim()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getPopEnterAnim()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getPopExitAnim()I

    move-result v1

    add-int/2addr v0, v1

    if-lez v0, :cond_37

    .line 2296
    sget v0, Lo/findSubtypesCheckRepeatedNames$AudioAttributesCompatParcelizer;->visible_removing_fragment_view_tag:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_28

    .line 2297
    sget v0, Lo/findSubtypesCheckRepeatedNames$AudioAttributesCompatParcelizer;->visible_removing_fragment_view_tag:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2299
    :cond_28
    sget v0, Lo/findSubtypesCheckRepeatedNames$AudioAttributesCompatParcelizer;->visible_removing_fragment_view_tag:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 2300
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getPopDirection()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->setPopDirection(Z)V

    :cond_37
    return-void
.end method

.method private onSetPlaybackSpeed()V
    .registers 2

    const/4 v0, 0x0

    .line 2018
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat:Z

    .line 2019
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 2020
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method private onSetRating()Ljava/util/Set;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lo/_renameUsing;",
            ">;"
        }
    .end annotation

    .line 2349
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 2351
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v1}, Lo/_property;->write()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_addSetterMethod;

    .line 2352
    invoke-virtual {v2}, Lo/_addSetterMethod;->IconCompatParcelizer()Landroidx/fragment/app/Fragment;

    move-result-object v2

    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    if-eqz v2, :cond_f

    .line 2355
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onPause()Lo/getAnySetterField;

    move-result-object v3

    .line 2354
    invoke-static {v2, v3}, Lo/_renameUsing;->IconCompatParcelizer(Landroid/view/ViewGroup;Lo/getAnySetterField;)Lo/_renameUsing;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_2f
    return-object v0
.end method

.method private onSetRepeatMode()V
    .registers 6

    .line 1494
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v1, v0, Lo/TypeResolutionContext;

    if-eqz v1, :cond_11

    .line 1495
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v0}, Lo/_property;->MediaBrowserCompatItemReceiver()Lo/_addMethods;

    move-result-object v0

    invoke-virtual {v0}, Lo/_addMethods;->read()Z

    move-result v0

    goto :goto_27

    .line 1496
    :cond_11
    invoke-virtual {v0}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_29

    .line 1497
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v0}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 1498
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    :goto_27
    if-eqz v0, :cond_5c

    .line 1503
    :cond_29
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi26Parcelizer:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/BackStackState;

    .line 1504
    iget-object v1, v1, Landroidx/fragment/app/BackStackState;->AudioAttributesCompatParcelizer:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_45
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1505
    iget-object v3, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v3}, Lo/_property;->MediaBrowserCompatItemReceiver()Lo/_addMethods;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Lo/_addMethods;->IconCompatParcelizer(Ljava/lang/String;Z)V

    goto :goto_45

    :cond_5c
    return-void
.end method

.method private onSetShuffleMode()V
    .registers 2

    .line 1861
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch()Z

    move-result p0

    if-nez p0, :cond_7

    return-void

    .line 1862
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private onSkipToNext()V
    .registers 2

    .line 2342
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetRating()Ljava/util/Set;

    move-result-object p0

    .line 2343
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/_renameUsing;

    .line 2344
    invoke-virtual {v0}, Lo/_renameUsing;->IconCompatParcelizer()V

    goto :goto_8

    :cond_18
    return-void
.end method

.method private onSkipToPrevious()V
    .registers 3

    const/4 v0, 0x0

    .line 2402
    :goto_1
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_17

    .line 2403
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/FragmentManager$read;

    invoke-interface {v1}, Landroidx/fragment/app/FragmentManager$read;->write()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_17
    return-void
.end method

.method private onSkipToQueueItem()V
    .registers 2

    .line 2331
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetRating()Ljava/util/Set;

    move-result-object p0

    .line 2332
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/_renameUsing;

    .line 2333
    invoke-virtual {v0}, Lo/_renameUsing;->AudioAttributesCompatParcelizer()V

    goto :goto_8

    :cond_18
    return-void
.end method

.method private onStop()Z
    .registers 3

    .line 3706
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x1

    if-nez v0, :cond_6

    return v1

    .line 3709
    :cond_6
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onStop()Z

    move-result p0

    if-eqz p0, :cond_19

    return v1

    :cond_19
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic read(Landroidx/fragment/app/FragmentManager;)Ljava/util/Map;
    .registers 1

    .line 108
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed:Ljava/util/Map;

    return-object p0
.end method

.method private read(I)V
    .registers 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3317
    :try_start_2
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat:Z

    .line 3318
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v2, p1}, Lo/_property;->write(I)V

    .line 3319
    invoke-direct {p0, p1, v1}, Landroidx/fragment/app/FragmentManager;->read(IZ)V

    .line 3320
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetRating()Ljava/util/Set;

    move-result-object p1

    .line 3321
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_renameUsing;

    .line 3322
    invoke-virtual {v2}, Lo/_renameUsing;->IconCompatParcelizer()V
    :try_end_23
    .catchall {:try_start_2 .. :try_end_23} :catchall_2a

    goto :goto_14

    .line 3325
    :cond_24
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat:Z

    .line 3327
    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Z)Z

    return-void

    :catchall_2a
    move-exception p1

    .line 3325
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat:Z

    .line 3326
    throw p1
.end method

.method private read(IZ)V
    .registers 4

    .line 1676
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    if-nez v0, :cond_10

    const/4 v0, -0x1

    if-ne p1, v0, :cond_8

    goto :goto_10

    .line 1677
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No activity"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_10
    :goto_10
    if-nez p2, :cond_16

    .line 1680
    iget p2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    if-eq p1, p2, :cond_33

    .line 1684
    :cond_16
    iput p1, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    .line 1685
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p1}, Lo/_property;->AudioAttributesImplApi21Parcelizer()V

    .line 1686
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->ParcelableVolumeInfo()V

    .line 1688
    iget-boolean p1, p0, Landroidx/fragment/app/FragmentManager;->onPlay:Z

    if-eqz p1, :cond_33

    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    if-eqz p1, :cond_33

    iget p2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    const/4 v0, 0x7

    if-ne p2, v0, :cond_33

    .line 1689
    invoke-virtual {p1}, Lo/pessimisticallyValidateBounds;->read()V

    const/4 p1, 0x0

    .line 1690
    iput-boolean p1, p0, Landroidx/fragment/app/FragmentManager;->onPlay:Z

    :cond_33
    return-void
.end method

.method private read(Z)V
    .registers 4

    if-eqz p1, :cond_12

    .line 3384
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v0, v0, Lo/_isTrue;

    if-eqz v0, :cond_12

    .line 3385
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/lang/RuntimeException;)V

    .line 3389
    :cond_12
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->read()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1c
    :goto_1c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1c

    .line 3391
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->performLowMemory()V

    if-eqz p1, :cond_1c

    .line 3393
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/fragment/app/FragmentManager;->read(Z)V

    goto :goto_1c

    :cond_36
    return-void
.end method

.method private setSessionImpl()V
    .registers 2

    .line 2395
    iget-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onCustomAction:Z

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    .line 2396
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onCustomAction:Z

    .line 2397
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->ParcelableVolumeInfo()V

    :cond_a
    return-void
.end method

.method static write(Landroid/view/View;)Landroidx/fragment/app/Fragment;
    .registers 2

    .line 1334
    sget v0, Lo/findSubtypesCheckRepeatedNames$AudioAttributesCompatParcelizer;->fragment_container_view_tag:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    .line 1335
    instance-of v0, p0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_d

    .line 1336
    check-cast p0, Landroidx/fragment/app/Fragment;

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic write(Landroidx/fragment/app/FragmentManager;)Ljava/util/Map;
    .registers 1

    .line 108
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSetShuffleMode:Ljava/util/Map;

    return-object p0
.end method

.method private write(Landroid/content/res/Configuration;Z)V
    .registers 5

    if-eqz p2, :cond_12

    .line 3368
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v0, v0, Lo/_isPosInf;

    if-eqz v0, :cond_12

    .line 3369
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/lang/RuntimeException;)V

    .line 3373
    :cond_12
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->read()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1c
    :goto_1c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1c

    .line 3375
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performConfigurationChanged(Landroid/content/res/Configuration;)V

    if-eqz p2, :cond_1c

    .line 3377
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Landroidx/fragment/app/FragmentManager;->write(Landroid/content/res/Configuration;Z)V

    goto :goto_1c

    :cond_36
    return-void
.end method

.method private write(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 2082
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_66

    .line 2086
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne v0, v1, :cond_5e

    .line 2090
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_16
    if-ge v1, v0, :cond_58

    .line 2093
    invoke-virtual {p1, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/_refinePropertyInclusion;

    iget-boolean v3, v3, Lo/_doAddInjectable;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-nez v3, :cond_55

    if-eq v2, v1, :cond_27

    .line 2097
    invoke-direct {p0, p1, p2, v2, v1}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_27
    add-int/lit8 v2, v1, 0x1

    .line 2102
    invoke-virtual {p2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_50

    :goto_35
    if-ge v2, v0, :cond_50

    .line 2104
    invoke-virtual {p2, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_50

    .line 2105
    invoke-virtual {p1, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/_refinePropertyInclusion;

    iget-boolean v3, v3, Lo/_doAddInjectable;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-nez v3, :cond_50

    add-int/lit8 v2, v2, 0x1

    goto :goto_35

    .line 2109
    :cond_50
    invoke-direct {p0, p1, p2, v1, v2}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_55
    add-int/lit8 v1, v1, 0x1

    goto :goto_16

    :cond_58
    if-eq v2, v0, :cond_66

    .line 2115
    invoke-direct {p0, p1, p2, v2, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    goto :goto_66

    .line 2087
    :cond_5e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Internal error with the back stack records"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_66
    :goto_66
    return-void
.end method

.method public static write(I)Z
    .registers 2

    .line 151
    const-string v0, "FragmentManager"

    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-nez p0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 1936
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi21Parcelizer:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p0

    return p0
.end method

.method final AudioAttributesCompatParcelizer(Ljava/util/ArrayList;II)Ljava/util/Set;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;II)",
            "Ljava/util/Set<",
            "Lo/_renameUsing;",
            ">;"
        }
    .end annotation

    .line 2245
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    :goto_5
    if-ge p2, p3, :cond_32

    .line 2247
    invoke-virtual {p1, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/_refinePropertyInclusion;

    .line 2248
    iget-object v1, v1, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_doAddInjectable$write;

    .line 2249
    iget-object v2, v2, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_13

    .line 2251
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    if-eqz v2, :cond_13

    .line 2253
    invoke-static {v2, p0}, Lo/_renameUsing;->read(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Lo/_renameUsing;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_2f
    add-int/lit8 p2, p2, 0x1

    goto :goto_5

    :cond_32
    return-object v0
.end method

.method public final AudioAttributesCompatParcelizer(IZ)V
    .registers 6

    if-ltz p1, :cond_d

    .line 1051
    new-instance v0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;II)V

    invoke-virtual {p0, v0, p2}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager$write;Z)V

    return-void

    .line 1049
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Bad id: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/fragment/app/Fragment;)V
    .registers 5

    const/4 v0, 0x2

    .line 1792
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1793
    :cond_a
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    if-nez v1, :cond_2e

    const/4 v1, 0x1

    .line 1794
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 1795
    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    if-eqz v2, :cond_2e

    .line 1797
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1798
    :cond_1e
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v0, p1}, Lo/_property;->write(Landroidx/fragment/app/Fragment;)V

    .line 1799
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->onFastForward(Landroidx/fragment/app/Fragment;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 1800
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentManager;->onPlay:Z

    .line 1802
    :cond_2b
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager;->onPlay(Landroidx/fragment/app/Fragment;)V

    :cond_2e
    return-void
.end method

.method final AudioAttributesCompatParcelizer(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .registers 6

    .line 3159
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSetCaptioningEnabled:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    if-eqz v0, :cond_1d

    .line 3160
    new-instance v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    iget-object p1, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-direct {v0, p1, p3}, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;-><init>(Ljava/lang/String;I)V

    .line 3161
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    if-eqz p4, :cond_17

    .line 3163
    const-string p1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {p2, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 3165
    :cond_17
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSetCaptioningEnabled:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    invoke-virtual {p0, p2}, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;->read(Ljava/lang/Object;)V

    return-void

    .line 3167
    :cond_1d
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p0, p1, p2, p3, p4}, Lo/pessimisticallyValidateBounds;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentContainerView;)V
    .registers 6

    .line 1349
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->write()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_a
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_37

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/_addSetterMethod;

    .line 1350
    invoke-virtual {v0}, Lo/_addSetterMethod;->IconCompatParcelizer()Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 1351
    iget v2, v1, Landroidx/fragment/app/Fragment;->mContainerId:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    if-ne v2, v3, :cond_a

    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-eqz v2, :cond_a

    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 1352
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_a

    .line 1354
    iput-object p1, v1, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 1355
    invoke-virtual {v0}, Lo/_addSetterMethod;->write()V

    .line 1356
    invoke-virtual {v0}, Lo/_addSetterMethod;->RemoteActionCompatParcelizer()V

    goto :goto_a

    :cond_37
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager$write;Z)V
    .registers 5

    if-nez p2, :cond_1d

    .line 1894
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    if-nez v0, :cond_1a

    .line 1895
    iget-boolean p0, p0, Landroidx/fragment/app/FragmentManager;->RatingCompat:Z

    if-eqz p0, :cond_12

    .line 1896
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "FragmentManager has been destroyed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1898
    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "FragmentManager has not been attached to a host."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1902
    :cond_1a
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetShuffleMode()V

    .line 1904
    :cond_1d
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    monitor-enter v0

    .line 1905
    :try_start_20
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;
    :try_end_22
    .catchall {:try_start_20 .. :try_end_22} :catchall_3a

    if-nez v1, :cond_30

    if-eqz p2, :cond_28

    .line 1908
    monitor-exit v0

    return-void

    .line 1910
    :cond_28
    :try_start_28
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Activity has been destroyed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1912
    :cond_30
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1913
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper()V
    :try_end_38
    .catchall {:try_start_28 .. :try_end_38} :catchall_3a

    .line 1914
    monitor-exit v0

    return-void

    :catchall_3a
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final AudioAttributesCompatParcelizer(Ljava/lang/String;)V
    .registers 2

    .line 1184
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x2

    .line 1185
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    return-void
.end method

.method public final synthetic AudioAttributesCompatParcelizer(Lo/_checkTextualNull;)V
    .registers 3

    .line 617
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onStop()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 618
    invoke-virtual {p1}, Lo/_checkTextualNull;->write()Z

    move-result p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(ZZ)V

    :cond_e
    return-void
.end method

.method public final synthetic AudioAttributesCompatParcelizer(Lo/_isIntNumber;)V
    .registers 3

    .line 623
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onStop()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 624
    invoke-virtual {p1}, Lo/_isIntNumber;->IconCompatParcelizer()Z

    move-result p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(ZZ)V

    :cond_e
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Lo/_refinePropertyInclusion;)V
    .registers 2

    .line 2419
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Lo/pessimisticallyValidateBounds;Lo/getAlwaysAsId;Landroidx/fragment/app/Fragment;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/pessimisticallyValidateBounds<",
            "*>;",
            "Lo/getAlwaysAsId;",
            "Landroidx/fragment/app/Fragment;",
            ")V"
        }
    .end annotation

    .line 2950
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    if-nez v0, :cond_165

    .line 2951
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    .line 2952
    iput-object p2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatCustomActionResultReceiver:Lo/getAlwaysAsId;

    .line 2953
    iput-object p3, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    if-eqz p3, :cond_15

    .line 2958
    new-instance p2, Landroidx/fragment/app/FragmentManager$10;

    invoke-direct {p2, p0, p3}, Landroidx/fragment/app/FragmentManager$10;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V

    invoke-direct {p0, p2}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Lo/_addInjectables;)V

    goto :goto_1f

    .line 2966
    :cond_15
    instance-of p2, p1, Lo/_addInjectables;

    if-eqz p2, :cond_1f

    .line 2967
    move-object p2, p1

    check-cast p2, Lo/_addInjectables;

    invoke-direct {p0, p2}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Lo/_addInjectables;)V

    .line 2970
    :cond_1f
    :goto_1f
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_26

    .line 2974
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatQueueItem()V

    .line 2977
    :cond_26
    instance-of p2, p1, Lo/onSetShuffleMode;

    if-eqz p2, :cond_3b

    .line 2978
    move-object p2, p1

    check-cast p2, Lo/onSetShuffleMode;

    .line 2979
    invoke-interface {p2}, Lo/onSetShuffleMode;->getOnBackPressedDispatcher()Lo/onSetRating;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromMediaId:Lo/onSetRating;

    if-eqz p3, :cond_36

    move-object p2, p3

    .line 2981
    :cond_36
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromUri:Lo/onRemoveQueueItemAt;

    invoke-virtual {v0, p2, v1}, Lo/onSetRating;->AudioAttributesCompatParcelizer(Lo/hasGetter;Lo/onRemoveQueueItemAt;)V

    :cond_3b
    if-eqz p3, :cond_46

    .line 2986
    iget-object p1, p3, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p1, p3}, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler(Landroidx/fragment/app/Fragment;)Lo/_addMethods;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    goto :goto_5f

    .line 2987
    :cond_46
    instance-of p2, p1, Lo/TypeResolutionContext;

    if-eqz p2, :cond_57

    .line 2988
    check-cast p1, Lo/TypeResolutionContext;

    invoke-interface {p1}, Lo/TypeResolutionContext;->getViewModelStore()Lo/hasMixIns;

    move-result-object p1

    .line 2989
    invoke-static {p1}, Lo/_addMethods;->AudioAttributesCompatParcelizer(Lo/hasMixIns;)Lo/_addMethods;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    goto :goto_5f

    .line 2991
    :cond_57
    new-instance p1, Lo/_addMethods;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lo/_addMethods;-><init>(Z)V

    iput-object p1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    .line 2994
    :goto_5f
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch()Z

    move-result p2

    invoke-virtual {p1, p2}, Lo/_addMethods;->read(Z)V

    .line 2995
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {p1, p2}, Lo/_property;->IconCompatParcelizer(Lo/_addMethods;)V

    .line 2997
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of p2, p1, Lo/PieChart;

    if-eqz p2, :cond_90

    if-nez p3, :cond_90

    .line 2998
    check-cast p1, Lo/PieChart;

    .line 2999
    invoke-interface {p1}, Lo/PieChart;->getSavedStateRegistry()Lo/setOnChartValueSelectedListener;

    move-result-object p1

    .line 3000
    new-instance p2, Lo/_findNamingStrategy;

    invoke-direct {p2, p0}, Lo/_findNamingStrategy;-><init>(Landroidx/fragment/app/FragmentManager;)V

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0, p2}, Lo/setOnChartValueSelectedListener;->IconCompatParcelizer(Ljava/lang/String;Lo/setOnChartValueSelectedListener$AudioAttributesCompatParcelizer;)V

    .line 3006
    invoke-virtual {p1, v0}, Lo/setOnChartValueSelectedListener;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_90

    .line 3008
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->read(Landroid/os/Parcelable;)V

    .line 3012
    :cond_90
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of p2, p1, Lo/_init_lambda3;

    if-eqz p2, :cond_121

    .line 3013
    check-cast p1, Lo/_init_lambda3;

    .line 3014
    invoke-interface {p1}, Lo/_init_lambda3;->getActivityResultRegistry()Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

    move-result-object p1

    if-eqz p3, :cond_b2

    .line 3016
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p3, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_b4

    :cond_b2
    const-string p2, ""

    .line 3017
    :goto_b4
    const-string v0, "FragmentManager:"

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 3019
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "StartActivityForResult"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/_init_lambda4$AudioAttributesImplApi26Parcelizer;

    invoke-direct {v1}, Lo/_init_lambda4$AudioAttributesImplApi26Parcelizer;-><init>()V

    new-instance v2, Landroidx/fragment/app/FragmentManager$7;

    invoke-direct {v2, p0}, Landroidx/fragment/app/FragmentManager$7;-><init>(Landroidx/fragment/app/FragmentManager;)V

    invoke-virtual {p1, v0, v1, v2}, Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;->read(Ljava/lang/String;Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSetCaptioningEnabled:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    .line 3046
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "StartIntentSenderForResult"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/FragmentManager$RemoteActionCompatParcelizer;

    invoke-direct {v1}, Landroidx/fragment/app/FragmentManager$RemoteActionCompatParcelizer;-><init>()V

    new-instance v2, Landroidx/fragment/app/FragmentManager$6;

    invoke-direct {v2, p0}, Landroidx/fragment/app/FragmentManager$6;-><init>(Landroidx/fragment/app/FragmentManager;)V

    invoke-virtual {p1, v0, v1, v2}, Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;->read(Ljava/lang/String;Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToNext:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    .line 3073
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "RequestPermissions"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lo/_init_lambda4$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Lo/_init_lambda4$RemoteActionCompatParcelizer;-><init>()V

    new-instance v1, Landroidx/fragment/app/FragmentManager$3;

    invoke-direct {v1, p0}, Landroidx/fragment/app/FragmentManager$3;-><init>(Landroidx/fragment/app/FragmentManager;)V

    invoke-virtual {p1, p2, v0, v1}, Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;->read(Ljava/lang/String;Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/FragmentManager;->onSetRating:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    .line 3108
    :cond_121
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of p2, p1, Lo/_isPosInf;

    if-eqz p2, :cond_12e

    .line 3109
    check-cast p1, Lo/_isPosInf;

    .line 3111
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromSearch:Lo/wrapAsJsonMappingException;

    invoke-interface {p1, p2}, Lo/_isPosInf;->addOnConfigurationChangedListener(Lo/wrapAsJsonMappingException;)V

    .line 3115
    :cond_12e
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of p2, p1, Lo/_isTrue;

    if-eqz p2, :cond_13b

    .line 3116
    check-cast p1, Lo/_isTrue;

    .line 3117
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromUri:Lo/wrapAsJsonMappingException;

    invoke-interface {p1, p2}, Lo/_isTrue;->addOnTrimMemoryListener(Lo/wrapAsJsonMappingException;)V

    .line 3120
    :cond_13b
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of p2, p1, Lo/_findCoercionFromBlankString;

    if-eqz p2, :cond_148

    .line 3121
    check-cast p1, Lo/_findCoercionFromBlankString;

    .line 3123
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItemAt:Lo/wrapAsJsonMappingException;

    invoke-interface {p1, p2}, Lo/_findCoercionFromBlankString;->addOnMultiWindowModeChangedListener(Lo/wrapAsJsonMappingException;)V

    .line 3127
    :cond_148
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of p2, p1, Lo/_findCoercionFromEmptyArray;

    if-eqz p2, :cond_155

    .line 3128
    check-cast p1, Lo/_findCoercionFromEmptyArray;

    .line 3130
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItem:Lo/wrapAsJsonMappingException;

    invoke-interface {p1, p2}, Lo/_findCoercionFromEmptyArray;->addOnPictureInPictureModeChangedListener(Lo/wrapAsJsonMappingException;)V

    .line 3134
    :cond_155
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of p2, p1, Lo/UntypedObjectDeserializerNR;

    if-eqz p2, :cond_164

    if-nez p3, :cond_164

    .line 3135
    check-cast p1, Lo/UntypedObjectDeserializerNR;

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPause:Lo/UntypedObjectDeserializerNRScope;

    invoke-interface {p1, p0}, Lo/UntypedObjectDeserializerNR;->addMenuProvider(Lo/UntypedObjectDeserializerNRScope;)V

    :cond_164
    return-void

    .line 2950
    :cond_165
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Already attached"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method final AudioAttributesCompatParcelizer(I)Z
    .registers 2

    .line 1650
    iget p0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    if-lez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method final AudioAttributesCompatParcelizer(Landroid/view/Menu;)Z
    .registers 6

    .line 3433
    iget v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    const/4 v1, 0x0

    if-gtz v0, :cond_6

    return v1

    .line 3437
    :cond_6
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v0}, Lo/_property;->read()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_10

    .line 3439
    invoke-virtual {p0, v2}, Landroidx/fragment/app/FragmentManager;->RatingCompat(Landroidx/fragment/app/Fragment;)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v2, p1}, Landroidx/fragment/app/Fragment;->performPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v2

    if-eqz v2, :cond_10

    const/4 v1, 0x1

    goto :goto_10

    :cond_2c
    return v1
.end method

.method final AudioAttributesCompatParcelizer(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .registers 9

    .line 3401
    iget v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    const/4 v1, 0x0

    if-gtz v0, :cond_6

    return v1

    .line 3406
    :cond_6
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v0}, Lo/_property;->read()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v1

    :cond_12
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_38

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/Fragment;

    if-eqz v4, :cond_12

    .line 3408
    invoke-virtual {p0, v4}, Landroidx/fragment/app/FragmentManager;->RatingCompat(Landroidx/fragment/app/Fragment;)Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-virtual {v4, p1, p2}, Landroidx/fragment/app/Fragment;->performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v5

    if-eqz v5, :cond_12

    if-nez v2, :cond_33

    .line 3411
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3413
    :cond_33
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x1

    goto :goto_12

    .line 3418
    :cond_38
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    if-eqz p1, :cond_5a

    .line 3419
    :goto_3c
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-ge v1, p1, :cond_5a

    .line 3420
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_54

    .line 3421
    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_57

    .line 3422
    :cond_54
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->onDestroyOptionsMenu()V

    :cond_57
    add-int/lit8 v1, v1, 0x1

    goto :goto_3c

    .line 3427
    :cond_5a
    iput-object v2, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    return v3
.end method

.method final AudioAttributesCompatParcelizer(Landroid/view/MenuItem;)Z
    .registers 4

    .line 3448
    iget v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    const/4 v1, 0x0

    if-gtz v0, :cond_6

    return v1

    .line 3451
    :cond_6
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->read()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_10

    .line 3453
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_26
    return v1
.end method

.method public final AudioAttributesImplApi21Parcelizer()V
    .registers 2

    const/4 v0, 0x5

    .line 3255
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer(Landroidx/fragment/app/Fragment;)V
    .registers 3

    .line 3699
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    if-eqz v0, :cond_d

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->onFastForward(Landroidx/fragment/app/Fragment;)Z

    move-result p1

    if-eqz p1, :cond_d

    const/4 p1, 0x1

    .line 3700
    iput-boolean p1, p0, Landroidx/fragment/app/FragmentManager;->onPlay:Z

    :cond_d
    return-void
.end method

.method final AudioAttributesImplApi26Parcelizer()V
    .registers 2

    const/4 v0, 0x1

    .line 3265
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    return-void
.end method

.method final AudioAttributesImplApi26Parcelizer(Landroidx/fragment/app/Fragment;)Z
    .registers 2

    if-nez p1, :cond_4

    const/4 p0, 0x0

    return p0

    .line 854
    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isHidden()Z

    move-result p0

    return p0
.end method

.method public final AudioAttributesImplBaseParcelizer()V
    .registers 3

    .line 3671
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->AudioAttributesCompatParcelizer()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_a
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_a

    .line 3673
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isHidden()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    .line 3674
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplBaseParcelizer()V

    goto :goto_a

    :cond_25
    return-void
.end method

.method public final AudioAttributesImplBaseParcelizer(Landroidx/fragment/app/Fragment;)V
    .registers 4

    const/4 v0, 0x2

    .line 1766
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1767
    :cond_a
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mHidden:Z

    if-nez v0, :cond_19

    const/4 v0, 0x1

    .line 1768
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 1771
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 1772
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager;->onPlay(Landroidx/fragment/app/Fragment;)V

    :cond_19
    return-void
.end method

.method public final IconCompatParcelizer(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .registers 7

    .line 1275
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 1279
    :cond_8
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_2c

    .line 1281
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment no longer exists for key "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": unique id "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/lang/RuntimeException;)V

    :cond_2c
    return-object v0
.end method

.method public final IconCompatParcelizer()Lo/_doAddInjectable;
    .registers 2

    .line 753
    new-instance v0, Lo/_refinePropertyInclusion;

    invoke-direct {v0, p0}, Lo/_refinePropertyInclusion;-><init>(Landroidx/fragment/app/FragmentManager;)V

    return-object v0
.end method

.method public final IconCompatParcelizer(Landroid/os/Bundle;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V
    .registers 7

    .line 1257
    iget-object v0, p3, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eq v0, p0, :cond_1f

    .line 1258
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not currently in the FragmentManager"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/lang/RuntimeException;)V

    .line 1261
    :cond_1f
    iget-object p0, p3, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {p1, p2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/fragment/app/Fragment;)V
    .registers 4

    const/4 v0, 0x2

    .line 1808
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1809
    :cond_a
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    if-eqz v1, :cond_2c

    const/4 v1, 0x0

    .line 1810
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 1811
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    if-nez v1, :cond_2c

    .line 1812
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v1, p1}, Lo/_property;->IconCompatParcelizer(Landroidx/fragment/app/Fragment;)V

    .line 1813
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1814
    :cond_23
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->onFastForward(Landroidx/fragment/app/Fragment;)Z

    move-result p1

    if-eqz p1, :cond_2c

    const/4 p1, 0x1

    .line 1815
    iput-boolean p1, p0, Landroidx/fragment/app/FragmentManager;->onPlay:Z

    :cond_2c
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/fragment/app/Fragment;Lo/anyIgnorals$write;)V
    .registers 5

    .line 3528
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_14

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-ne v0, p0, :cond_17

    .line 3533
    :cond_14
    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mMaxState:Lo/anyIgnorals$write;

    return-void

    .line 3530
    :cond_17
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final IconCompatParcelizer(Landroidx/fragment/app/FragmentManager$IconCompatParcelizer;)V
    .registers 2

    .line 3633
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromMediaId:Lo/getGeneratorType;

    invoke-virtual {p0, p1}, Lo/getGeneratorType;->write(Landroidx/fragment/app/FragmentManager$IconCompatParcelizer;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/fragment/app/FragmentManager$read;)V
    .registers 2

    .line 1154
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final IconCompatParcelizer(Ljava/lang/String;)V
    .registers 2

    .line 1236
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSetShuffleMode:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;

    if-eqz p0, :cond_d

    .line 1238
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->read()V

    :cond_d
    const/4 p0, 0x2

    .line 1240
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    return-void
.end method

.method public final IconCompatParcelizer(Ljava/lang/String;Lo/hasGetter;Lo/_addFields;)V
    .registers 6

    .line 1194
    invoke-interface {p2}, Lo/hasGetter;->getLifecycle()Lo/anyIgnorals;

    move-result-object p2

    .line 1195
    invoke-virtual {p2}, Lo/anyIgnorals;->read()Lo/anyIgnorals$write;

    move-result-object v0

    sget-object v1, Lo/anyIgnorals$write;->AudioAttributesCompatParcelizer:Lo/anyIgnorals$write;

    if-ne v0, v1, :cond_d

    return-void

    .line 1199
    :cond_d
    new-instance v0, Landroidx/fragment/app/FragmentManager$9;

    invoke-direct {v0, p0, p1, p3, p2}, Landroidx/fragment/app/FragmentManager$9;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lo/_addFields;Lo/anyIgnorals;)V

    .line 1220
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSetShuffleMode:Ljava/util/Map;

    new-instance v1, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;

    invoke-direct {v1, p2, p3, v0}, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;-><init>(Lo/anyIgnorals;Lo/_addFields;Lo/findAccess;)V

    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;

    if-eqz p0, :cond_24

    .line 1223
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->read()V

    :cond_24
    const/4 p0, 0x2

    .line 1225
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result p0

    if-eqz p0, :cond_31

    .line 1226
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1231
    :cond_31
    invoke-virtual {p2, v0}, Lo/anyIgnorals;->IconCompatParcelizer(Lo/findExplicitNames;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/view/MenuItem;)Z
    .registers 4

    .line 3462
    iget v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    const/4 v1, 0x0

    if-gtz v0, :cond_6

    return v1

    .line 3465
    :cond_6
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->read()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_10

    .line 3467
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_26
    return v1
.end method

.method final IconCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            "II)Z"
        }
    .end annotation

    const/4 v0, 0x1

    and-int/2addr p5, v0

    const/4 v1, 0x0

    if-eqz p5, :cond_7

    move p5, v0

    goto :goto_8

    :cond_7
    move p5, v1

    .line 2588
    :goto_8
    invoke-direct {p0, p3, p4, p5}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Ljava/lang/String;IZ)I

    move-result p3

    if-gez p3, :cond_f

    return v1

    .line 2592
    :cond_f
    iget-object p4, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/AbstractCollection;->size()I

    move-result p4

    sub-int/2addr p4, v0

    :goto_16
    if-lt p4, p3, :cond_2b

    .line 2593
    iget-object p5, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {p5, p4}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lo/_refinePropertyInclusion;

    invoke-virtual {p1, p5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 2594
    sget-object p5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 p4, p4, -0x1

    goto :goto_16

    :cond_2b
    return v0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()V
    .registers 3

    const/4 v0, 0x1

    .line 3269
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->RatingCompat:Z

    .line 3270
    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Z)Z

    .line 3271
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSkipToNext()V

    .line 3272
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetRepeatMode()V

    const/4 v0, -0x1

    .line 3273
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    .line 3274
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v1, v0, Lo/_isTrue;

    if-eqz v1, :cond_1d

    .line 3275
    check-cast v0, Lo/_isTrue;

    .line 3276
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromUri:Lo/wrapAsJsonMappingException;

    invoke-interface {v0, v1}, Lo/_isTrue;->removeOnTrimMemoryListener(Lo/wrapAsJsonMappingException;)V

    .line 3278
    :cond_1d
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v1, v0, Lo/_isPosInf;

    if-eqz v1, :cond_2a

    .line 3279
    check-cast v0, Lo/_isPosInf;

    .line 3281
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromSearch:Lo/wrapAsJsonMappingException;

    invoke-interface {v0, v1}, Lo/_isPosInf;->removeOnConfigurationChangedListener(Lo/wrapAsJsonMappingException;)V

    .line 3284
    :cond_2a
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v1, v0, Lo/_findCoercionFromBlankString;

    if-eqz v1, :cond_37

    .line 3285
    check-cast v0, Lo/_findCoercionFromBlankString;

    .line 3287
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItemAt:Lo/wrapAsJsonMappingException;

    invoke-interface {v0, v1}, Lo/_findCoercionFromBlankString;->removeOnMultiWindowModeChangedListener(Lo/wrapAsJsonMappingException;)V

    .line 3290
    :cond_37
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v1, v0, Lo/_findCoercionFromEmptyArray;

    if-eqz v1, :cond_44

    .line 3291
    check-cast v0, Lo/_findCoercionFromEmptyArray;

    .line 3293
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItem:Lo/wrapAsJsonMappingException;

    invoke-interface {v0, v1}, Lo/_findCoercionFromEmptyArray;->removeOnPictureInPictureModeChangedListener(Lo/wrapAsJsonMappingException;)V

    .line 3296
    :cond_44
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    instance-of v1, v0, Lo/UntypedObjectDeserializerNR;

    if-eqz v1, :cond_55

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    if-nez v1, :cond_55

    .line 3297
    check-cast v0, Lo/UntypedObjectDeserializerNR;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPause:Lo/UntypedObjectDeserializerNRScope;

    invoke-interface {v0, v1}, Lo/UntypedObjectDeserializerNR;->removeMenuProvider(Lo/UntypedObjectDeserializerNRScope;)V

    :cond_55
    const/4 v0, 0x0

    .line 3299
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    .line 3300
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatCustomActionResultReceiver:Lo/getAlwaysAsId;

    .line 3301
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    .line 3302
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromMediaId:Lo/onSetRating;

    if-eqz v1, :cond_67

    .line 3305
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromUri:Lo/onRemoveQueueItemAt;

    invoke-virtual {v1}, Lo/onRemoveQueueItemAt;->remove()V

    .line 3306
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromMediaId:Lo/onSetRating;

    .line 3308
    :cond_67
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSetCaptioningEnabled:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    if-eqz v0, :cond_78

    .line 3309
    invoke-virtual {v0}, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;->RemoteActionCompatParcelizer()V

    .line 3310
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToNext:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    invoke-virtual {v0}, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;->RemoteActionCompatParcelizer()V

    .line 3311
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSetRating:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    invoke-virtual {p0}, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;->RemoteActionCompatParcelizer()V

    :cond_78
    return-void
.end method

.method final MediaBrowserCompatCustomActionResultReceiver(Landroidx/fragment/app/Fragment;)V
    .registers 3

    .line 3654
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPrepare:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/_addInjectables;

    .line 3655
    invoke-interface {v0, p1}, Lo/_addInjectables;->read(Landroidx/fragment/app/Fragment;)V

    goto :goto_6

    :cond_16
    return-void
.end method

.method final MediaBrowserCompatItemReceiver(Landroidx/fragment/app/Fragment;)Lo/hasMixIns;
    .registers 2

    .line 1423
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {p0, p1}, Lo/_addMethods;->RemoteActionCompatParcelizer(Landroidx/fragment/app/Fragment;)Lo/hasMixIns;

    move-result-object p0

    return-object p0
.end method

.method public final MediaBrowserCompatItemReceiver()V
    .registers 3

    const/4 v0, 0x0

    .line 3223
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->setSessionImpl:Z

    .line 3224
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem:Z

    .line 3225
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v1, v0}, Lo/_addMethods;->read(Z)V

    const/4 v0, 0x1

    .line 3226
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    return-void
.end method

.method final MediaBrowserCompatMediaItem()V
    .registers 2

    const/4 v0, 0x2

    .line 3230
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    return-void
.end method

.method final MediaBrowserCompatMediaItem(Landroidx/fragment/app/Fragment;)Z
    .registers 5

    const/4 v0, 0x1

    if-nez p1, :cond_4

    return v0

    .line 823
    :cond_4
    iget-object v1, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 825
    invoke-direct {v1}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatToken()Landroidx/fragment/app/Fragment;

    move-result-object v2

    .line 829
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    iget-object p1, v1, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    .line 830
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem(Landroidx/fragment/app/Fragment;)Z

    move-result p0

    if-eqz p0, :cond_19

    return v0

    :cond_19
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()V
    .registers 3

    const/4 v0, 0x1

    .line 3259
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem:Z

    .line 3260
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v1, v0}, Lo/_addMethods;->read(Z)V

    const/4 v0, 0x4

    .line 3261
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    return-void
.end method

.method public final MediaBrowserCompatSearchResultReceiver(Landroidx/fragment/app/Fragment;)V
    .registers 4

    const/4 v0, 0x2

    .line 1746
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1747
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget v0, p1, Landroidx/fragment/app/Fragment;->mBackStackNesting:I

    .line 1749
    :cond_c
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isInBackStack()Z

    move-result v0

    .line 1750
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    if-eqz v1, :cond_17

    if-eqz v0, :cond_17

    return-void

    .line 1751
    :cond_17
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v0, p1}, Lo/_property;->write(Landroidx/fragment/app/Fragment;)V

    .line 1752
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->onFastForward(Landroidx/fragment/app/Fragment;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_25

    .line 1753
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentManager;->onPlay:Z

    .line 1755
    :cond_25
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 1756
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager;->onPlay(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z
    .registers 2

    const/4 v0, 0x1

    .line 779
    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Z)Z

    move-result v0

    .line 780
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem()V

    return v0
.end method

.method public final MediaDescriptionCompat()V
    .registers 3

    const/4 v0, 0x0

    .line 3248
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->setSessionImpl:Z

    .line 3249
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem:Z

    .line 3250
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v1, v0}, Lo/_addMethods;->read(Z)V

    const/4 v0, 0x7

    .line 3251
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    return-void
.end method

.method final MediaDescriptionCompat(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 1436
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {p0, p1}, Lo/_addMethods;->write(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public final MediaMetadataCompat(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment$SavedState;
    .registers 6

    .line 1483
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    iget-object v1, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/_property;->IconCompatParcelizer(Ljava/lang/String;)Lo/_addSetterMethod;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 1485
    invoke-virtual {v0}, Lo/_addSetterMethod;->IconCompatParcelizer()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    .line 1486
    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not currently in the FragmentManager"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/lang/RuntimeException;)V

    .line 1489
    :cond_2f
    invoke-virtual {v0}, Lo/_addSetterMethod;->AudioAttributesCompatParcelizer()Landroidx/fragment/app/Fragment$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final MediaMetadataCompat()V
    .registers 3

    const/4 v0, 0x0

    .line 3241
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->setSessionImpl:Z

    .line 3242
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem:Z

    .line 3243
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v1, v0}, Lo/_addMethods;->read(Z)V

    const/4 v0, 0x5

    .line 3244
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    return-void
.end method

.method final RatingCompat()V
    .registers 2

    .line 3505
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatQueueItem()V

    .line 3507
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->onCommand(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method final RatingCompat(Landroidx/fragment/app/Fragment;)Z
    .registers 2

    if-nez p1, :cond_4

    const/4 p0, 0x1

    return p0

    .line 842
    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isMenuVisible()Z

    move-result p0

    return p0
.end method

.method final RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .registers 2

    .line 1857
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0, p1}, Lo/_property;->write(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method final RemoteActionCompatParcelizer()V
    .registers 4

    const/4 v0, 0x3

    .line 1059
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1060
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1062
    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    if-eqz v0, :cond_32

    const/4 v1, 0x0

    .line 1063
    iput-boolean v1, v0, Lo/_refinePropertyInclusion;->read:Z

    .line 1064
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-virtual {v0}, Lo/_refinePropertyInclusion;->AudioAttributesCompatParcelizer()V

    .line 1065
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    new-instance v2, Lo/_addCreators;

    invoke-direct {v2, p0}, Lo/_addCreators;-><init>(Landroidx/fragment/app/FragmentManager;)V

    invoke-virtual {v0, v2}, Lo/_refinePropertyInclusion;->read(Ljava/lang/Runnable;)Lo/_doAddInjectable;

    .line 1070
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-virtual {v0}, Lo/_doAddInjectable;->write()I

    const/4 v0, 0x1

    .line 1071
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onAddQueueItem:Z

    .line 1072
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    .line 1073
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentManager;->onAddQueueItem:Z

    const/4 v0, 0x0

    .line 1074
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    :cond_32
    return-void
.end method

.method public final synthetic RemoteActionCompatParcelizer(Landroid/content/res/Configuration;)V
    .registers 3

    .line 606
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onStop()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    .line 607
    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/FragmentManager;->write(Landroid/content/res/Configuration;Z)V

    :cond_a
    return-void
.end method

.method final RemoteActionCompatParcelizer(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 1432
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {p0, p1}, Lo/_addMethods;->read(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/fragment/app/Fragment;Z)V
    .registers 3

    .line 1658
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;

    move-result-object p0

    if-eqz p0, :cond_11

    .line 1660
    instance-of p1, p0, Landroidx/fragment/app/FragmentContainerView;

    if-eqz p1, :cond_11

    .line 1661
    check-cast p0, Landroidx/fragment/app/FragmentContainerView;

    xor-int/lit8 p1, p2, 0x1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    :cond_11
    return-void
.end method

.method public final synthetic RemoteActionCompatParcelizer(Ljava/lang/Integer;)V
    .registers 3

    .line 611
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onStop()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    const/16 v0, 0x50

    if-ne p1, v0, :cond_12

    const/4 p1, 0x0

    .line 612
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager;->read(Z)V

    :cond_12
    return-void
.end method

.method public final RemoteActionCompatParcelizer(I)Z
    .registers 3

    if-ltz p1, :cond_8

    const/4 v0, 0x1

    .line 1088
    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(II)Z

    move-result p0

    return p0

    .line 1086
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bad id: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final RemoteActionCompatParcelizer(Z)Z
    .registers 5

    .line 2027
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Z)V

    .line 2033
    iget-boolean p1, p0, Landroidx/fragment/app/FragmentManager;->onAddQueueItem:Z

    const/4 v0, 0x0

    if-nez p1, :cond_50

    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    if-eqz p1, :cond_50

    .line 2034
    iput-boolean v0, p1, Lo/_refinePropertyInclusion;->read:Z

    .line 2035
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-virtual {p1}, Lo/_refinePropertyInclusion;->AudioAttributesCompatParcelizer()V

    const/4 p1, 0x3

    .line 2036
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result p1

    if-eqz p1, :cond_24

    .line 2037
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2040
    :cond_24
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-virtual {p1, v0, v0}, Lo/_refinePropertyInclusion;->AudioAttributesCompatParcelizer(ZZ)I

    .line 2041
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-virtual {p1, v0, v1}, Ljava/util/AbstractList;->add(ILjava/lang/Object;)V

    .line 2042
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    iget-object p1, p1, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_38
    :goto_38
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/_doAddInjectable$write;

    .line 2043
    iget-object v2, v1, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_38

    .line 2044
    iget-object v1, v1, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iput-boolean v0, v1, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    goto :goto_38

    :cond_4d
    const/4 p1, 0x0

    .line 2047
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    .line 2049
    :cond_50
    :goto_50
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_6d

    const/4 v0, 0x1

    .line 2050
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat:Z

    .line 2052
    :try_start_5d
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v1}, Landroidx/fragment/app/FragmentManager;->write(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_64
    .catchall {:try_start_5d .. :try_end_64} :catchall_68

    .line 2054
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed()V

    goto :goto_50

    :catchall_68
    move-exception p1

    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed()V

    .line 2055
    throw p1

    .line 2059
    :cond_6d
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatQueueItem()V

    .line 2060
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->setSessionImpl()V

    .line 2061
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->IconCompatParcelizer()V

    return v0
.end method

.method public findFragmentById(I)Landroidx/fragment/app/Fragment;
    .registers 2

    .line 1831
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0, p1}, Lo/_property;->RemoteActionCompatParcelizer(I)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method public findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .registers 2

    .line 1848
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0, p1}, Lo/_property;->read(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method public final handleMediaPlayPauseIfPendingOnHandler()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    .line 1418
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->read()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final onAddQueueItem()Lo/getAlwaysAsId;
    .registers 1

    .line 2939
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatCustomActionResultReceiver:Lo/getAlwaysAsId;

    return-object p0
.end method

.method public final onCommand()Lo/NopAnnotationIntrospector1;
    .registers 2

    .line 3564
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_b

    .line 3569
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onCommand()Lo/NopAnnotationIntrospector1;

    move-result-object p0

    return-object p0

    .line 3571
    :cond_b
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onMediaButtonEvent:Lo/NopAnnotationIntrospector1;

    return-object p0
.end method

.method public final onCustomAction()I
    .registers 2

    .line 1132
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    goto :goto_d

    :cond_c
    const/4 p0, 0x0

    :goto_d
    add-int/2addr v0, p0

    return v0
.end method

.method public final onCustomAction(Landroidx/fragment/app/Fragment;)V
    .registers 5

    if-eqz p1, :cond_33

    .line 3487
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_33

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    if-ne v0, p0, :cond_17

    goto :goto_33

    .line 3489
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3492
    :cond_33
    :goto_33
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    .line 3493
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    .line 3494
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->onCommand(Landroidx/fragment/app/Fragment;)V

    .line 3495
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager;->onCommand(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public final onFastForward()Landroidx/fragment/app/Fragment;
    .registers 1

    .line 2934
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    return-object p0
.end method

.method public final onMediaButtonEvent()Landroid/view/LayoutInflater$Factory2;
    .registers 1

    .line 3737
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onFastForward:Lo/getResolverType;

    return-object p0
.end method

.method public final onPause()Lo/getAnySetterField;
    .registers 2

    .line 3597
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_b

    .line 3602
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onPause()Lo/getAnySetterField;

    move-result-object p0

    return-object p0

    .line 3604
    :cond_b
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->MediaMetadataCompat:Lo/getAnySetterField;

    return-object p0
.end method

.method public final onPlay()Lo/pessimisticallyValidateBounds;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/pessimisticallyValidateBounds<",
            "*>;"
        }
    .end annotation

    .line 2929
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    return-object p0
.end method

.method public final onPlayFromMediaId()Lo/getGeneratorType;
    .registers 1

    .line 3609
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromMediaId:Lo/getGeneratorType;

    return-object p0
.end method

.method public final onPlayFromSearch()Lo/getJsonValueAccessor$write;
    .registers 1

    .line 3743
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToPrevious:Lo/getJsonValueAccessor$write;

    return-object p0
.end method

.method final onPlayFromUri()V
    .registers 8

    const/4 v0, 0x1

    .line 863
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onAddQueueItem:Z

    .line 864
    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Z)Z

    const/4 v1, 0x0

    .line 865
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentManager;->onAddQueueItem:Z

    .line 866
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    const/4 v3, 0x3

    if-eqz v2, :cond_bb

    .line 867
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_44

    .line 869
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    .line 870
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Lo/_refinePropertyInclusion;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 872
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_27
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_44

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/FragmentManager$read;

    .line 874
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_37
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_27

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/Fragment;

    goto :goto_37

    .line 879
    :cond_44
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    iget-object v2, v2, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4c
    :goto_4c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/_doAddInjectable$write;

    .line 880
    iget-object v4, v4, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v4, :cond_4c

    .line 882
    iput-boolean v1, v4, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    goto :goto_4c

    .line 885
    :cond_5f
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    .line 886
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 885
    invoke-virtual {p0, v4, v1, v0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Ljava/util/ArrayList;II)Ljava/util/Set;

    move-result-object v0

    .line 888
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_72
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_82

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/_renameUsing;

    .line 889
    invoke-virtual {v1}, Lo/_renameUsing;->write()V

    goto :goto_72

    .line 891
    :cond_82
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    iget-object v0, v0, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8a
    :goto_8a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/_doAddInjectable$write;

    .line 892
    iget-object v1, v1, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_8a

    .line 894
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    if-nez v2, :cond_8a

    .line 896
    invoke-virtual {p0, v1}, Landroidx/fragment/app/FragmentManager;->read(Landroidx/fragment/app/Fragment;)Lo/_addSetterMethod;

    move-result-object v1

    .line 897
    invoke-virtual {v1}, Lo/_addSetterMethod;->RemoteActionCompatParcelizer()V

    goto :goto_8a

    :cond_a6
    const/4 v0, 0x0

    .line 901
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    .line 902
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatQueueItem()V

    .line 903
    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_ba

    .line 905
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromUri:Lo/onRemoveQueueItemAt;

    invoke-virtual {v0}, Lo/onRemoveQueueItemAt;->isEnabled()Z

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_ba
    return-void

    .line 909
    :cond_bb
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromUri:Lo/onRemoveQueueItemAt;

    invoke-virtual {v0}, Lo/onRemoveQueueItemAt;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_ca

    .line 910
    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    .line 914
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItemAt()Z

    return-void

    .line 916
    :cond_ca
    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    .line 925
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromMediaId:Lo/onSetRating;

    invoke-virtual {p0}, Lo/onSetRating;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final onPrepare()Z
    .registers 1

    .line 1516
    iget-boolean p0, p0, Landroidx/fragment/app/FragmentManager;->RatingCompat:Z

    return p0
.end method

.method public final synthetic onPrepareFromMediaId()Landroid/os/Bundle;
    .registers 1

    .line 3001
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onSetCaptioningEnabled()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public final onPrepareFromSearch()Z
    .registers 2

    .line 1882
    iget-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->setSessionImpl:Z

    if-nez v0, :cond_a

    iget-boolean p0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem:Z

    if-nez p0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    const/4 p0, 0x1

    return p0
.end method

.method public final onPrepareFromUri()V
    .registers 5

    .line 987
    new-instance v0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;II)V

    invoke-virtual {p0, v0, v3}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager$write;Z)V

    return-void
.end method

.method public final synthetic onRemoveQueueItem()V
    .registers 2

    .line 1066
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager$read;

    goto :goto_6

    :cond_13
    return-void
.end method

.method public final onRemoveQueueItemAt()Z
    .registers 3

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 998
    invoke-direct {p0, v0, v1}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(II)Z

    move-result p0

    return p0
.end method

.method final onRewind()V
    .registers 3

    .line 1055
    new-instance v0, Landroidx/fragment/app/FragmentManager$MediaBrowserCompatItemReceiver;

    invoke-direct {v0, p0}, Landroidx/fragment/app/FragmentManager$MediaBrowserCompatItemReceiver;-><init>(Landroidx/fragment/app/FragmentManager;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager$write;Z)V

    return-void
.end method

.method public final onSeekTo()V
    .registers 3

    .line 3143
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_2a

    const/4 v0, 0x0

    .line 3146
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->setSessionImpl:Z

    .line 3147
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem:Z

    .line 3148
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v1, v0}, Lo/_addMethods;->read(Z)V

    .line 3149
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->read()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_18
    :goto_18
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_18

    .line 3151
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->noteStateNotSaved()V

    goto :goto_18

    :cond_2a
    return-void
.end method

.method public final onSetCaptioningEnabled()Landroid/os/Bundle;
    .registers 11

    .line 2713
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2716
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem()V

    .line 2717
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSkipToNext()V

    const/4 v1, 0x1

    .line 2718
    invoke-virtual {p0, v1}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Z)Z

    .line 2720
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentManager;->setSessionImpl:Z

    .line 2721
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v2, v1}, Lo/_addMethods;->read(Z)V

    .line 2724
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v1}, Lo/_property;->AudioAttributesImplBaseParcelizer()Ljava/util/ArrayList;

    move-result-object v1

    .line 2727
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v2}, Lo/_property;->RemoteActionCompatParcelizer()Ljava/util/HashMap;

    move-result-object v2

    .line 2728
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_2d

    .line 2729
    invoke-static {v4}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    return-object v0

    .line 2734
    :cond_2d
    iget-object v3, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v3}, Lo/_property;->MediaBrowserCompatCustomActionResultReceiver()Ljava/util/ArrayList;

    move-result-object v3

    .line 2738
    iget-object v5, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-lez v5, :cond_61

    .line 2740
    new-array v6, v5, [Landroidx/fragment/app/BackStackRecordState;

    const/4 v7, 0x0

    :goto_3e
    if-ge v7, v5, :cond_62

    .line 2742
    new-instance v8, Landroidx/fragment/app/BackStackRecordState;

    iget-object v9, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v9, v7}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lo/_refinePropertyInclusion;

    invoke-direct {v8, v9}, Landroidx/fragment/app/BackStackRecordState;-><init>(Lo/_refinePropertyInclusion;)V

    aput-object v8, v6, v7

    .line 2743
    invoke-static {v4}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v8

    if-eqz v8, :cond_5e

    .line 2744
    iget-object v8, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    .line 2745
    invoke-virtual {v8, v7}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5e
    add-int/lit8 v7, v7, 0x1

    goto :goto_3e

    :cond_61
    const/4 v6, 0x0

    .line 2750
    :cond_62
    new-instance v4, Landroidx/fragment/app/FragmentManagerState;

    invoke-direct {v4}, Landroidx/fragment/app/FragmentManagerState;-><init>()V

    .line 2751
    iput-object v1, v4, Landroidx/fragment/app/FragmentManagerState;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    .line 2752
    iput-object v3, v4, Landroidx/fragment/app/FragmentManagerState;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    .line 2753
    iput-object v6, v4, Landroidx/fragment/app/FragmentManagerState;->read:[Landroidx/fragment/app/BackStackRecordState;

    .line 2754
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi21Parcelizer:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iput v1, v4, Landroidx/fragment/app/FragmentManagerState;->write:I

    .line 2755
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_7d

    .line 2756
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    iput-object v1, v4, Landroidx/fragment/app/FragmentManagerState;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 2758
    :cond_7d
    iget-object v1, v4, Landroidx/fragment/app/FragmentManagerState;->IconCompatParcelizer:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi26Parcelizer:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 2759
    iget-object v1, v4, Landroidx/fragment/app/FragmentManagerState;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi26Parcelizer:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 2760
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v4, Landroidx/fragment/app/FragmentManagerState;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    .line 2761
    const-string v1, "state"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 2763
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_ab
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_cd

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 2764
    const-string v4, "result_"

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_ab

    .line 2767
    :cond_cd
    invoke-virtual {v2}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_d5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2768
    const-string v3, "fragment_"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_d5

    :cond_f5
    return-object v0
.end method

.method final read(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .registers 2

    .line 1852
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0, p1}, Lo/_property;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method public final read(Landroidx/fragment/app/Fragment;)Lo/_addSetterMethod;
    .registers 5

    .line 1711
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    iget-object v1, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/_property;->IconCompatParcelizer(Ljava/lang/String;)Lo/_addSetterMethod;

    move-result-object v0

    if-eqz v0, :cond_b

    return-object v0

    .line 1715
    :cond_b
    new-instance v0, Lo/_addSetterMethod;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromMediaId:Lo/getGeneratorType;

    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-direct {v0, v1, v2, p1}, Lo/_addSetterMethod;-><init>(Lo/getGeneratorType;Lo/_property;Landroidx/fragment/app/Fragment;)V

    .line 1718
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p1}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo/_addSetterMethod;->IconCompatParcelizer(Ljava/lang/ClassLoader;)V

    .line 1720
    iget p0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    invoke-virtual {v0, p0}, Lo/_addSetterMethod;->IconCompatParcelizer(I)V

    return-object v0
.end method

.method public final read()V
    .registers 3

    const/4 v0, 0x0

    .line 3234
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->setSessionImpl:Z

    .line 3235
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem:Z

    .line 3236
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v1, v0}, Lo/_addMethods;->read(Z)V

    const/4 v0, 0x4

    .line 3237
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    return-void
.end method

.method final read(Landroid/os/Parcelable;)V
    .registers 14

    if-eqz p1, :cond_1f1

    .line 2797
    check-cast p1, Landroid/os/Bundle;

    .line 2800
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2801
    const-string v2, "result_"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 2802
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 2804
    iget-object v3, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v3}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v3, 0x7

    .line 2805
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 2806
    iget-object v3, p0, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed:Ljava/util/Map;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    .line 2812
    :cond_3e
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2813
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4b
    :goto_4b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2814
    const-string v3, "fragment_"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4b

    .line 2815
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_4b

    .line 2817
    iget-object v4, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v4}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/16 v4, 0x9

    .line 2818
    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 2819
    invoke-virtual {v0, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4b

    .line 2823
    :cond_7c
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v1, v0}, Lo/_property;->AudioAttributesCompatParcelizer(Ljava/util/HashMap;)V

    .line 2825
    const-string v0, "state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManagerState;

    if-nez p1, :cond_8d

    goto/16 :goto_1f1

    .line 2830
    :cond_8d
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v1}, Lo/_property;->AudioAttributesImplApi26Parcelizer()V

    .line 2831
    iget-object v1, p1, Landroidx/fragment/app/FragmentManagerState;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_98
    :goto_98
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_115

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2833
    iget-object v4, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, Lo/_property;->IconCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_98

    .line 2836
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/FragmentState;

    .line 2838
    iget-object v5, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    iget-object v4, v4, Landroidx/fragment/app/FragmentState;->MediaDescriptionCompat:Ljava/lang/String;

    invoke-virtual {v5, v4}, Lo/_addMethods;->write(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v4

    if-eqz v4, :cond_d1

    .line 2840
    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v5

    if-eqz v5, :cond_c7

    .line 2841
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2844
    :cond_c7
    new-instance v5, Lo/_addSetterMethod;

    iget-object v6, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromMediaId:Lo/getGeneratorType;

    iget-object v7, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-direct {v5, v6, v7, v4, v2}, Lo/_addSetterMethod;-><init>(Lo/getGeneratorType;Lo/_property;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    goto :goto_ea

    .line 2847
    :cond_d1
    iget-object v7, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromMediaId:Lo/getGeneratorType;

    iget-object v8, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    iget-object v4, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    .line 2848
    invoke-virtual {v4}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    .line 2849
    new-instance v5, Lo/_addSetterMethod;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onCommand()Lo/NopAnnotationIntrospector1;

    move-result-object v10

    move-object v6, v5

    move-object v11, v2

    invoke-direct/range {v6 .. v11}, Lo/_addSetterMethod;-><init>(Lo/getGeneratorType;Lo/_property;Ljava/lang/ClassLoader;Lo/NopAnnotationIntrospector1;Landroid/os/Bundle;)V

    .line 2851
    :goto_ea
    invoke-virtual {v5}, Lo/_addSetterMethod;->IconCompatParcelizer()Landroidx/fragment/app/Fragment;

    move-result-object v4

    .line 2852
    iput-object v2, v4, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    .line 2853
    iput-object p0, v4, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 2854
    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v2

    if-eqz v2, :cond_fd

    .line 2855
    iget-object v2, v4, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2857
    :cond_fd
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {v2}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v5, v2}, Lo/_addSetterMethod;->IconCompatParcelizer(Ljava/lang/ClassLoader;)V

    .line 2858
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v2, v5}, Lo/_property;->IconCompatParcelizer(Lo/_addSetterMethod;)V

    .line 2862
    iget v2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    invoke-virtual {v5, v2}, Lo/_addSetterMethod;->IconCompatParcelizer(I)V

    goto :goto_98

    .line 2868
    :cond_115
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v0}, Lo/_addMethods;->IconCompatParcelizer()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11f
    :goto_11f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_160

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 2869
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    iget-object v4, v1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lo/_property;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_11f

    .line 2870
    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v2

    if-eqz v2, :cond_143

    .line 2871
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object v2, p1, Landroidx/fragment/app/FragmentManagerState;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2874
    :cond_143
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v2, v1}, Lo/_addMethods;->write(Landroidx/fragment/app/Fragment;)V

    .line 2878
    iput-object p0, v1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 2879
    new-instance v2, Lo/_addSetterMethod;

    iget-object v4, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromMediaId:Lo/getGeneratorType;

    iget-object v5, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-direct {v2, v4, v5, v1}, Lo/_addSetterMethod;-><init>(Lo/getGeneratorType;Lo/_property;Landroidx/fragment/app/Fragment;)V

    const/4 v4, 0x1

    .line 2881
    invoke-virtual {v2, v4}, Lo/_addSetterMethod;->IconCompatParcelizer(I)V

    .line 2882
    invoke-virtual {v2}, Lo/_addSetterMethod;->RemoteActionCompatParcelizer()V

    .line 2883
    iput-boolean v4, v1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 2884
    invoke-virtual {v2}, Lo/_addSetterMethod;->RemoteActionCompatParcelizer()V

    goto :goto_11f

    .line 2889
    :cond_160
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    iget-object v1, p1, Landroidx/fragment/app/FragmentManagerState;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/_property;->write(Ljava/util/List;)V

    .line 2892
    iget-object v0, p1, Landroidx/fragment/app/FragmentManagerState;->read:[Landroidx/fragment/app/BackStackRecordState;

    const/4 v1, 0x0

    if-eqz v0, :cond_1ab

    .line 2893
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p1, Landroidx/fragment/app/FragmentManagerState;->read:[Landroidx/fragment/app/BackStackRecordState;

    array-length v2, v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    move v0, v1

    .line 2894
    :goto_177
    iget-object v2, p1, Landroidx/fragment/app/FragmentManagerState;->read:[Landroidx/fragment/app/BackStackRecordState;

    array-length v2, v2

    if-ge v0, v2, :cond_1b2

    .line 2895
    iget-object v2, p1, Landroidx/fragment/app/FragmentManagerState;->read:[Landroidx/fragment/app/BackStackRecordState;

    aget-object v2, v2, v0

    invoke-virtual {v2, p0}, Landroidx/fragment/app/BackStackRecordState;->IconCompatParcelizer(Landroidx/fragment/app/FragmentManager;)Lo/_refinePropertyInclusion;

    move-result-object v2

    .line 2896
    invoke-static {v3}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v4

    if-eqz v4, :cond_1a3

    .line 2897
    iget v4, v2, Lo/_refinePropertyInclusion;->write:I

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2899
    new-instance v4, Lo/_replaceCreatorProperty;

    const-string v5, "FragmentManager"

    invoke-direct {v4, v5}, Lo/_replaceCreatorProperty;-><init>(Ljava/lang/String;)V

    .line 2900
    new-instance v5, Ljava/io/PrintWriter;

    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 2901
    const-string v4, "  "

    invoke-virtual {v2, v4, v5, v1}, Lo/_refinePropertyInclusion;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 2902
    invoke-virtual {v5}, Ljava/io/Writer;->close()V

    .line 2904
    :cond_1a3
    iget-object v4, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_177

    .line 2907
    :cond_1ab
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    .line 2909
    :cond_1b2
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi21Parcelizer:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v2, p1, Landroidx/fragment/app/FragmentManagerState;->write:I

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 2911
    iget-object v0, p1, Landroidx/fragment/app/FragmentManagerState;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    if-eqz v0, :cond_1c8

    .line 2912
    iget-object v0, p1, Landroidx/fragment/app/FragmentManagerState;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    .line 2913
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->onCommand(Landroidx/fragment/app/Fragment;)V

    .line 2916
    :cond_1c8
    iget-object v0, p1, Landroidx/fragment/app/FragmentManagerState;->IconCompatParcelizer:Ljava/util/ArrayList;

    if-eqz v0, :cond_1e8

    .line 2918
    :goto_1cc
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_1e8

    .line 2919
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi26Parcelizer:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p1, Landroidx/fragment/app/FragmentManagerState;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/BackStackState;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1cc

    .line 2923
    :cond_1e8
    new-instance v0, Ljava/util/ArrayDeque;

    iget-object p1, p1, Landroidx/fragment/app/FragmentManagerState;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;

    :cond_1f1
    :goto_1f1
    return-void
.end method

.method public final read(Landroidx/fragment/app/FragmentManager$write;Z)V
    .registers 7

    if-eqz p2, :cond_b

    .line 1973
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->RatingCompat:Z

    if-eqz v0, :cond_b

    :cond_a
    return-void

    .line 1977
    :cond_b
    invoke-direct {p0, p2}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Z)V

    .line 1982
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    const/4 v0, 0x0

    if-eqz p2, :cond_59

    .line 1983
    iput-boolean v0, p2, Lo/_refinePropertyInclusion;->read:Z

    .line 1984
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-virtual {p2}, Lo/_refinePropertyInclusion;->AudioAttributesCompatParcelizer()V

    const/4 p2, 0x3

    .line 1985
    invoke-static {p2}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result p2

    if-eqz p2, :cond_29

    .line 1986
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1989
    :cond_29
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    invoke-virtual {p2, v0, v0}, Lo/_refinePropertyInclusion;->AudioAttributesCompatParcelizer(ZZ)I

    .line 1990
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat:Ljava/util/ArrayList;

    invoke-virtual {p2, v1, v2}, Lo/_refinePropertyInclusion;->read(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result p2

    .line 1991
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    iget-object v1, v1, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_40
    :goto_40
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_55

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_doAddInjectable$write;

    .line 1992
    iget-object v3, v2, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_40

    .line 1993
    iget-object v2, v2, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iput-boolean v0, v2, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    goto :goto_40

    :cond_55
    const/4 v0, 0x0

    .line 1996
    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    move v0, p2

    .line 1998
    :cond_59
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat:Ljava/util/ArrayList;

    invoke-interface {p1, p2, v1}, Landroidx/fragment/app/FragmentManager$write;->read(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result p1

    if-nez v0, :cond_65

    if-eqz p1, :cond_72

    :cond_65
    const/4 p1, 0x1

    .line 2000
    iput-boolean p1, p0, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat:Z

    .line 2002
    :try_start_68
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatResultReceiverWrapper:Ljava/util/ArrayList;

    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->PlaybackStateCompat:Ljava/util/ArrayList;

    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/FragmentManager;->write(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_6f
    .catchall {:try_start_68 .. :try_end_6f} :catchall_7e

    .line 2004
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed()V

    .line 2008
    :cond_72
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->MediaSessionCompatQueueItem()V

    .line 2009
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->setSessionImpl()V

    .line 2010
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->IconCompatParcelizer()V

    return-void

    :catchall_7e
    move-exception p1

    .line 2004
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed()V

    .line 2005
    throw p1
.end method

.method public final read(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 5

    .line 1168
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSetShuffleMode:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_16

    .line 1170
    sget-object v1, Lo/anyIgnorals$write;->RemoteActionCompatParcelizer:Lo/anyIgnorals$write;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->write(Lo/anyIgnorals$write;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 1171
    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1b

    .line 1174
    :cond_16
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSetPlaybackSpeed:Ljava/util/Map;

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1b
    const/4 p0, 0x2

    .line 1176
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result p0

    if-eqz p0, :cond_25

    .line 1177
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_25
    return-void
.end method

.method final read(Lo/_addSetterMethod;)V
    .registers 4

    .line 1637
    invoke-virtual {p1}, Lo/_addSetterMethod;->IconCompatParcelizer()Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 1638
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    if-eqz v1, :cond_16

    .line 1639
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentManager;->MediaDescriptionCompat:Z

    if-eqz v1, :cond_10

    const/4 p1, 0x1

    .line 1641
    iput-boolean p1, p0, Landroidx/fragment/app/FragmentManager;->onCustomAction:Z

    return-void

    :cond_10
    const/4 p0, 0x0

    .line 1644
    iput-boolean p0, v0, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 1645
    invoke-virtual {p1}, Lo/_addSetterMethod;->RemoteActionCompatParcelizer()V

    :cond_16
    return-void
.end method

.method final read(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x2

    .line 2601
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2602
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2607
    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    const/4 p0, 0x0

    return p0

    .line 2612
    :cond_16
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/_refinePropertyInclusion;

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    .line 2614
    iget-object v0, v0, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2c
    :goto_2c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_41

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/_doAddInjectable$write;

    .line 2615
    iget-object v3, v1, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_2c

    .line 2616
    iget-object v1, v1, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iput-boolean v2, v1, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    goto :goto_2c

    :cond_41
    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    .line 2619
    invoke-virtual/range {v3 .. v8}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    .line 1522
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1523
    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1524
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1525
    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1526
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_43

    .line 1527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 1528
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1529
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1530
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1531
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6b

    .line 1532
    :cond_43
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    if-eqz v1, :cond_66

    .line 1533
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 1534
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1535
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1536
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1537
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6b

    .line 1539
    :cond_66
    const-string p0, "null"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1541
    :goto_6b
    const-string p0, "}}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1542
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write(Landroidx/fragment/app/Fragment;)Lo/_addSetterMethod;
    .registers 5

    .line 1725
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mPreviousWho:Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 1726
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mPreviousWho:Ljava/lang/String;

    invoke-static {p1, v0}, Lo/getJsonValueAccessor;->RemoteActionCompatParcelizer(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    :cond_9
    const/4 v0, 0x2

    .line 1728
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1729
    :cond_13
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->read(Landroidx/fragment/app/Fragment;)Lo/_addSetterMethod;

    move-result-object v0

    .line 1730
    iput-object p0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 1731
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v1, v0}, Lo/_property;->IconCompatParcelizer(Lo/_addSetterMethod;)V

    .line 1732
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    if-nez v1, :cond_39

    .line 1733
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v1, p1}, Lo/_property;->IconCompatParcelizer(Landroidx/fragment/app/Fragment;)V

    const/4 v1, 0x0

    .line 1734
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 1735
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    if-nez v2, :cond_30

    .line 1736
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 1738
    :cond_30
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->onFastForward(Landroidx/fragment/app/Fragment;)Z

    move-result p1

    if-eqz p1, :cond_39

    const/4 p1, 0x1

    .line 1739
    iput-boolean p1, p0, Landroidx/fragment/app/FragmentManager;->onPlay:Z

    :cond_39
    return-object v0
.end method

.method final write()V
    .registers 3

    const/4 v0, 0x0

    .line 3216
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->setSessionImpl:Z

    .line 3217
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem:Z

    .line 3218
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onPrepareFromSearch:Lo/_addMethods;

    invoke-virtual {v1, v0}, Lo/_addMethods;->read(Z)V

    .line 3219
    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentManager;->read(I)V

    return-void
.end method

.method final write(Landroid/view/Menu;)V
    .registers 3

    .line 3476
    iget v0, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    if-gtz v0, :cond_5

    return-void

    .line 3479
    :cond_5
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {p0}, Lo/_property;->read()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_f
    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_f

    .line 3481
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->performOptionsMenuClosed(Landroid/view/Menu;)V

    goto :goto_f

    :cond_21
    return-void
.end method

.method final write(Landroidx/fragment/app/Fragment;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .registers 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v8, p8

    .line 3176
    iget-object v1, v0, Landroidx/fragment/app/FragmentManager;->onSkipToNext:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    if-eqz v1, :cond_61

    const/4 v1, 0x2

    if-eqz v8, :cond_2e

    if-nez p4, :cond_18

    .line 3179
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 3180
    const-string v3, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_19

    :cond_18
    move-object v2, p4

    .line 3182
    :goto_19
    invoke-static {v1}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v3

    if-eqz v3, :cond_28

    .line 3183
    invoke-static/range {p8 .. p8}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 3186
    :cond_28
    const-string v3, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {v2, v3, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    goto :goto_2f

    :cond_2e
    move-object v2, p4

    .line 3188
    :goto_2f
    new-instance v3, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;

    move-object v4, p2

    invoke-direct {v3, p2}, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;-><init>(Landroid/content/IntentSender;)V

    .line 3189
    invoke-virtual {v3, v2}, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/content/Intent;)Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;

    move-result-object v2

    move v5, p5

    move/from16 v6, p6

    .line 3190
    invoke-virtual {v2, v6, p5}, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer(II)Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()Landroidx/activity/result/IntentSenderRequest;

    move-result-object v2

    .line 3191
    new-instance v3, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    move-object v7, p1

    iget-object v4, v7, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    move v9, p3

    invoke-direct {v3, v4, p3}, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;-><init>(Ljava/lang/String;I)V

    .line 3192
    iget-object v4, v0, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;

    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 3193
    invoke-static {v1}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v1

    if-eqz v1, :cond_5b

    .line 3194
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 3196
    :cond_5b
    iget-object v0, v0, Landroidx/fragment/app/FragmentManager;->onSkipToNext:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    invoke-virtual {v0, v2}, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;->read(Ljava/lang/Object;)V

    return-void

    :cond_61
    move-object v7, p1

    move-object v4, p2

    move v9, p3

    move v5, p5

    move/from16 v6, p6

    .line 3198
    iget-object v0, v0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move/from16 v7, p7

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lo/pessimisticallyValidateBounds;->read(Landroidx/fragment/app/Fragment;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method

.method final write(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V
    .registers 5

    .line 3206
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onSetRating:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    if-eqz v0, :cond_16

    .line 3207
    new-instance v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    iget-object p1, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    invoke-direct {v0, p1, p3}, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;-><init>(Ljava/lang/String;I)V

    .line 3208
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 3209
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onSetRating:Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    invoke-virtual {p0, p2}, Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;->read(Ljava/lang/Object;)V

    return-void

    .line 3211
    :cond_16
    invoke-static {p1, p2}, Lo/pessimisticallyValidateBounds;->read(Landroidx/fragment/app/Fragment;[Ljava/lang/String;)V

    return-void
.end method

.method public final write(Landroidx/fragment/app/FragmentManager$IconCompatParcelizer;Z)V
    .registers 3

    .line 3622
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->onPlayFromMediaId:Lo/getGeneratorType;

    invoke-virtual {p0, p1, p2}, Lo/getGeneratorType;->read(Landroidx/fragment/app/FragmentManager$IconCompatParcelizer;Z)V

    return-void
.end method

.method public final write(Landroidx/fragment/app/FragmentManager$read;)V
    .registers 2

    .line 1162
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .registers 5

    .line 1015
    new-instance v0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, p0, p1, v1, v2}, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;II)V

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager$write;Z)V

    return-void
.end method

.method public final write(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .registers 9

    .line 1555
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1557
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onCommand:Lo/_property;

    invoke-virtual {v1, p1, p2, p3, p4}, Lo/_property;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 1560
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    const/4 p4, 0x0

    if-eqz p2, :cond_4e

    .line 1561
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    if-lez p2, :cond_4e

    .line 1563
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Fragments Created Menus:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v1, p4

    :goto_2a
    if-ge v1, p2, :cond_4e

    .line 1565
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 1566
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1567
    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1568
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 1569
    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1570
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2a

    .line 1575
    :cond_4e
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    if-lez p2, :cond_86

    .line 1577
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Back Stack:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v1, p4

    :goto_5f
    if-ge v1, p2, :cond_86

    .line 1579
    iget-object v2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_refinePropertyInclusion;

    .line 1580
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1581
    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1582
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 1583
    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1584
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1585
    invoke-virtual {v2, v0, p3}, Lo/_refinePropertyInclusion;->IconCompatParcelizer(Ljava/lang/String;Ljava/io/PrintWriter;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_5f

    .line 1589
    :cond_86
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1590
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Back Stack Index: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->AudioAttributesImplApi21Parcelizer:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1592
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    monitor-enter p2

    .line 1593
    :try_start_a3
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-lez v0, :cond_d3

    .line 1595
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Pending Actions:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_b3
    if-ge p4, v0, :cond_d3

    .line 1597
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager;->onRewind:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/FragmentManager$write;

    .line 1598
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1599
    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1600
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 1601
    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1602
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
    :try_end_d0
    .catchall {:try_start_a3 .. :try_end_d0} :catchall_144

    add-int/lit8 p4, p4, 0x1

    goto :goto_b3

    .line 1605
    :cond_d3
    monitor-exit p2

    .line 1607
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1608
    const-string p2, "FragmentManager misc state:"

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1609
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1610
    const-string p2, "  mHost="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1611
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->handleMediaPlayPauseIfPendingOnHandler:Lo/pessimisticallyValidateBounds;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1612
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1613
    const-string p2, "  mContainer="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1614
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatCustomActionResultReceiver:Lo/getAlwaysAsId;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1615
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_107

    .line 1616
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1617
    const-string p2, "  mParent="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1618
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager;->onSeekTo:Landroidx/fragment/app/Fragment;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1620
    :cond_107
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1621
    const-string p2, "  mCurState="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1622
    iget p2, p0, Landroidx/fragment/app/FragmentManager;->MediaBrowserCompatMediaItem:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 1623
    const-string p2, " mStateSaved="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1624
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentManager;->setSessionImpl:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1625
    const-string p2, " mStopped="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1626
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentManager;->onSkipToQueueItem:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1627
    const-string p2, " mDestroyed="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1628
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentManager;->RatingCompat:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 1629
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentManager;->onPlay:Z

    if-eqz p2, :cond_143

    .line 1630
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1631
    const-string p1, "  mNeedMenuInvalidate="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1632
    iget-boolean p0, p0, Landroidx/fragment/app/FragmentManager;->onPlay:Z

    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->println(Z)V

    :cond_143
    return-void

    :catchall_144
    move-exception p0

    .line 1605
    monitor-exit p2

    throw p0
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass1 (androidx.fragment.app.FragmentManager$1)
.class final Landroidx/fragment/app/FragmentManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getAnySetterField;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 668
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$1;->write:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;)Lo/_renameUsing;
    .registers 2

    .line 672
    new-instance p0, Lo/_constructStdTypeResolverBuilder;

    invoke-direct {p0, p1}, Lo/_constructStdTypeResolverBuilder;-><init>(Landroid/view/ViewGroup;)V

    return-object p0
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass10 (androidx.fragment.app.FragmentManager$10)
.class final Landroidx/fragment/app/FragmentManager$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/_addInjectables;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Lo/pessimisticallyValidateBounds;Lo/getAlwaysAsId;Landroidx/fragment/app/Fragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/fragment/app/Fragment;

.field final synthetic read:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2958
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$10;->read:Landroidx/fragment/app/FragmentManager;

    iput-object p2, p0, Landroidx/fragment/app/FragmentManager$10;->RemoteActionCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Landroidx/fragment/app/Fragment;)V
    .registers 2

    .line 2963
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$10;->RemoteActionCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onAttachFragment(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass2 (androidx.fragment.app.FragmentManager$2)
.class final Landroidx/fragment/app/FragmentManager$2;
.super Lo/onRemoveQueueItemAt;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 523
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/onRemoveQueueItemAt;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final handleOnBackCancelled()V
    .registers 2

    const/4 v0, 0x3

    .line 577
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 578
    sget-boolean v0, Landroidx/fragment/app/FragmentManager;->write:Z

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 583
    :cond_e
    sget-boolean v0, Landroidx/fragment/app/FragmentManager;->write:Z

    .line 584
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final handleOnBackPressed()V
    .registers 2

    const/4 v0, 0x3

    .line 566
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 567
    sget-boolean v0, Landroidx/fragment/app/FragmentManager;->write:Z

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 572
    :cond_e
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onPlayFromUri()V

    return-void
.end method

.method public final handleOnBackProgressed(Lo/AudioAttributesImplApi26Parcelizer;)V
    .registers 6

    const/4 v0, 0x2

    .line 541
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 542
    sget-boolean v0, Landroidx/fragment/app/FragmentManager;->write:Z

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 547
    :cond_e
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    iget-object v0, v0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    if-eqz v0, :cond_50

    .line 549
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    iget-object v1, v0, Landroidx/fragment/app/FragmentManager;->read:Lo/_refinePropertyInclusion;

    .line 552
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    const/4 v3, 0x1

    .line 550
    invoke-virtual {v0, v2, v1, v3}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Ljava/util/ArrayList;II)Ljava/util/Set;

    move-result-object v0

    .line 555
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/_renameUsing;

    .line 556
    invoke-virtual {v1, p1}, Lo/_renameUsing;->IconCompatParcelizer(Lo/AudioAttributesImplApi26Parcelizer;)V

    goto :goto_2b

    .line 558
    :cond_3b
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_43
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_50

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManager$read;

    goto :goto_43

    :cond_50
    return-void
.end method

.method public final handleOnBackStarted(Lo/AudioAttributesImplApi26Parcelizer;)V
    .registers 2

    const/4 p1, 0x3

    .line 527
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 528
    sget-boolean p1, Landroidx/fragment/app/FragmentManager;->write:Z

    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 533
    :cond_e
    sget-boolean p1, Landroidx/fragment/app/FragmentManager;->write:Z

    .line 534
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Landroidx/fragment/app/FragmentManager;)V

    .line 535
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$2;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onRewind()V

    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass3 (androidx.fragment.app.FragmentManager$3)
.class final Landroidx/fragment/app/FragmentManager$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Lo/pessimisticallyValidateBounds;Lo/getAlwaysAsId;Landroidx/fragment/app/Fragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic read:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 3075
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$3;->read:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private read(Ljava/util/Map;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 3078
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 3079
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 3080
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    new-array p1, p1, [I

    move v3, v1

    .line 3081
    :goto_1d
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-ge v3, v4, :cond_37

    .line 3082
    invoke-virtual {v2, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_31

    move v4, v1

    goto :goto_32

    :cond_31
    const/4 v4, -0x1

    .line 3084
    :goto_32
    aput v4, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1d

    .line 3086
    :cond_37
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager$3;->read:Landroidx/fragment/app/FragmentManager;

    iget-object v1, v1, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    if-nez v1, :cond_47

    .line 3088
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return-void

    .line 3091
    :cond_47
    iget-object v2, v1, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->read:Ljava/lang/String;

    .line 3092
    iget v1, v1, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->AudioAttributesCompatParcelizer:I

    .line 3093
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$3;->read:Landroidx/fragment/app/FragmentManager;

    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager;)Lo/_property;

    move-result-object p0

    invoke-virtual {p0, v2}, Lo/_property;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    if-nez p0, :cond_58

    return-void

    .line 3102
    :cond_58
    invoke-virtual {p0, v1, v0, p1}, Landroidx/fragment/app/Fragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method


# virtual methods
.method public final synthetic IconCompatParcelizer(Ljava/lang/Object;)V
    .registers 2

    .line 3075
    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager$3;->read(Ljava/util/Map;)V

    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass4 (androidx.fragment.app.FragmentManager$4)
.class final Landroidx/fragment/app/FragmentManager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/UntypedObjectDeserializerNRScope;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 628
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$4;->write:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/view/Menu;)V
    .registers 2

    .line 631
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$4;->write:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroid/view/Menu;)Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .registers 3

    .line 636
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$4;->write:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/MenuItem;)Z
    .registers 2

    .line 641
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$4;->write:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public final read(Landroid/view/Menu;)V
    .registers 2

    .line 646
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$4;->write:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->write(Landroid/view/Menu;)V

    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass5 (androidx.fragment.app.FragmentManager$5)
.class final Landroidx/fragment/app/FragmentManager$5;
.super Lo/NopAnnotationIntrospector1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 658
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$5;->read:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Lo/NopAnnotationIntrospector1;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .registers 3

    .line 663
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$5;->read:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->onPlay()Lo/pessimisticallyValidateBounds;

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$5;->read:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onPlay()Lo/pessimisticallyValidateBounds;

    move-result-object p0

    invoke-virtual {p0}, Lo/pessimisticallyValidateBounds;->AudioAttributesImplApi21Parcelizer()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, p2}, Lo/pessimisticallyValidateBounds;->write(Landroid/content/Context;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass6 (androidx.fragment.app.FragmentManager$6)
.class final Landroidx/fragment/app/FragmentManager$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Lo/pessimisticallyValidateBounds;Lo/getAlwaysAsId;Landroidx/fragment/app/Fragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<",
        "Landroidx/activity/result/ActivityResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic read:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 3049
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->read:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private IconCompatParcelizer(Landroidx/activity/result/ActivityResult;)V
    .registers 4

    .line 3052
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$6;->read:Landroidx/fragment/app/FragmentManager;

    iget-object v0, v0, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    if-nez v0, :cond_10

    .line 3054
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return-void

    .line 3057
    :cond_10
    iget-object v1, v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->read:Ljava/lang/String;

    .line 3058
    iget v0, v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->AudioAttributesCompatParcelizer:I

    .line 3059
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$6;->read:Landroidx/fragment/app/FragmentManager;

    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager;)Lo/_property;

    move-result-object p0

    invoke-virtual {p0, v1}, Lo/_property;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    if-nez p0, :cond_21

    return-void

    .line 3068
    :cond_21
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->read()I

    move-result v1

    .line 3069
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->IconCompatParcelizer()Landroid/content/Intent;

    move-result-object p1

    .line 3068
    invoke-virtual {p0, v0, v1, p1}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic IconCompatParcelizer(Ljava/lang/Object;)V
    .registers 2

    .line 3049
    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager$6;->IconCompatParcelizer(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass7 (androidx.fragment.app.FragmentManager$7)
.class final Landroidx/fragment/app/FragmentManager$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Lo/pessimisticallyValidateBounds;Lo/getAlwaysAsId;Landroidx/fragment/app/Fragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<",
        "Landroidx/activity/result/ActivityResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 3021
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$7;->RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private read(Landroidx/activity/result/ActivityResult;)V
    .registers 4

    .line 3024
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$7;->RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    iget-object v0, v0, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    if-nez v0, :cond_10

    .line 3026
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return-void

    .line 3029
    :cond_10
    iget-object v1, v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->read:Ljava/lang/String;

    .line 3030
    iget v0, v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->AudioAttributesCompatParcelizer:I

    .line 3031
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$7;->RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager;)Lo/_property;

    move-result-object p0

    invoke-virtual {p0, v1}, Lo/_property;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    if-nez p0, :cond_21

    return-void

    .line 3041
    :cond_21
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->read()I

    move-result v1

    .line 3042
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->IconCompatParcelizer()Landroid/content/Intent;

    move-result-object p1

    .line 3041
    invoke-virtual {p0, v0, v1, p1}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final synthetic IconCompatParcelizer(Ljava/lang/Object;)V
    .registers 2

    .line 3021
    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentManager$7;->read(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass8 (androidx.fragment.app.FragmentManager$8)
.class final Landroidx/fragment/app/FragmentManager$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 700
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$8;->RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 703
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$8;->RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Z)Z

    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.AnonymousClass9 (androidx.fragment.app.FragmentManager$9)
.class final Landroidx/fragment/app/FragmentManager$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/findAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/lang/String;Lo/hasGetter;Lo/_addFields;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Lo/_addFields;

.field final synthetic RemoteActionCompatParcelizer:Ljava/lang/String;

.field final synthetic read:Landroidx/fragment/app/FragmentManager;

.field final synthetic write:Lo/anyIgnorals;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lo/_addFields;Lo/anyIgnorals;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1199
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$9;->read:Landroidx/fragment/app/FragmentManager;

    iput-object p2, p0, Landroidx/fragment/app/FragmentManager$9;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iput-object p3, p0, Landroidx/fragment/app/FragmentManager$9;->IconCompatParcelizer:Lo/_addFields;

    iput-object p4, p0, Landroidx/fragment/app/FragmentManager$9;->write:Lo/anyIgnorals;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Lo/hasGetter;Lo/anyIgnorals$read;)V
    .registers 5

    .line 1203
    sget-object p1, Lo/anyIgnorals$read;->ON_START:Lo/anyIgnorals$read;

    if-ne p2, p1, :cond_22

    .line 1205
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$9;->read:Landroidx/fragment/app/FragmentManager;

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->read(Landroidx/fragment/app/FragmentManager;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$9;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    if-eqz p1, :cond_22

    .line 1208
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$9;->IconCompatParcelizer:Lo/_addFields;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager$9;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lo/_addFields;->AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1210
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$9;->read:Landroidx/fragment/app/FragmentManager;

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$9;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    .line 1214
    :cond_22
    sget-object p1, Lo/anyIgnorals$read;->ON_DESTROY:Lo/anyIgnorals$read;

    if-ne p2, p1, :cond_36

    .line 1215
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$9;->write:Lo/anyIgnorals;

    invoke-virtual {p1, p0}, Lo/anyIgnorals;->AudioAttributesCompatParcelizer(Lo/findExplicitNames;)V

    .line 1216
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$9;->read:Landroidx/fragment/app/FragmentManager;

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->write(Landroidx/fragment/app/FragmentManager;)Ljava/util/Map;

    move-result-object p1

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$9;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_36
    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.AudioAttributesCompatParcelizer (androidx.fragment.app.FragmentManager$AudioAttributesCompatParcelizer)
.class final Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/_addFields;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/anyIgnorals;

.field private final read:Lo/findAccess;

.field private final write:Lo/_addFields;


# direct methods
.method constructor <init>(Lo/anyIgnorals;Lo/_addFields;Lo/findAccess;)V
    .registers 4

    .line 328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 329
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lo/anyIgnorals;

    .line 330
    iput-object p2, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->write:Lo/_addFields;

    .line 331
    iput-object p3, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->read:Lo/findAccess;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    .line 340
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->write:Lo/_addFields;

    invoke-interface {p0, p1, p2}, Lo/_addFields;->AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final read()V
    .registers 2

    .line 344
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lo/anyIgnorals;

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->read:Lo/findAccess;

    invoke-virtual {v0, p0}, Lo/anyIgnorals;->AudioAttributesCompatParcelizer(Lo/findExplicitNames;)V

    return-void
.end method

.method public final write(Lo/anyIgnorals$write;)Z
    .registers 2

    .line 335
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lo/anyIgnorals;

    invoke-virtual {p0}, Lo/anyIgnorals;->read()Lo/anyIgnorals$write;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/anyIgnorals$write;->RemoteActionCompatParcelizer(Lo/anyIgnorals$write;)Z

    move-result p0

    return p0
.end method

###### Class androidx.fragment.app.FragmentManager.AudioAttributesImplApi26Parcelizer (androidx.fragment.app.FragmentManager$AudioAttributesImplApi26Parcelizer)
.class final Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/FragmentManager$write;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesImplApi26Parcelizer"
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field final RemoteActionCompatParcelizer:I

.field final synthetic read:Landroidx/fragment/app/FragmentManager;

.field final write:I


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;II)V
    .registers 5

    .line 3787
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->read:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3788
    iput-object p2, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 3789
    iput p3, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->write:I

    .line 3790
    iput p4, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public final read(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 3796
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->read:Landroidx/fragment/app/FragmentManager;

    iget-object v0, v0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1e

    iget v0, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->write:I

    if-gez v0, :cond_1e

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-nez v0, :cond_1e

    .line 3799
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->read:Landroidx/fragment/app/FragmentManager;

    iget-object v0, v0, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 3800
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItemAt()Z

    move-result v0

    if-eqz v0, :cond_1e

    const/4 p0, 0x0

    return p0

    .line 3806
    :cond_1e
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->read:Landroidx/fragment/app/FragmentManager;

    iget-object v3, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget v4, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->write:I

    iget v5, p0, Landroidx/fragment/app/FragmentManager$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:I

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p0

    return p0
.end method

###### Class androidx.fragment.app.FragmentManager.IconCompatParcelizer (androidx.fragment.app.FragmentManager$IconCompatParcelizer)
.class public abstract Landroidx/fragment/app/FragmentManager$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V
    .registers 3

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V
    .registers 3

    return-void
.end method

.method public read(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V
    .registers 3

    return-void
.end method

.method public write(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/view/View;)V
    .registers 4

    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.LaunchedFragmentInfo (androidx.fragment.app.FragmentManager$LaunchedFragmentInfo)
.class Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LaunchedFragmentInfo"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:I

.field read:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 3909
    new-instance v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo$2;

    invoke-direct {v0}, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo$2;-><init>()V

    sput-object v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 3893
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3894
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->read:Ljava/lang/String;

    .line 3895
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method constructor <init>(Ljava/lang/String;I)V
    .registers 3

    .line 3888
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3889
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->read:Ljava/lang/String;

    .line 3890
    iput p2, p0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->AudioAttributesCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 3905
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 3906
    iget p0, p0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.AnonymousClass2 (androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$2)
.class final Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 3910
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;
    .registers 2

    .line 3913
    new-instance v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    invoke-direct {v0, p0}, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static IconCompatParcelizer(I)[Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;
    .registers 1

    .line 3918
    new-array p0, p0, [Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 3910
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo$2;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 3910
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo$2;->IconCompatParcelizer(I)[Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.fragment.app.FragmentManager.MediaBrowserCompatItemReceiver (androidx.fragment.app.FragmentManager$MediaBrowserCompatItemReceiver)
.class final Landroidx/fragment/app/FragmentManager$MediaBrowserCompatItemReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/FragmentManager$write;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MediaBrowserCompatItemReceiver"
.end annotation


# instance fields
.field final synthetic write:Landroidx/fragment/app/FragmentManager;


# direct methods
.method constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 3855
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$MediaBrowserCompatItemReceiver;->write:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 3860
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$MediaBrowserCompatItemReceiver;->write:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/FragmentManager;->read(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v0

    .line 3862
    iget-object v1, p0, Landroidx/fragment/app/FragmentManager$MediaBrowserCompatItemReceiver;->write:Landroidx/fragment/app/FragmentManager;

    iget-object v1, v1, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_64

    .line 3863
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-lez v1, :cond_64

    .line 3864
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    .line 3865
    new-instance p2, Ljava/util/LinkedHashSet;

    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3867
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/_refinePropertyInclusion;

    .line 3868
    invoke-static {v1}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer(Lo/_refinePropertyInclusion;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_2b

    .line 3871
    :cond_3f
    iget-object p0, p0, Landroidx/fragment/app/FragmentManager$MediaBrowserCompatItemReceiver;->write:Landroidx/fragment/app/FragmentManager;

    iget-object p0, p0, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_47
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_64

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManager$read;

    .line 3873
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_57
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_47

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    goto :goto_57

    :cond_64
    return v0
.end method

###### Class androidx.fragment.app.FragmentManager.RemoteActionCompatParcelizer (androidx.fragment.app.FragmentManager$RemoteActionCompatParcelizer)
.class final Landroidx/fragment/app/FragmentManager$RemoteActionCompatParcelizer;
.super Lo/accessaddObserverForBackInvoker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/accessaddObserverForBackInvoker<",
        "Landroidx/activity/result/IntentSenderRequest;",
        "Landroidx/activity/result/ActivityResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 3923
    invoke-direct {p0}, Lo/accessaddObserverForBackInvoker;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroidx/activity/result/IntentSenderRequest;)Landroid/content/Intent;
    .registers 5

    .line 3929
    new-instance v0, Landroid/content/Intent;

    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 3930
    invoke-virtual {p0}, Landroidx/activity/result/IntentSenderRequest;->read()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_42

    .line 3932
    const-string v2, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_42

    .line 3934
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 3935
    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 3936
    const-string v2, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_42

    .line 3937
    new-instance v1, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroidx/activity/result/IntentSenderRequest;->IconCompatParcelizer()Landroid/content/IntentSender;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;-><init>(Landroid/content/IntentSender;)V

    const/4 v2, 0x0

    .line 3938
    invoke-virtual {v1, v2}, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/content/Intent;)Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;

    move-result-object v1

    .line 3939
    invoke-virtual {p0}, Landroidx/activity/result/IntentSenderRequest;->AudioAttributesCompatParcelizer()I

    move-result v2

    invoke-virtual {p0}, Landroidx/activity/result/IntentSenderRequest;->RemoteActionCompatParcelizer()I

    move-result p0

    invoke-virtual {v1, v2, p0}, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer(II)Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;

    move-result-object p0

    .line 3940
    invoke-virtual {p0}, Landroidx/activity/result/IntentSenderRequest$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()Landroidx/activity/result/IntentSenderRequest;

    move-result-object p0

    .line 3944
    :cond_42
    const-string v1, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p0, 0x2

    .line 3945
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result p0

    if-eqz p0, :cond_51

    .line 3946
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_51
    return-object v0
.end method

.method private static write(ILandroid/content/Intent;)Landroidx/activity/result/ActivityResult;
    .registers 3

    .line 3954
    new-instance v0, Landroidx/activity/result/ActivityResult;

    invoke-direct {v0, p0, p1}, Landroidx/activity/result/ActivityResult;-><init>(ILandroid/content/Intent;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic AudioAttributesCompatParcelizer(ILandroid/content/Intent;)Ljava/lang/Object;
    .registers 3

    .line 3923
    invoke-static {p1, p2}, Landroidx/fragment/app/FragmentManager$RemoteActionCompatParcelizer;->write(ILandroid/content/Intent;)Landroidx/activity/result/ActivityResult;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic write(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .registers 3

    .line 3923
    check-cast p2, Landroidx/activity/result/IntentSenderRequest;

    invoke-static {p2}, Landroidx/fragment/app/FragmentManager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/activity/result/IntentSenderRequest;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.fragment.app.FragmentManager.read (androidx.fragment.app.FragmentManager$read)
.class public interface abstract Landroidx/fragment/app/FragmentManager$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "read"
.end annotation


# virtual methods
.method public abstract write()V
.end method

###### Class androidx.fragment.app.FragmentManager.write (androidx.fragment.app.FragmentManager$write)
.class public interface abstract Landroidx/fragment/app/FragmentManager$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation


# virtual methods
.method public abstract read(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo/_refinePropertyInclusion;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation
.end method

###### Class kotlin.POJOPropertiesCollector (o.POJOPropertiesCollector)
.class public final synthetic Lo/POJOPropertiesCollector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wrapAsJsonMappingException;


# instance fields
.field public final synthetic RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/POJOPropertiesCollector;->RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/Object;)V
    .registers 2

    .line 0
    iget-object p0, p0, Lo/POJOPropertiesCollector;->RemoteActionCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    check-cast p1, Landroid/content/res/Configuration;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Landroid/content/res/Configuration;)V

    return-void
.end method

###### Class kotlin._addCreatorParam (o._addCreatorParam)
.class public final synthetic Lo/_addCreatorParam;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wrapAsJsonMappingException;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_addCreatorParam;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/Object;)V
    .registers 2

    .line 0
    iget-object p0, p0, Lo/_addCreatorParam;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/lang/Integer;)V

    return-void
.end method

###### Class kotlin._addCreators (o._addCreators)
.class public final synthetic Lo/_addCreators;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_addCreators;->IconCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/_addCreators;->IconCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onRemoveQueueItem()V

    return-void
.end method

###### Class kotlin._anyIndexed (o._anyIndexed)
.class public final synthetic Lo/_anyIndexed;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wrapAsJsonMappingException;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_anyIndexed;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/Object;)V
    .registers 2

    .line 0
    iget-object p0, p0, Lo/_anyIndexed;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    check-cast p1, Lo/_isIntNumber;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Lo/_isIntNumber;)V

    return-void
.end method

###### Class kotlin._findNamingStrategy (o._findNamingStrategy)
.class public final synthetic Lo/_findNamingStrategy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/setOnChartValueSelectedListener$AudioAttributesCompatParcelizer;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_findNamingStrategy;->IconCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public final read()Landroid/os/Bundle;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/_findNamingStrategy;->IconCompatParcelizer:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->onPrepareFromMediaId()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin._propNameFromSimple (o._propNameFromSimple)
.class public final synthetic Lo/_propNameFromSimple;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wrapAsJsonMappingException;


# instance fields
.field public final synthetic read:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_propNameFromSimple;->read:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/Object;)V
    .registers 2

    .line 0
    iget-object p0, p0, Lo/_propNameFromSimple;->read:Landroidx/fragment/app/FragmentManager;

    check-cast p1, Lo/_checkTextualNull;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Lo/_checkTextualNull;)V

    return-void
.end method
