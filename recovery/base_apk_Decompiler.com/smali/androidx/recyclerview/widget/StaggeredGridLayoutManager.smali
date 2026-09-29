###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager (androidx.recyclerview.widget.StaggeredGridLayoutManager)
.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$onCustomAction$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;
    }
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

.field private AudioAttributesImplApi21Parcelizer:I

.field IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:I

.field private MediaBrowserCompatItemReceiver:Z

.field private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

.field private final RemoteActionCompatParcelizer:Ljava/lang/Runnable;

.field private handleMediaPlayPauseIfPendingOnHandler:Z

.field private onAddQueueItem:I

.field private onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

.field private onCustomAction:Z

.field private onFastForward:Ljava/util/BitSet;

.field private onMediaButtonEvent:I

.field private onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

.field private onPlay:I

.field private onPlayFromMediaId:[I

.field private onPlayFromSearch:I

.field private onPlayFromUri:I

.field private onPrepare:Z

.field private onPrepareFromMediaId:Lo/UIntDeserializer;

.field private onPrepareFromSearch:Z

.field private final onRemoveQueueItemAt:Landroid/graphics/Rect;

.field read:Lo/UIntDeserializer;

.field write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 7

    .line 228
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;-><init>()V

    const/4 v0, -0x1

    .line 106
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    const/4 v1, 0x0

    .line 129
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    .line 134
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    .line 145
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    const/high16 v0, -0x80000000

    .line 151
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlay:I

    .line 157
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    const/4 v0, 0x2

    .line 162
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplApi21Parcelizer:I

    .line 188
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onRemoveQueueItemAt:Landroid/graphics/Rect;

    .line 193
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

    .line 201
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatItemReceiver:Z

    const/4 v0, 0x1

    .line 207
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    .line 215
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$4;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$4;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer:Ljava/lang/Runnable;

    .line 229
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;

    move-result-object p1

    .line 230
    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->write:I

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCustomAction(I)V

    .line 231
    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->AudioAttributesCompatParcelizer:I

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler(I)V

    .line 232
    iget-boolean p1, p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->RemoteActionCompatParcelizer:Z

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer(Z)V

    .line 233
    new-instance p1, Lo/erasedType;

    invoke-direct {p1}, Lo/erasedType;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    .line 234
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(I)I
    .registers 6

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3f

    const/4 v2, 0x2

    if-eq p1, v2, :cond_32

    const/16 v2, 0x11

    const/high16 v3, -0x80000000

    if-eq p1, v2, :cond_2c

    const/16 v2, 0x21

    if-eq p1, v2, :cond_26

    const/16 v0, 0x42

    if-eq p1, v0, :cond_20

    const/16 v0, 0x82

    if-eq p1, v0, :cond_1a

    return v3

    .line 2387
    :cond_1a
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-ne p0, v1, :cond_1f

    return v1

    :cond_1f
    return v3

    .line 2393
    :cond_20
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-nez p0, :cond_25

    return v1

    :cond_25
    return v3

    .line 2384
    :cond_26
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-ne p0, v1, :cond_2b

    return v0

    :cond_2b
    return v3

    .line 2390
    :cond_2c
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-nez p0, :cond_31

    return v0

    :cond_31
    return v3

    .line 2376
    :cond_32
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-ne p1, v1, :cond_37

    return v1

    .line 2378
    :cond_37
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand()Z

    move-result p0

    if-eqz p0, :cond_3e

    return v0

    :cond_3e
    return v1

    .line 2368
    :cond_3f
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-ne p1, v1, :cond_44

    return v0

    .line 2370
    :cond_44
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand()Z

    move-result p0

    if-eqz p0, :cond_4b

    return v1

    :cond_4b
    return v0
.end method

.method private AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 16

    .line 1549
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onFastForward:Ljava/util/BitSet;

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Ljava/util/BitSet;->set(IIZ)V

    .line 1554
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget-boolean v0, v0, Lo/erasedType;->AudioAttributesCompatParcelizer:Z

    if-eqz v0, :cond_1a

    .line 1555
    iget v0, p2, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    if-ne v0, v3, :cond_17

    const v0, 0x7fffffff

    goto :goto_29

    :cond_17
    const/high16 v0, -0x80000000

    goto :goto_29

    .line 1561
    :cond_1a
    iget v0, p2, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    if-ne v0, v3, :cond_24

    .line 1562
    iget v0, p2, Lo/erasedType;->write:I

    iget v1, p2, Lo/erasedType;->RemoteActionCompatParcelizer:I

    add-int/2addr v0, v1

    goto :goto_29

    .line 1564
    :cond_24
    iget v0, p2, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    iget v1, p2, Lo/erasedType;->RemoteActionCompatParcelizer:I

    sub-int/2addr v0, v1

    .line 1568
    :goto_29
    iget v1, p2, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    invoke-direct {p0, v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(II)V

    .line 1575
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eqz v1, :cond_39

    .line 1576
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v1

    goto :goto_3f

    .line 1577
    :cond_39
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v1

    :goto_3f
    move v4, v2

    .line 1579
    :goto_40
    invoke-virtual {p2, p3}, Lo/erasedType;->read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_128

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget-boolean v5, v5, Lo/erasedType;->AudioAttributesCompatParcelizer:Z

    if-nez v5, :cond_55

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onFastForward:Ljava/util/BitSet;

    .line 1580
    invoke-virtual {v5}, Ljava/util/BitSet;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_128

    .line 1581
    :cond_55
    invoke-virtual {p2, p1}, Lo/erasedType;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)Landroid/view/View;

    move-result-object v4

    .line 1582
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 1583
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    move-result v7

    .line 1584
    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v8, v7}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->write(I)I

    move-result v8

    if-ne v8, v6, :cond_6d

    move v6, v3

    goto :goto_6e

    :cond_6d
    move v6, v2

    :goto_6e
    if-eqz v6, :cond_7c

    .line 1588
    iget-boolean v8, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(Lo/erasedType;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    move-result-object v8

    .line 1589
    iget-object v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v9, v7, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer(ILandroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;)V

    goto :goto_80

    .line 1597
    :cond_7c
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v8, v7, v8

    .line 1600
    :goto_80
    iput-object v8, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    .line 1601
    iget v7, p2, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    if-ne v7, v3, :cond_8a

    .line 1602
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    goto :goto_8d

    .line 1604
    :cond_8a
    invoke-virtual {p0, v4, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/View;I)V

    .line 1606
    :goto_8d
    invoke-direct {p0, v4, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;)V

    .line 1610
    iget v7, p2, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    if-ne v7, v3, :cond_a6

    .line 1611
    iget-boolean v7, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1612
    invoke-virtual {v8, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v7

    .line 1613
    iget-object v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v9, v4}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v9

    add-int/2addr v9, v7

    if-eqz v6, :cond_b8

    .line 1614
    iget-boolean v6, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    goto :goto_b8

    .line 1622
    :cond_a6
    iget-boolean v7, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1623
    invoke-virtual {v8, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v9

    .line 1624
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v7, v4}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v7

    sub-int v7, v9, v7

    if-eqz v6, :cond_b8

    .line 1625
    iget-boolean v6, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1635
    :cond_b8
    :goto_b8
    iget-boolean v6, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1655
    invoke-static {v4, v5, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;Lo/erasedType;)V

    .line 1658
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand()Z

    move-result v6

    if-eqz v6, :cond_e2

    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-ne v6, v3, :cond_e2

    .line 1659
    iget-boolean v6, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1661
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    .line 1660
    invoke-virtual {v6}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v6

    iget v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    sub-int/2addr v10, v3

    iget v11, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    sub-int/2addr v10, v11

    iget v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    mul-int/2addr v10, v11

    sub-int/2addr v6, v10

    .line 1662
    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    invoke-virtual {v10, v4}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v10

    sub-int v10, v6, v10

    goto :goto_f7

    .line 1664
    :cond_e2
    iget-boolean v6, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1666
    iget v6, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    mul-int/2addr v6, v10

    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    invoke-virtual {v10}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v10

    add-int/2addr v10, v6

    .line 1667
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    invoke-virtual {v6, v4}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v6

    add-int/2addr v6, v10

    .line 1670
    :goto_f7
    iget v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-ne v11, v3, :cond_ff

    .line 1671
    invoke-static {v4, v10, v7, v6, v9}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer(Landroid/view/View;IIII)V

    goto :goto_102

    .line 1673
    :cond_ff
    invoke-static {v4, v7, v10, v9, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer(Landroid/view/View;IIII)V

    .line 1676
    :goto_102
    iget-boolean v6, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1679
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v6, v6, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    invoke-direct {p0, v8, v6, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;II)V

    .line 1681
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-direct {p0, p1, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;)V

    .line 1682
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget-boolean v6, v6, Lo/erasedType;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v6, :cond_125

    invoke-virtual {v4}, Landroid/view/View;->hasFocusable()Z

    move-result v4

    if-eqz v4, :cond_125

    .line 1683
    iget-boolean v4, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1686
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onFastForward:Ljava/util/BitSet;

    iget v5, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {v4, v5, v2}, Ljava/util/BitSet;->set(IZ)V

    :cond_125
    move v4, v3

    goto/16 :goto_40

    :cond_128
    if-nez v4, :cond_12f

    .line 1692
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-direct {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;)V

    .line 1695
    :cond_12f
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget p1, p1, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    if-ne p1, v6, :cond_147

    .line 1696
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RatingCompat(I)I

    move-result p1

    .line 1697
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p0

    sub-int/2addr p0, p1

    goto :goto_159

    .line 1699
    :cond_147
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(I)I

    move-result p1

    .line 1700
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p0

    sub-int p0, p1, p0

    :goto_159
    if-lez p0, :cond_162

    .line 1702
    iget p1, p2, Lo/erasedType;->RemoteActionCompatParcelizer:I

    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0

    :cond_162
    return v2
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 2

    .line 257
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    invoke-static {p0, v0}, Lo/UIntDeserializer;->write(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;I)Lo/UIntDeserializer;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    .line 258
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    rsub-int/lit8 v0, v0, 0x1

    .line 259
    invoke-static {p0, v0}, Lo/UIntDeserializer;->write(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;I)Lo/UIntDeserializer;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    return-void
.end method

.method private AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 7

    .line 1422
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    const/4 v1, 0x0

    iput v1, v0, Lo/erasedType;->RemoteActionCompatParcelizer:I

    .line 1423
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iput p1, v0, Lo/erasedType;->read:I

    .line 1426
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRepeatMode()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_31

    .line 1427
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RemoteActionCompatParcelizer()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_31

    .line 1429
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-ge p2, p1, :cond_1d

    move p1, v2

    goto :goto_1e

    :cond_1d
    move p1, v1

    :goto_1e
    if-ne v0, p1, :cond_28

    .line 1430
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result p1

    move p2, v1

    goto :goto_33

    .line 1432
    :cond_28
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result p1

    move p2, p1

    move p1, v1

    goto :goto_33

    :cond_31
    move p1, v1

    move p2, p1

    .line 1438
    :goto_33
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPause()Z

    move-result v0

    if-eqz v0, :cond_50

    .line 1440
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v3}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v3

    sub-int/2addr v3, p2

    iput v3, v0, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 1441
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v0

    add-int/2addr v0, p1

    iput v0, p2, Lo/erasedType;->write:I

    goto :goto_60

    .line 1443
    :cond_50
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v3}, Lo/UIntDeserializer;->write()I

    move-result v3

    add-int/2addr v3, p1

    iput v3, v0, Lo/erasedType;->write:I

    .line 1444
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    neg-int p2, p2

    iput p2, p1, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 1446
    :goto_60
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iput-boolean v1, p1, Lo/erasedType;->AudioAttributesImplBaseParcelizer:Z

    .line 1447
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iput-boolean v2, p1, Lo/erasedType;->AudioAttributesImplApi21Parcelizer:Z

    .line 1448
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p2}, Lo/UIntDeserializer;->read()I

    move-result p2

    if-nez p2, :cond_7b

    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    .line 1449
    invoke-virtual {p0}, Lo/UIntDeserializer;->write()I

    move-result p0

    if-nez p0, :cond_7b

    move v1, v2

    :cond_7b
    iput-boolean v1, p1, Lo/erasedType;->AudioAttributesCompatParcelizer:Z

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;IIZ)V
    .registers 8

    .line 1201
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onRemoveQueueItemAt:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, p4}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1202
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 1203
    iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onRemoveQueueItemAt:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v1

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onRemoveQueueItemAt:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v2

    invoke-static {p2, v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(III)I

    move-result p2

    .line 1205
    iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onRemoveQueueItemAt:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v1

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onRemoveQueueItemAt:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v2

    invoke-static {p3, v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(III)I

    move-result p3

    .line 1209
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result p0

    if-eqz p0, :cond_38

    .line 1211
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    :cond_38
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;)V
    .registers 10

    .line 1136
    iget-boolean v0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1159
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2f

    .line 1162
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    .line 1166
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSeekTo()I

    move-result v3

    iget v4, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1164
    invoke-static {v0, v3, v1, v4, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(IIIIZ)I

    move-result v0

    .line 1171
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result v3

    .line 1172
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onFastForward()I

    move-result v4

    .line 1173
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result v6

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    add-int/2addr v5, v6

    .line 1170
    invoke-static {v3, v4, v5, p2, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(IIIIZ)I

    move-result p2

    .line 1162
    invoke-direct {p0, p1, v0, p2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroid/view/View;IIZ)V

    return-void

    .line 1183
    :cond_2f
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v0

    .line 1184
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSeekTo()I

    move-result v3

    .line 1185
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result v5

    iget v6, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    add-int/2addr v4, v5

    .line 1182
    invoke-static {v0, v3, v4, v6, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(IIIIZ)I

    move-result v0

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    .line 1190
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onFastForward()I

    move-result v3

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1188
    invoke-static {v2, v3, v1, p2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(IIIIZ)I

    move-result p2

    .line 1180
    invoke-direct {p0, p1, v0, p2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroid/view/View;IIZ)V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;Lo/erasedType;)V
    .registers 4

    .line 1724
    iget p2, p2, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    const/4 v0, 0x1

    if-ne p2, v0, :cond_d

    .line 1725
    iget-boolean p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1728
    iget-object p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    return-void

    .line 1731
    :cond_d
    iget-boolean p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1734
    iget-object p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read(Landroid/view/View;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;)V
    .registers 5

    .line 794
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    if-lez v0, :cond_4d

    .line 795
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ne v0, v1, :cond_42

    const/4 v0, 0x0

    .line 796
    :goto_f
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v0, v1, :cond_4d

    .line 797
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 798
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi21Parcelizer:[I

    aget v1, v1, v0

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_38

    .line 800
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->RemoteActionCompatParcelizer:Z

    if-eqz v2, :cond_31

    .line 801
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v2}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v2

    goto :goto_37

    .line 803
    :cond_31
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v2}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v2

    :goto_37
    add-int/2addr v1, v2

    .line 806
    :cond_38
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v2, v2, v0

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    .line 809
    :cond_42
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesCompatParcelizer()V

    .line 810
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplBaseParcelizer:I

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    .line 813
    :cond_4d
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->read:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCustomAction:Z

    .line 814
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->IconCompatParcelizer:Z

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer(Z)V

    .line 815
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatItemReceiver()V

    .line 817
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_71

    .line 818
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    .line 819
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->RemoteActionCompatParcelizer:Z

    iput-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    goto :goto_75

    .line 821
    :cond_71
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    iput-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    .line 823
    :goto_75
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi26Parcelizer:I

    const/4 v0, 0x1

    if-le p1, v0, :cond_8c

    .line 824
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatItemReceiver:[I

    iput-object v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    .line 825
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesCompatParcelizer:Ljava/util/List;

    iput-object p0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    :cond_8c
    return-void
.end method

.method private AudioAttributesImplApi21Parcelizer(I)I
    .registers 6

    .line 2192
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_18

    .line 2194
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v3

    .line 2195
    invoke-static {v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v3

    if-ltz v3, :cond_15

    if-ge v3, p1, :cond_15

    return v3

    :cond_15
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_18
    return v1
.end method

.method private AudioAttributesImplApi21Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 8

    .line 1100
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    .line 1103
    :cond_8
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1104
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1105
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    move-object v0, p1

    move-object v4, p0

    .line 1103
    invoke-static/range {v0 .. v5}, Lo/serializedjbwkw;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/UIntDeserializer;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;Z)I

    move-result p0

    return p0
.end method

.method private AudioAttributesImplApi26Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 8

    .line 1120
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    .line 1123
    :cond_8
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1124
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1125
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    move-object v0, p1

    move-object v4, p0

    .line 1123
    invoke-static/range {v0 .. v5}, Lo/serializedjbwkw;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/UIntDeserializer;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;Z)I

    move-result p0

    return p0
.end method

.method private AudioAttributesImplBaseParcelizer()V
    .registers 10

    .line 742
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->read()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_ae

    .line 746
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v1

    :goto_11
    if-ge v3, v0, :cond_39

    .line 748
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v4

    .line 749
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    invoke-virtual {v5, v4}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v5

    int-to-float v5, v5

    cmpg-float v6, v5, v2

    if-ltz v6, :cond_36

    .line 753
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 754
    invoke-virtual {v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->write()Z

    move-result v4

    if-eqz v4, :cond_32

    .line 755
    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    int-to-float v4, v4

    div-float/2addr v5, v4

    .line 757
    :cond_32
    invoke-static {v2, v5}, Ljava/lang/Math;->max(FF)F

    move-result v2

    :cond_36
    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    .line 759
    :cond_39
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    .line 760
    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 761
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    invoke-virtual {v4}, Lo/UIntDeserializer;->read()I

    move-result v4

    const/high16 v5, -0x80000000

    if-ne v4, v5, :cond_57

    .line 762
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    invoke-virtual {v4}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 764
    :cond_57
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand(I)V

    .line 765
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    if-eq v2, v3, :cond_ae

    :goto_5e
    if-ge v1, v0, :cond_ae

    .line 769
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v2

    .line 770
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 771
    iget-boolean v5, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 774
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_92

    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-ne v5, v6, :cond_92

    .line 775
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    sub-int/2addr v5, v6

    iget-object v7, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget v7, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    sub-int/2addr v5, v7

    neg-int v5, v5

    iget v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    .line 776
    iget v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    sub-int/2addr v8, v6

    iget-object v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    sub-int/2addr v8, v4

    neg-int v4, v8

    mul-int/2addr v5, v7

    mul-int/2addr v4, v3

    sub-int/2addr v5, v4

    .line 777
    invoke-virtual {v2, v5}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_ab

    .line 779
    :cond_92
    iget-object v5, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget v5, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    mul-int/2addr v5, v7

    .line 780
    iget-object v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    mul-int/2addr v4, v3

    .line 781
    iget v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-ne v7, v6, :cond_a7

    sub-int/2addr v5, v4

    .line 782
    invoke-virtual {v2, v5}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_ab

    :cond_a7
    sub-int/2addr v5, v4

    .line 784
    invoke-virtual {v2, v5}, Landroid/view/View;->offsetTopAndBottom(I)V

    :goto_ab
    add-int/lit8 v1, v1, 0x1

    goto :goto_5e

    :cond_ae
    return-void
.end method

.method private IconCompatParcelizer(I)I
    .registers 5

    .line 2017
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-nez v0, :cond_e

    .line 2018
    iget-boolean p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eqz p0, :cond_d

    return v2

    :cond_d
    return v1

    .line 2020
    :cond_e
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat()I

    move-result v0

    if-ge p1, v0, :cond_16

    move p1, v2

    goto :goto_17

    :cond_16
    const/4 p1, 0x0

    .line 2021
    :goto_17
    iget-boolean p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eq p1, p0, :cond_1c

    return v1

    :cond_1c
    return v2
.end method

.method private IconCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 6

    .line 2149
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_31

    if-eqz p1, :cond_31

    .line 2153
    invoke-direct {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(ILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 2154
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-direct {p0, p2, v0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p3

    .line 2155
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v0, v0, Lo/erasedType;->RemoteActionCompatParcelizer:I

    if-lt v0, p3, :cond_1d

    if-gez p1, :cond_1c

    neg-int p1, p3

    goto :goto_1d

    :cond_1c
    move p1, p3

    .line 2168
    :cond_1d
    :goto_1d
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    neg-int v0, p1

    invoke-virtual {p3, v0}, Lo/UIntDeserializer;->read(I)V

    .line 2170
    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:Z

    .line 2171
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iput v1, p3, Lo/erasedType;->RemoteActionCompatParcelizer:I

    .line 2172
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-direct {p0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;)V

    return p1

    :cond_31
    return v1
.end method

.method private IconCompatParcelizer(Lo/erasedType;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;
    .registers 9

    .line 1954
    iget v0, p1, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_f

    .line 1957
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    sub-int/2addr v0, v1

    const/4 v2, -0x1

    move v3, v2

    goto :goto_13

    .line 1962
    :cond_f
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    const/4 v0, 0x0

    move v3, v1

    .line 1965
    :goto_13
    iget p1, p1, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    const/4 v4, 0x0

    if-ne p1, v1, :cond_32

    .line 1968
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p1

    const v1, 0x7fffffff

    :goto_21
    if-eq v0, v2, :cond_31

    .line 1970
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v5, v5, v0

    .line 1971
    invoke-virtual {v5, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v6

    if-ge v6, v1, :cond_2f

    move-object v4, v5

    move v1, v6

    :cond_2f
    add-int/2addr v0, v3

    goto :goto_21

    :cond_31
    return-object v4

    .line 1981
    :cond_32
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p1

    const/high16 v1, -0x80000000

    :goto_3a
    if-eq v0, v2, :cond_4a

    .line 1983
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v5, v5, v0

    .line 1984
    invoke-virtual {v5, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v6

    if-le v6, v1, :cond_48

    move-object v4, v5

    move v1, v6

    :cond_48
    add-int/2addr v0, v3

    goto :goto_3a

    :cond_4a
    return-object v4
.end method

.method private IconCompatParcelizer(III)V
    .registers 10

    .line 1505
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eqz v0, :cond_9

    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatMediaItem()I

    move-result v0

    goto :goto_d

    :cond_9
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat()I

    move-result v0

    :goto_d
    const/16 v1, 0x8

    if-ne p3, v1, :cond_1a

    if-ge p1, p2, :cond_16

    add-int/lit8 v2, p2, 0x1

    goto :goto_1c

    :cond_16
    add-int/lit8 v2, p1, 0x1

    move v3, p2

    goto :goto_1d

    :cond_1a
    add-int v2, p1, p2

    :goto_1c
    move v3, p1

    .line 1522
    :goto_1d
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer(I)I

    const/4 v4, 0x1

    if-eq p3, v4, :cond_3b

    const/4 v5, 0x2

    if-eq p3, v5, :cond_35

    if-ne p3, v1, :cond_40

    .line 1532
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p3, p1, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read(II)V

    .line 1533
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->write(II)V

    goto :goto_40

    .line 1528
    :cond_35
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read(II)V

    goto :goto_40

    .line 1525
    :cond_3b
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->write(II)V

    :cond_40
    :goto_40
    if-le v2, v0, :cond_54

    .line 1541
    iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eqz p1, :cond_4b

    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat()I

    move-result p1

    goto :goto_4f

    :cond_4b
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatMediaItem()I

    move-result p1

    :goto_4f
    if-gt v3, p1, :cond_54

    .line 1543
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    :cond_54
    return-void
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V
    .registers 8

    .line 1910
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_6
    if-ltz v0, :cond_39

    .line 1913
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v2

    .line 1914
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v3, v2}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v3

    if-lt v3, p2, :cond_39

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    .line 1915
    invoke-virtual {v3, v2}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer(Landroid/view/View;)I

    move-result v3

    if-lt v3, p2, :cond_39

    .line 1916
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 1918
    iget-boolean v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1928
    iget-object v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget-object v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-eq v4, v1, :cond_39

    .line 1931
    iget-object v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer()V

    .line 1933
    invoke-virtual {p0, v2, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_39
    return-void
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;)Z
    .registers 7

    .line 857
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_dd

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_dd

    const/high16 v3, -0x80000000

    if-ltz v0, :cond_d9

    .line 861
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p1

    if-ge v0, p1, :cond_d9

    .line 867
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    const/4 v0, 0x1

    if-eqz p1, :cond_2d

    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    if-eq p1, v2, :cond_2d

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    if-lez p1, :cond_2d

    .line 928
    iput v3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    .line 929
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    iput p0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->write:I

    goto/16 :goto_d8

    .line 870
    :cond_2d
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_bc

    .line 874
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eqz v1, :cond_3e

    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatMediaItem()I

    move-result v1

    goto :goto_42

    .line 875
    :cond_3e
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat()I

    move-result v1

    :goto_42
    iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->write:I

    .line 876
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlay:I

    if-eq v1, v3, :cond_72

    .line 877
    iget-boolean v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    if-eqz v1, :cond_5f

    .line 878
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlay:I

    sub-int/2addr v1, v2

    .line 880
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p0, p1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result p0

    sub-int/2addr v1, p0

    iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    goto :goto_71

    .line 882
    :cond_5f
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlay:I

    add-int/2addr v1, v2

    .line 884
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p0, p1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result p0

    sub-int/2addr v1, p0

    iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    :goto_71
    return v0

    .line 890
    :cond_72
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1, p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v1

    .line 891
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v2}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v2

    if-le v1, v2, :cond_94

    .line 893
    iget-boolean p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    if-eqz p1, :cond_8b

    .line 894
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p0

    goto :goto_91

    .line 895
    :cond_8b
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p0

    :goto_91
    iput p0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    return v0

    .line 899
    :cond_94
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1, p1}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    .line 900
    invoke-virtual {v2}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v2

    sub-int/2addr v1, v2

    if-gez v1, :cond_a7

    neg-int p0, v1

    .line 902
    iput p0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    return v0

    .line 905
    :cond_a7
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v1

    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    .line 906
    invoke-virtual {p0, p1}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result p0

    sub-int/2addr v1, p0

    if-gez v1, :cond_b9

    .line 908
    iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    return v0

    .line 912
    :cond_b9
    iput v3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    goto :goto_d8

    .line 916
    :cond_bc
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->write:I

    .line 917
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlay:I

    if-ne p1, v3, :cond_d3

    .line 918
    iget p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->write:I

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(I)I

    move-result p0

    if-ne p0, v0, :cond_cd

    move v1, v0

    .line 920
    :cond_cd
    iput-boolean v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    .line 921
    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read()V

    goto :goto_d6

    .line 923
    :cond_d3
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer(I)V

    .line 925
    :goto_d6
    iput-boolean v0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:Z

    :goto_d8
    return v0

    .line 862
    :cond_d9
    iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    .line 863
    iput v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlay:I

    :cond_dd
    return v1
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;)Z
    .registers 5

    .line 402
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_28

    .line 403
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()I

    move-result v0

    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result p0

    if-ge v0, p0, :cond_43

    .line 405
    iget-object p0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    iget-object p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    .line 406
    invoke-static {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    move-result-object p0

    .line 407
    iget-boolean p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    goto :goto_42

    .line 409
    :cond_28
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p0

    if-le v0, p0, :cond_43

    .line 411
    iget-object p0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    .line 412
    invoke-static {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    move-result-object p0

    .line 413
    iget-boolean p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    :goto_42
    return v1

    :cond_43
    return v2
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()I
    .registers 3

    .line 1319
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_a

    invoke-direct {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Z)Landroid/view/View;

    move-result-object p0

    goto :goto_e

    .line 1320
    :cond_a
    invoke-direct {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(Z)Landroid/view/View;

    move-result-object p0

    :goto_e
    if-nez p0, :cond_12

    const/4 p0, -0x1

    return p0

    .line 1321
    :cond_12
    invoke-static {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method private MediaBrowserCompatCustomActionResultReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 9

    .line 1080
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    .line 1083
    :cond_8
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1084
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    xor-int/lit8 v0, v0, 0x1

    .line 1085
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepare:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    move-object v0, p1

    move-object v4, p0

    .line 1083
    invoke-static/range {v0 .. v6}, Lo/serializedjbwkw;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/UIntDeserializer;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;ZZ)I

    move-result p0

    return p0
.end method

.method private MediaBrowserCompatItemReceiver()V
    .registers 3

    .line 559
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_11

    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 562
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    return-void

    .line 560
    :cond_11
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    return-void
.end method

.method private MediaBrowserCompatMediaItem()I
    .registers 2

    .line 2177
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    add-int/lit8 v0, v0, -0x1

    .line 2178
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method private MediaBrowserCompatMediaItem(I)I
    .registers 5

    .line 1817
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v0

    const/4 v1, 0x1

    .line 1818
    :goto_a
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v1, v2, :cond_1c

    .line 1819
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v2

    if-le v2, v0, :cond_19

    move v0, v2

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1c
    return v0
.end method

.method private MediaBrowserCompatSearchResultReceiver(I)I
    .registers 4

    .line 2209
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_18

    .line 2210
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v1

    .line 2211
    invoke-static {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v1

    if-ltz v1, :cond_15

    if-ge v1, p1, :cond_15

    return v1

    :cond_15
    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method private MediaBrowserCompatSearchResultReceiver()Landroid/view/View;
    .registers 13

    .line 339
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 340
    new-instance v2, Ljava/util/BitSet;

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 341
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v3, v5}, Ljava/util/BitSet;->set(IIZ)V

    .line 344
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    const/4 v6, -0x1

    if-ne v3, v5, :cond_21

    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand()Z

    move-result v3

    if-eqz v3, :cond_21

    move v3, v5

    goto :goto_22

    :cond_21
    move v3, v6

    .line 346
    :goto_22
    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eqz v7, :cond_28

    move v0, v6

    goto :goto_29

    :cond_28
    move v1, v4

    :goto_29
    if-ge v1, v0, :cond_2c

    move v6, v5

    :cond_2c
    if-eq v1, v0, :cond_9b

    .line 355
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v7

    .line 356
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 357
    iget-object v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_51

    .line 358
    iget-object v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    invoke-direct {p0, v9}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;)Z

    move-result v9

    if-nez v9, :cond_9a

    .line 361
    iget-object v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->clear(I)V

    .line 363
    :cond_51
    iget-boolean v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    add-int/2addr v1, v6

    if-eq v1, v0, :cond_2c

    .line 368
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v9

    .line 370
    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eqz v10, :cond_6f

    .line 372
    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v10, v7}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v10

    .line 373
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v11, v9}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v11

    if-lt v10, v11, :cond_9a

    if-ne v10, v11, :cond_2c

    goto :goto_7f

    .line 380
    :cond_6f
    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v10, v7}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v10

    .line 381
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v11, v9}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v11

    if-gt v10, v11, :cond_9a

    if-ne v10, v11, :cond_2c

    .line 390
    :goto_7f
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 391
    iget-object v8, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget v8, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget-object v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    sub-int/2addr v8, v9

    if-gez v8, :cond_92

    move v8, v5

    goto :goto_93

    :cond_92
    move v8, v4

    :goto_93
    if-gez v3, :cond_97

    move v9, v5

    goto :goto_98

    :cond_97
    move v9, v4

    :goto_98
    if-eq v8, v9, :cond_2c

    :cond_9a
    return-object v7

    :cond_9b
    const/4 p0, 0x0

    return-object p0
.end method

.method private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(I)Z
    .registers 6

    .line 1944
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_12

    if-ne p1, v1, :cond_b

    move p1, v2

    goto :goto_c

    :cond_b
    move p1, v3

    .line 1945
    :goto_c
    iget-boolean p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eq p1, p0, :cond_11

    return v2

    :cond_11
    return v3

    :cond_12
    if-ne p1, v1, :cond_16

    move p1, v2

    goto :goto_17

    :cond_16
    move p1, v3

    .line 1947
    :goto_17
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-ne p1, v0, :cond_1d

    move p1, v2

    goto :goto_1e

    :cond_1d
    move p1, v3

    :goto_1e
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand()Z

    move-result p0

    if-ne p1, p0, :cond_25

    return v2

    :cond_25
    return v3
.end method

.method private MediaDescriptionCompat(I)I
    .registers 5

    .line 1859
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v0

    const/4 v1, 0x1

    .line 1860
    :goto_a
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v1, v2, :cond_1c

    .line 1861
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v2

    if-le v2, v0, :cond_19

    move v0, v2

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1c
    return v0
.end method

.method private MediaDescriptionCompat()V
    .registers 2

    .line 548
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer()V

    .line 549
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

.method private MediaMetadataCompat()I
    .registers 3

    .line 2182
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    .line 2183
    :cond_8
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method private MediaMetadataCompat(I)I
    .registers 5

    .line 1870
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v0

    const/4 v1, 0x1

    .line 1871
    :goto_a
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v1, v2, :cond_1c

    .line 1872
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v2

    if-ge v2, v0, :cond_19

    move v0, v2

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1c
    return v0
.end method

.method private RatingCompat(I)I
    .registers 5

    .line 1828
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v0

    const/4 v1, 0x1

    .line 1829
    :goto_a
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v1, v2, :cond_1c

    .line 1830
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v2

    if-ge v2, v0, :cond_19

    move v0, v2

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1c
    return v0
.end method

.method private RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;)V
    .registers 4

    .line 830
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 833
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;)Z

    :cond_9
    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)V
    .registers 6

    const/high16 v0, -0x80000000

    .line 1385
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(I)I

    move-result v1

    if-eq v1, v0, :cond_21

    .line 1389
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v0

    sub-int/2addr v0, v1

    if-lez v0, :cond_21

    neg-int v1, v0

    .line 1392
    invoke-direct {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p1

    neg-int p1, p1

    sub-int/2addr v0, p1

    if-eqz p3, :cond_21

    if-lez v0, :cond_21

    .line 1398
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p0, v0}, Lo/UIntDeserializer;->read(I)V

    :cond_21
    return-void
.end method

.method private RemoteActionCompatParcelizer(Z)V
    .registers 3

    const/4 v0, 0x0

    .line 476
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 477
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_10

    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->IconCompatParcelizer:Z

    if-eq v0, p1, :cond_10

    .line 478
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iput-boolean p1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->IconCompatParcelizer:Z

    .line 480
    :cond_10
    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    .line 481
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

.method private handleMediaPlayPauseIfPendingOnHandler(I)V
    .registers 4

    const/4 v0, 0x0

    .line 428
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 429
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-eq p1, v0, :cond_30

    .line 430
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat()V

    .line 431
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    .line 432
    new-instance p1, Ljava/util/BitSet;

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onFastForward:Ljava/util/BitSet;

    .line 433
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    new-array p1, p1, [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    const/4 p1, 0x0

    .line 434
    :goto_1d
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge p1, v0, :cond_2d

    .line 435
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    invoke-direct {v1, p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1d

    .line 437
    :cond_2d
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    :cond_30
    return-void
.end method

.method private onAddQueueItem(I)V
    .registers 5

    .line 1453
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iput p1, v0, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    .line 1454
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget-boolean p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_e

    move p1, v1

    goto :goto_f

    :cond_e
    const/4 p1, 0x0

    :goto_f
    if-ne p0, p1, :cond_12

    goto :goto_13

    :cond_12
    move v1, v2

    .line 1455
    :goto_13
    iput v1, v0, Lo/erasedType;->IconCompatParcelizer:I

    return-void
.end method

.method private onCommand(I)V
    .registers 3

    .line 935
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    div-int v0, p1, v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    .line 937
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    .line 938
    invoke-virtual {v0}, Lo/UIntDeserializer;->read()I

    move-result v0

    .line 937
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:I

    return-void
.end method

.method private onCommand()Z
    .registers 2

    .line 567
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromSearch()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_8

    return v0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method private onCustomAction(I)V
    .registers 3

    if-eqz p1, :cond_e

    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    goto :goto_e

    .line 449
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid orientation."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    :goto_e
    const/4 v0, 0x0

    .line 451
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 452
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-ne p1, v0, :cond_17

    return-void

    .line 455
    :cond_17
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    .line 456
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    .line 457
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    .line 458
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    .line 459
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

.method private static read(III)I
    .registers 5

    if-nez p1, :cond_4

    if-eqz p2, :cond_10

    .line 1220
    :cond_4
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_11

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_11

    :cond_10
    return p0

    .line 1223
    :cond_11
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    sub-int/2addr p0, p1

    sub-int/2addr p0, p2

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 1222
    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method private read(Z)Landroid/view/View;
    .registers 9

    .line 1361
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    .line 1362
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v1

    .line 1364
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    :goto_13
    if-ltz v2, :cond_36

    .line 1365
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v4

    .line 1366
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v5, v4}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v5

    .line 1367
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v6, v4}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v6

    if-le v6, v0, :cond_33

    if-lt v5, v1, :cond_2a

    goto :goto_33

    :cond_2a
    if-le v6, v1, :cond_32

    if-eqz p1, :cond_32

    if-nez v3, :cond_33

    move-object v3, v4

    goto :goto_33

    :cond_32
    return-object v4

    :cond_33
    :goto_33
    add-int/lit8 v2, v2, -0x1

    goto :goto_13

    :cond_36
    return-object v3
.end method

.method private read(II)V
    .registers 5

    const/4 v0, 0x0

    .line 1793
    :goto_1
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v0, v1, :cond_1b

    .line 1794
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v1, v1, v0

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_18

    .line 1797
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v1, v1, v0

    invoke-direct {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;II)V

    :cond_18
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1b
    return-void
.end method

.method private read(ILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 7

    const/4 v0, 0x1

    if-lez p1, :cond_9

    .line 2136
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatMediaItem()I

    move-result v1

    move v2, v0

    goto :goto_e

    .line 2139
    :cond_9
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat()I

    move-result v1

    const/4 v2, -0x1

    .line 2141
    :goto_e
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iput-boolean v0, v3, Lo/erasedType;->AudioAttributesImplApi21Parcelizer:Z

    .line 2142
    invoke-direct {p0, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 2143
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem(I)V

    .line 2144
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v0, p2, Lo/erasedType;->IconCompatParcelizer:I

    add-int/2addr v1, v0

    iput v1, p2, Lo/erasedType;->read:I

    .line 2145
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iput p1, p0, Lo/erasedType;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V
    .registers 7

    .line 1881
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-lez v0, :cond_37

    const/4 v0, 0x0

    .line 1882
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v0

    .line 1883
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1, v0}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v1

    if-gt v1, p2, :cond_37

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    .line 1884
    invoke-virtual {v1, v0}, Lo/UIntDeserializer;->read(Landroid/view/View;)I

    move-result v1

    if-gt v1, p2, :cond_37

    .line 1885
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 1887
    iget-boolean v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 1897
    iget-object v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_37

    .line 1900
    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer()V

    .line 1902
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    goto :goto_0

    :cond_37
    return-void
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)V
    .registers 6

    const v0, 0x7fffffff

    .line 1404
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RatingCompat(I)I

    move-result v1

    if-eq v1, v0, :cond_21

    .line 1408
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    sub-int/2addr v1, v0

    if-lez v1, :cond_21

    .line 1411
    invoke-direct {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p1

    sub-int/2addr v1, p1

    if-eqz p3, :cond_21

    if-lez v1, :cond_21

    .line 1417
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    neg-int p1, v1

    invoke-virtual {p0, p1}, Lo/UIntDeserializer;->read(I)V

    :cond_21
    return-void
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;)V
    .registers 5

    .line 1740
    iget-boolean v0, p2, Lo/erasedType;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz v0, :cond_57

    iget-boolean v0, p2, Lo/erasedType;->AudioAttributesCompatParcelizer:Z

    if-nez v0, :cond_57

    .line 1743
    iget v0, p2, Lo/erasedType;->RemoteActionCompatParcelizer:I

    const/4 v1, -0x1

    if-nez v0, :cond_1d

    .line 1745
    iget v0, p2, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    if-ne v0, v1, :cond_17

    .line 1746
    iget p2, p2, Lo/erasedType;->write:I

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V

    return-void

    .line 1748
    :cond_17
    iget p2, p2, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V

    return-void

    .line 1753
    :cond_1d
    iget v0, p2, Lo/erasedType;->MediaBrowserCompatItemReceiver:I

    if-ne v0, v1, :cond_3d

    .line 1755
    iget v0, p2, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    iget v1, p2, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-direct {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatMediaItem(I)I

    move-result v1

    sub-int/2addr v0, v1

    if-gez v0, :cond_2f

    .line 1758
    iget p2, p2, Lo/erasedType;->write:I

    goto :goto_39

    .line 1760
    :cond_2f
    iget v1, p2, Lo/erasedType;->write:I

    iget p2, p2, Lo/erasedType;->RemoteActionCompatParcelizer:I

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int p2, v1, p2

    .line 1762
    :goto_39
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V

    return-void

    .line 1765
    :cond_3d
    iget v0, p2, Lo/erasedType;->write:I

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat(I)I

    move-result v0

    iget v1, p2, Lo/erasedType;->write:I

    sub-int/2addr v0, v1

    if-gez v0, :cond_4b

    .line 1768
    iget p2, p2, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    goto :goto_54

    .line 1770
    :cond_4b
    iget v1, p2, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    iget p2, p2, Lo/erasedType;->RemoteActionCompatParcelizer:I

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p2, v1

    .line 1772
    :goto_54
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V

    :cond_57
    return-void
.end method

.method private read(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;II)V
    .registers 7

    .line 1802
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne p2, v1, :cond_17

    .line 1804
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer()I

    move-result p2

    add-int/2addr p2, v0

    if-gt p2, p3, :cond_25

    .line 1806
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onFastForward:Ljava/util/BitSet;

    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {p0, p1, v2}, Ljava/util/BitSet;->set(IZ)V

    return-void

    .line 1809
    :cond_17
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()I

    move-result p2

    sub-int/2addr p2, v0

    if-lt p2, p3, :cond_25

    .line 1811
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onFastForward:Ljava/util/BitSet;

    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {p0, p1, v2}, Ljava/util/BitSet;->set(IZ)V

    :cond_25
    return-void
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;)Z
    .registers 4

    .line 848
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-eqz v0, :cond_d

    .line 849
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatSearchResultReceiver(I)I

    move-result p0

    goto :goto_15

    .line 850
    :cond_d
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplApi21Parcelizer(I)I

    move-result p0

    :goto_15
    iput p0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->write:I

    const/high16 p0, -0x80000000

    .line 851
    iput p0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    const/4 p0, 0x1

    return p0
.end method

.method private write(Z)Landroid/view/View;
    .registers 10

    .line 1331
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    .line 1332
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v1

    .line 1333
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_12
    if-ge v4, v2, :cond_35

    .line 1336
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v5

    .line 1337
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v6, v5}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v6

    .line 1338
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v7, v5}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v7

    if-le v7, v0, :cond_32

    if-lt v6, v1, :cond_29

    goto :goto_32

    :cond_29
    if-ge v6, v0, :cond_31

    if-eqz p1, :cond_31

    if-nez v3, :cond_32

    move-object v3, v5

    goto :goto_32

    :cond_31
    return-object v5

    :cond_32
    :goto_32
    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    :cond_35
    return-object v3
.end method

.method private write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)V
    .registers 12

    .line 619
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

    .line 620
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    const/4 v2, -0x1

    if-nez v1, :cond_b

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    if-eq v1, v2, :cond_18

    .line 621
    :cond_b
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v1

    if-nez v1, :cond_18

    .line 622
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 623
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    return-void

    .line 628
    :cond_18
    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_28

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    if-ne v1, v2, :cond_28

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-nez v1, :cond_28

    move v1, v3

    goto :goto_29

    :cond_28
    move v1, v4

    :goto_29
    if-eqz v1, :cond_42

    .line 631
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    .line 632
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v5, :cond_36

    .line 633
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;)V

    goto :goto_3d

    .line 635
    :cond_36
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatItemReceiver()V

    .line 636
    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    iput-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    .line 638
    :goto_3d
    invoke-direct {p0, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;)V

    .line 639
    iput-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    .line 641
    :cond_42
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-nez v5, :cond_5f

    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    if-ne v5, v2, :cond_5f

    .line 642
    iget-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-ne v5, v6, :cond_58

    .line 643
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand()Z

    move-result v5

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCustomAction:Z

    if-eq v5, v6, :cond_5f

    .line 644
    :cond_58
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer()V

    .line 645
    iput-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:Z

    .line 649
    :cond_5f
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v5

    if-lez v5, :cond_c9

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v5, :cond_6d

    iget v5, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    if-gtz v5, :cond_c9

    .line 651
    :cond_6d
    iget-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:Z

    if-eqz v5, :cond_8f

    move v1, v3

    .line 652
    :goto_72
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v1, v5, :cond_c9

    .line 654
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v5, v5, v1

    invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 655
    iget v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    const/high16 v6, -0x80000000

    if-eq v5, v6, :cond_8c

    .line 656
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v5, v5, v1

    iget v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read(I)V

    :cond_8c
    add-int/lit8 v1, v1, 0x1

    goto :goto_72

    :cond_8f
    if-nez v1, :cond_af

    .line 660
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[I

    if-eqz v1, :cond_af

    move v1, v3

    .line 667
    :goto_98
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v1, v5, :cond_c9

    .line 668
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v5, v5, v1

    .line 669
    invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 670
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

    iget-object v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[I

    aget v6, v6, v1

    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_98

    :cond_af
    move v1, v3

    .line 661
    :goto_b0
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v1, v5, :cond_c2

    .line 662
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v5, v5, v1

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    iget v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    invoke-virtual {v5, v6, v7}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read(ZI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_b0

    .line 665
    :cond_c2
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer([Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;)V

    .line 675
    :cond_c9
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 676
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iput-boolean v3, v1, Lo/erasedType;->AudioAttributesImplApi21Parcelizer:Z

    .line 677
    iput-boolean v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatItemReceiver:Z

    .line 678
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromMediaId:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v1

    invoke-direct {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand(I)V

    .line 679
    iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->write:I

    invoke-direct {p0, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 680
    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    if-eqz v1, :cond_100

    .line 682
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem(I)V

    .line 683
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-direct {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    .line 685
    invoke-direct {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem(I)V

    .line 686
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->write:I

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v5, v5, Lo/erasedType;->IconCompatParcelizer:I

    add-int/2addr v2, v5

    iput v2, v1, Lo/erasedType;->read:I

    .line 687
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-direct {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    goto :goto_11b

    .line 690
    :cond_100
    invoke-direct {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem(I)V

    .line 691
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-direct {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    .line 693
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem(I)V

    .line 694
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->write:I

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v5, v5, Lo/erasedType;->IconCompatParcelizer:I

    add-int/2addr v2, v5

    iput v2, v1, Lo/erasedType;->read:I

    .line 695
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-direct {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    .line 698
    :goto_11b
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 700
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v1

    if-lez v1, :cond_135

    .line 701
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eqz v1, :cond_12f

    .line 702
    invoke-direct {p0, p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)V

    .line 703
    invoke-direct {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)V

    goto :goto_135

    .line 705
    :cond_12f
    invoke-direct {p0, p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)V

    .line 706
    invoke-direct {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)V

    :cond_135
    :goto_135
    if-eqz p3, :cond_159

    .line 710
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p3

    if-nez p3, :cond_159

    .line 711
    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplApi21Parcelizer:I

    if-eqz p3, :cond_159

    .line 712
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result p3

    if-lez p3, :cond_159

    .line 713
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatSearchResultReceiver()Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_159

    .line 715
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer:Ljava/lang/Runnable;

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/Runnable;)Z

    .line 716
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer()Z

    move-result p3

    if-eqz p3, :cond_159

    goto :goto_15a

    :cond_159
    move v4, v3

    .line 721
    :goto_15a
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p3

    if-eqz p3, :cond_165

    .line 722
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    .line 724
    :cond_165
    iget-boolean p3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:Z

    .line 725
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand()Z

    move-result p3

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCustomAction:Z

    if-eqz v4, :cond_179

    .line 727
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    .line 728
    invoke-direct {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)V

    :cond_179
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1076
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;
    .registers 12

    .line 2258
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return-object v1

    .line 2262
    :cond_8
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_f

    return-object v1

    .line 2267
    :cond_f
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatItemReceiver()V

    .line 2268
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(I)I

    move-result p2

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_1b

    return-object v1

    .line 2272
    :cond_1b
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 2273
    iget-boolean v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    .line 2274
    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    const/4 v2, 0x1

    if-ne p2, v2, :cond_2d

    .line 2277
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatMediaItem()I

    move-result v3

    goto :goto_31

    .line 2279
    :cond_2d
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat()I

    move-result v3

    .line 2281
    :goto_31
    invoke-direct {p0, v3, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 2282
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem(I)V

    .line 2284
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v5, v4, Lo/erasedType;->IconCompatParcelizer:I

    add-int/2addr v5, v3

    iput v5, v4, Lo/erasedType;->read:I

    .line 2285
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v5}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v5

    int-to-float v5, v5

    const v6, 0x3eaaaaab

    mul-float/2addr v5, v6

    float-to-int v5, v5

    iput v5, v4, Lo/erasedType;->RemoteActionCompatParcelizer:I

    .line 2286
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iput-boolean v2, v4, Lo/erasedType;->AudioAttributesImplBaseParcelizer:Z

    .line 2287
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    const/4 v5, 0x0

    iput-boolean v5, v4, Lo/erasedType;->AudioAttributesImplApi21Parcelizer:Z

    .line 2288
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-direct {p0, p3, v4, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Lo/erasedType;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    .line 2289
    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:Z

    .line 2291
    invoke-virtual {v0, v3, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(II)Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_69

    if-eq p3, p1, :cond_69

    return-object p3

    .line 2299
    :cond_69
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(I)Z

    move-result p3

    if-eqz p3, :cond_84

    .line 2300
    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    sub-int/2addr p3, v2

    :goto_72
    if-ltz p3, :cond_99

    .line 2301
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object p4, p4, p3

    invoke-virtual {p4, v3, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_81

    if-eq p4, p1, :cond_81

    return-object p4

    :cond_81
    add-int/lit8 p3, p3, -0x1

    goto :goto_72

    :cond_84
    move p3, v5

    .line 2307
    :goto_85
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge p3, p4, :cond_99

    .line 2308
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object p4, p4, p3

    invoke-virtual {p4, v3, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_96

    if-eq p4, p1, :cond_96

    return-object p4

    :cond_96
    add-int/lit8 p3, p3, 0x1

    goto :goto_85

    .line 2319
    :cond_99
    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    const/4 p4, -0x1

    if-ne p2, p4, :cond_a0

    move p4, v2

    goto :goto_a1

    :cond_a0
    move p4, v5

    :goto_a1
    xor-int/2addr p3, v2

    if-ne p3, p4, :cond_a6

    move p3, v2

    goto :goto_a7

    :cond_a6
    move p3, v5

    :goto_a7
    if-eqz p3, :cond_ae

    .line 2323
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read()I

    move-result p4

    goto :goto_b2

    .line 2324
    :cond_ae
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write()I

    move-result p4

    .line 2322
    :goto_b2
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_bb

    if-eq p4, p1, :cond_bb

    return-object p4

    .line 2330
    :cond_bb
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(I)Z

    move-result p2

    if-eqz p2, :cond_e9

    .line 2331
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    sub-int/2addr p2, v2

    :goto_c4
    if-ltz p2, :cond_10c

    .line 2332
    iget p4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    if-eq p2, p4, :cond_e6

    if-eqz p3, :cond_d5

    .line 2336
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object p4, p4, p2

    invoke-virtual {p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read()I

    move-result p4

    goto :goto_dd

    .line 2337
    :cond_d5
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object p4, p4, p2

    invoke-virtual {p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write()I

    move-result p4

    .line 2335
    :goto_dd
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_e6

    if-eq p4, p1, :cond_e6

    return-object p4

    :cond_e6
    add-int/lit8 p2, p2, -0x1

    goto :goto_c4

    .line 2343
    :cond_e9
    :goto_e9
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v5, p2, :cond_10c

    if-eqz p3, :cond_f8

    .line 2345
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object p2, p2, v5

    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read()I

    move-result p2

    goto :goto_100

    .line 2346
    :cond_f8
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object p2, p2, v5

    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write()I

    move-result p2

    .line 2344
    :goto_100
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_109

    if-eq p2, p1, :cond_109

    return-object p2

    :cond_109
    add-int/lit8 v5, v5, 0x1

    goto :goto_e9

    :cond_10c
    return-object v1
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 3

    .line 2233
    new-instance p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(IILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;)V
    .registers 9

    .line 2097
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-eqz v0, :cond_5

    move p1, p2

    .line 2098
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result p2

    if-eqz p2, :cond_82

    if-eqz p1, :cond_82

    .line 2102
    invoke-direct {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(ILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 2105
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromMediaId:[I

    if-eqz p1, :cond_19

    array-length p1, p1

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge p1, p2, :cond_1f

    .line 2106
    :cond_19
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromMediaId:[I

    :cond_1f
    const/4 p1, 0x0

    move p2, p1

    move v0, p2

    .line 2110
    :goto_22
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge p2, v1, :cond_5a

    .line 2112
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v1, v1, Lo/erasedType;->IconCompatParcelizer:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_3e

    .line 2113
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v1, v1, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v2, v2, p2

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v3, v3, Lo/erasedType;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v2

    goto :goto_4e

    .line 2114
    :cond_3e
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v1, v1, p2

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v2, v2, Lo/erasedType;->write:I

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v2, v2, Lo/erasedType;->write:I

    :goto_4e
    sub-int/2addr v1, v2

    if-ltz v1, :cond_57

    .line 2117
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromMediaId:[I

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    :cond_57
    add-int/lit8 p2, p2, 0x1

    goto :goto_22

    .line 2121
    :cond_5a
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromMediaId:[I

    invoke-static {p2, p1, v0}, Ljava/util/Arrays;->sort([III)V

    :goto_5f
    if-ge p1, v0, :cond_82

    .line 2124
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    invoke-virtual {p2, p3}, Lo/erasedType;->read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Z

    move-result p2

    if-eqz p2, :cond_82

    .line 2125
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget p2, p2, Lo/erasedType;->read:I

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromMediaId:[I

    aget v1, v1, p1

    invoke-interface {p4, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;->read(II)V

    .line 2127
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v1, p2, Lo/erasedType;->read:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/erasedType;

    iget v2, v2, Lo/erasedType;->IconCompatParcelizer:I

    add-int/2addr v1, v2

    iput v1, p2, Lo/erasedType;->read:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_5f

    :cond_82
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 4

    .line 2044
    new-instance v0, Lo/deserializeKeylj4SQcc;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lo/deserializeKeylj4SQcc;-><init>(Landroid/content/Context;)V

    .line 2045
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer(I)V

    .line 2046
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onCustomAction;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    const/4 p1, 0x2

    .line 1476
    invoke-direct {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(III)V

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()Z
    .registers 2

    .line 1996
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_6

    return v0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesImplApi26Parcelizer(I)V
    .registers 4

    .line 1468
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer(I)V

    const/4 v0, 0x0

    .line 1469
    :goto_4
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v0, v1, :cond_12

    .line 1470
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_12
    return-void
.end method

.method public final AudioAttributesImplApi26Parcelizer()Z
    .registers 1

    .line 2001
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    if-nez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesImplBaseParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1111
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplApi21Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final AudioAttributesImplBaseParcelizer(I)V
    .registers 4

    .line 1460
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplBaseParcelizer(I)V

    const/4 v0, 0x0

    .line 1461
    :goto_4
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v0, v1, :cond_12

    .line 1462
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_12
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1116
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplApi26Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final IconCompatParcelizer(Landroid/graphics/Rect;II)V
    .registers 8

    .line 586
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    .line 587
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    .line 588
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_33

    .line 589
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p1, v1

    .line 590
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepareFromSearch()I

    move-result v1

    invoke-static {p3, p1, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a_(III)I

    move-result p1

    .line 591
    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    .line 592
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromUri()I

    move-result v2

    mul-int/2addr p3, v1

    add-int/2addr p3, v0

    .line 591
    invoke-static {p2, p3, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a_(III)I

    move-result p2

    goto :goto_4e

    .line 594
    :cond_33
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v0

    .line 595
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromUri()I

    move-result v0

    invoke-static {p2, p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a_(III)I

    move-result p2

    .line 596
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromUri:I

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    .line 597
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepareFromSearch()I

    move-result v2

    mul-int/2addr p1, v0

    add-int/2addr p1, v1

    .line 596
    invoke-static {p3, p1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a_(III)I

    move-result p1

    .line 599
    :goto_4e
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(II)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/os/Parcelable;)V
    .registers 4

    .line 1230
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_18

    .line 1231
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    .line 1232
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_15

    .line 1233
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->read()V

    .line 1234
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesCompatParcelizer()V

    .line 1236
    :cond_15
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    :cond_18
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 3

    .line 611
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer()V

    const/4 p1, 0x0

    .line 612
    :goto_6
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge p1, p2, :cond_14

    .line 613
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object p2, p2, p1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_6

    :cond_14
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;III)V
    .registers 5

    const/16 p1, 0x8

    .line 1492
    invoke-direct {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(III)V

    return-void
.end method

.method public final IconCompatParcelizer(Ljava/lang/String;)V
    .registers 3

    .line 527
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-nez v0, :cond_7

    .line 528
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method final IconCompatParcelizer()Z
    .registers 3

    .line 269
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_39

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplApi21Parcelizer:I

    if-eqz v0, :cond_39

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onRemoveQueueItem()Z

    move-result v0

    if-eqz v0, :cond_39

    .line 273
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPrepareFromSearch:Z

    if-eqz v0, :cond_1d

    .line 274
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatMediaItem()I

    move-result v0

    .line 275
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat()I

    goto :goto_24

    .line 277
    :cond_1d
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat()I

    move-result v0

    .line 278
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatMediaItem()I

    :goto_24
    if-nez v0, :cond_39

    .line 281
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatSearchResultReceiver()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_39

    .line 283
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer()V

    .line 284
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetShuffleMode()V

    .line 285
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    const/4 p0, 0x1

    return p0

    :cond_39
    return v1
.end method

.method public final L_()V
    .registers 2

    .line 1486
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer()V

    .line 1487
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

.method public final M_()Z
    .registers 1

    .line 943
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-nez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1096
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplApi21Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver(I)V
    .registers 2

    if-nez p1, :cond_5

    .line 316
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer()Z

    :cond_5
    return-void
.end method

.method public final RatingCompat()Z
    .registers 1

    .line 253
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplApi21Parcelizer:I

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 4

    .line 2013
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1091
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(I)Landroid/graphics/PointF;
    .registers 4

    .line 2026
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(I)I

    move-result p1

    .line 2027
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    if-nez p1, :cond_d

    const/4 p0, 0x0

    return-object p0

    .line 2031
    :cond_d
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    const/4 v1, 0x0

    if-nez p0, :cond_18

    int-to-float p0, p1

    .line 2032
    iput p0, v0, Landroid/graphics/PointF;->x:F

    .line 2033
    iput v1, v0, Landroid/graphics/PointF;->y:F

    return-object v0

    .line 2035
    :cond_18
    iput v1, v0, Landroid/graphics/PointF;->x:F

    int-to-float p0, p1

    .line 2036
    iput p0, v0, Landroid/graphics/PointF;->y:F

    return-object v0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    .line 1294
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1295
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-lez v0, :cond_2d

    const/4 v0, 0x0

    .line 1296
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(Z)Landroid/view/View;

    move-result-object v1

    .line 1297
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read(Z)Landroid/view/View;

    move-result-object p0

    if-eqz v1, :cond_2d

    if-eqz p0, :cond_2d

    .line 1301
    invoke-static {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v0

    .line 1302
    invoke-static {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    if-ge v0, p0, :cond_27

    .line 1304
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 1305
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    return-void

    .line 1307
    :cond_27
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 1308
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    :cond_2d
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    const/4 p1, 0x1

    .line 1481
    invoke-direct {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(III)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 2

    .line 2247
    instance-of p0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    return p0
.end method

.method public final onAddQueueItem()Landroid/os/Parcelable;
    .registers 5

    .line 1244
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_c

    .line 1245
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;)V

    return-object v0

    .line 1247
    :cond_c
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;-><init>()V

    .line 1248
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->IconCompatParcelizer:Z

    .line 1249
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->RemoteActionCompatParcelizer:Z

    .line 1250
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCustomAction:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->read:Z

    .line 1252
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    const/4 v2, 0x0

    if-eqz v1, :cond_38

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    if-eqz v1, :cond_38

    .line 1253
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatItemReceiver:[I

    .line 1254
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatItemReceiver:[I

    array-length v1, v1

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi26Parcelizer:I

    .line 1255
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onCommand:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesCompatParcelizer:Ljava/util/List;

    goto :goto_3a

    .line 1257
    :cond_38
    iput v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi26Parcelizer:I

    .line 1260
    :goto_3a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v1

    if-lez v1, :cond_93

    .line 1261
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-eqz v1, :cond_49

    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatMediaItem()I

    move-result v1

    goto :goto_4d

    .line 1262
    :cond_49
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaMetadataCompat()I

    move-result v1

    :goto_4d
    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    .line 1263
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v1

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplBaseParcelizer:I

    .line 1264
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 1265
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    new-array v1, v1, [I

    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi21Parcelizer:[I

    .line 1266
    :goto_5f
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge v2, v1, :cond_92

    .line 1268
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:Z

    const/high16 v3, -0x80000000

    if-eqz v1, :cond_7a

    .line 1269
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v1

    if-eq v1, v3, :cond_8b

    .line 1271
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v3}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v3

    goto :goto_8a

    .line 1274
    :cond_7a
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v1

    if-eq v1, v3, :cond_8b

    .line 1276
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v3}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v3

    :goto_8a
    sub-int/2addr v1, v3

    .line 1279
    :cond_8b
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi21Parcelizer:[I

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5f

    :cond_92
    return-object v0

    :cond_93
    const/4 p0, -0x1

    .line 1282
    iput p0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    .line 1283
    iput p0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplBaseParcelizer:I

    .line 1284
    iput v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    return-object v0
.end method

.method public final read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 4

    .line 2007
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1131
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesImplApi26Parcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final read()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 3

    .line 2222
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onAddQueueItem:I

    const/4 v0, -0x2

    const/4 v1, -0x1

    if-nez p0, :cond_c

    .line 2223
    new-instance p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    return-object p0

    .line 2226
    :cond_c
    new-instance p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {p0, v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    return-object p0
.end method

.method public final read(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 2

    .line 2238
    instance-of p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p0, :cond_c

    .line 2239
    new-instance p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object p0

    .line 2241
    :cond_c
    new-instance p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method public final read(I)V
    .registers 3

    .line 2051
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_d

    iget v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    if-eq v0, p1, :cond_d

    .line 2052
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->read()V

    .line 2054
    :cond_d
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    const/high16 p1, -0x80000000

    .line 2055
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlay:I

    .line 2056
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void
.end method

.method public final read(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 4

    .line 322
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 324
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->RemoteActionCompatParcelizer:Ljava/lang/Runnable;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/Runnable;)Z

    const/4 p2, 0x0

    .line 325
    :goto_9
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlayFromSearch:I

    if-ge p2, v0, :cond_17

    .line 326
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_9

    .line 329
    :cond_17
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 2

    .line 734
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    const/4 p1, -0x1

    .line 735
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onMediaButtonEvent:I

    const/high16 p1, -0x80000000

    .line 736
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPlay:I

    const/4 p1, 0x0

    .line 737
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->onPause:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    .line 738
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 4

    const/4 v0, 0x1

    .line 604
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Z)V

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .registers 5

    const/4 p1, 0x4

    .line 1498
    invoke-direct {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer(III)V

    return-void
.end method

###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager.AnonymousClass4 (androidx.recyclerview.widget.StaggeredGridLayoutManager$4)
.class final Landroidx/recyclerview/widget/StaggeredGridLayoutManager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V
    .registers 2

    .line 215
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$4;->write:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 218
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$4;->write:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer()Z

    return-void
.end method

###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager.AudioAttributesCompatParcelizer (androidx.recyclerview.widget.StaggeredGridLayoutManager$AudioAttributesCompatParcelizer)
.class final Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private AudioAttributesImplBaseParcelizer:I

.field private IconCompatParcelizer:I

.field final RemoteActionCompatParcelizer:I

.field final synthetic read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

.field private write:I


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V
    .registers 3

    .line 2489
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2483
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    const/high16 p1, -0x80000000

    .line 2484
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 2485
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    const/4 p1, 0x0

    .line 2486
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 2490
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method private AudioAttributesCompatParcelizer(II)I
    .registers 4

    const/4 v0, 0x1

    .line 2767
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(IIZ)I

    move-result p0

    return p0
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 4

    .line 2539
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 2540
    invoke-static {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    move-result-object v1

    .line 2541
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v2, v0}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    .line 2542
    iget-boolean p0, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    return-void
.end method

.method private MediaBrowserCompatItemReceiver()V
    .registers 4

    .line 2505
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 2506
    invoke-static {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    move-result-object v1

    .line 2507
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v2, v0}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 2508
    iget-boolean p0, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    return-void
.end method

.method private RatingCompat()V
    .registers 2

    const/high16 v0, -0x80000000

    .line 2615
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 2616
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    return-void
.end method

.method private write(IIZ)I
    .registers 13

    .line 2730
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object p3, p3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {p3}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p3

    .line 2731
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-le p2, p1, :cond_16

    move v3, v2

    goto :goto_17

    :cond_16
    move v3, v1

    :goto_17
    if-eq p1, p2, :cond_49

    .line 2734
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 2735
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v5, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v5, v4}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v5

    .line 2736
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v6, v4}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v6

    const/4 v7, 0x0

    if-gt v5, v0, :cond_36

    move v8, v2

    goto :goto_37

    :cond_36
    move v8, v7

    :goto_37
    if-lt v6, p3, :cond_3a

    move v7, v2

    :cond_3a
    if-eqz v8, :cond_47

    if-eqz v7, :cond_47

    if-lt v5, p3, :cond_42

    if-le v6, v0, :cond_47

    .line 2753
    :cond_42
    invoke-static {v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result p0

    return p0

    :cond_47
    add-int/2addr p1, v3

    goto :goto_17

    :cond_49
    return v1
.end method

.method static write(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;
    .registers 1

    .line 2655
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    return-object p0
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(I)I
    .registers 4

    .line 2494
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_7

    return v0

    .line 2497
    :cond_7
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-nez v0, :cond_10

    return p1

    .line 2500
    :cond_10
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver()V

    .line 2501
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    return p0
.end method

.method final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 2609
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 2610
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RatingCompat()V

    const/4 v0, 0x0

    .line 2611
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    return-void
.end method

.method final AudioAttributesImplApi21Parcelizer()I
    .registers 3

    .line 2519
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_7

    return v0

    .line 2522
    :cond_7
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver()V

    .line 2523
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    return p0
.end method

.method final AudioAttributesImplApi26Parcelizer()V
    .registers 5

    .line 2624
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 2625
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 2626
    invoke-static {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    move-result-object v2

    const/4 v3, 0x0

    .line 2627
    iput-object v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    .line 2628
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v3

    if-nez v3, :cond_23

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->P_()Z

    move-result v2

    if-eqz v2, :cond_30

    .line 2629
    :cond_23
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v3, v1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v2, v1

    iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    :cond_30
    const/high16 v1, -0x80000000

    const/4 v2, 0x1

    if-ne v0, v2, :cond_37

    .line 2632
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 2634
    :cond_37
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    return-void
.end method

.method final AudioAttributesImplBaseParcelizer()V
    .registers 5

    .line 2638
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 2639
    invoke-static {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    move-result-object v1

    const/4 v2, 0x0

    .line 2640
    iput-object v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    .line 2641
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/high16 v3, -0x80000000

    if-nez v2, :cond_1c

    .line 2642
    iput v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    .line 2644
    :cond_1c
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v2

    if-nez v2, :cond_28

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->P_()Z

    move-result v1

    if-eqz v1, :cond_35

    .line 2645
    :cond_28
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v2, v0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v0

    sub-int/2addr v1, v0

    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 2647
    :cond_35
    iput v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    return-void
.end method

.method public final IconCompatParcelizer()I
    .registers 1

    .line 2651
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    return p0
.end method

.method final IconCompatParcelizer(I)I
    .registers 4

    .line 2527
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_7

    return v0

    .line 2530
    :cond_7
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-nez v0, :cond_10

    return p1

    .line 2534
    :cond_10
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 2535
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    return p0
.end method

.method final RemoteActionCompatParcelizer()I
    .registers 3

    .line 2553
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_7

    return v0

    .line 2556
    :cond_7
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 2557
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    return p0
.end method

.method final RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 6

    .line 2574
    invoke-static {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    move-result-object v0

    .line 2575
    iput-object p0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    .line 2576
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const/high16 v1, -0x80000000

    .line 2577
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    .line 2578
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1a

    .line 2579
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 2581
    :cond_1a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v1

    if-nez v1, :cond_27

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->P_()Z

    move-result v0

    if-nez v0, :cond_27

    return-void

    .line 2582
    :cond_27
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1, p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    return-void
.end method

.method public final read()I
    .registers 3

    .line 2674
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    if-eqz v0, :cond_14

    .line 2675
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(II)I

    move-result p0

    return p0

    .line 2676
    :cond_14
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(II)I

    move-result p0

    return p0
.end method

.method final read(I)V
    .registers 2

    .line 2620
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    return-void
.end method

.method final read(Landroid/view/View;)V
    .registers 6

    .line 2561
    invoke-static {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    move-result-object v0

    .line 2562
    iput-object p0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    .line 2563
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Ljava/util/AbstractList;->add(ILjava/lang/Object;)V

    const/high16 v1, -0x80000000

    .line 2564
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 2565
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1b

    .line 2566
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    .line 2568
    :cond_1b
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v1

    if-nez v1, :cond_28

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->P_()Z

    move-result v0

    if-nez v0, :cond_28

    return-void

    .line 2569
    :cond_28
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v1, p1}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    return-void
.end method

.method final read(ZI)V
    .registers 6

    const/high16 v0, -0x80000000

    if-eqz p1, :cond_9

    .line 2590
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v1

    goto :goto_d

    .line 2592
    :cond_9
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v1

    .line 2594
    :goto_d
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    if-eq v1, v0, :cond_32

    if-eqz p1, :cond_1e

    .line 2598
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v2}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v2

    if-lt v1, v2, :cond_32

    :cond_1e
    if-nez p1, :cond_2b

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    .line 2599
    invoke-virtual {p1}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result p1

    if-le v1, p1, :cond_2b

    goto :goto_32

    :cond_2b
    if-eq p2, v0, :cond_2e

    add-int/2addr v1, p2

    .line 2605
    :cond_2e
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    :cond_32
    :goto_32
    return-void
.end method

.method public final write()I
    .registers 3

    .line 2692
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    if-eqz v0, :cond_12

    .line 2693
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(II)I

    move-result p0

    return p0

    .line 2694
    :cond_12
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(II)I

    move-result p0

    return p0
.end method

.method public final write(II)Landroid/view/View;
    .registers 7

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_38

    .line 2777
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    const/4 v0, 0x0

    :goto_b
    if-ge v0, p2, :cond_37

    .line 2779
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 2780
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-boolean v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    if-eqz v3, :cond_21

    invoke-static {v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v3

    if-le v3, p1, :cond_37

    :cond_21
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-boolean v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    if-nez v3, :cond_2d

    .line 2781
    invoke-static {v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v3

    if-ge v3, p1, :cond_37

    .line 2784
    :cond_2d
    invoke-virtual {v2}, Landroid/view/View;->hasFocusable()Z

    move-result v3

    if-eqz v3, :cond_37

    add-int/lit8 v0, v0, 0x1

    move-object v1, v2

    goto :goto_b

    :cond_37
    return-object v1

    .line 2791
    :cond_38
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_40
    if-ltz p2, :cond_6c

    .line 2792
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 2793
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-boolean v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    if-eqz v2, :cond_56

    invoke-static {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v2

    if-ge v2, p1, :cond_6c

    :cond_56
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-boolean v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->IconCompatParcelizer:Z

    if-nez v2, :cond_62

    .line 2794
    invoke-static {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v2

    if-le v2, p1, :cond_6c

    .line 2797
    :cond_62
    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result v2

    if-eqz v2, :cond_6c

    add-int/lit8 p2, p2, -0x1

    move-object v1, v0

    goto :goto_40

    :cond_6c
    return-object v1
.end method

.method final write(I)V
    .registers 4

    .line 2659
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_9

    add-int/2addr v0, p1

    .line 2660
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 2662
    :cond_9
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    if-eq v0, v1, :cond_10

    add-int/2addr v0, p1

    .line 2663
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->write:I

    :cond_10
    return-void
.end method

###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer (androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer)
.class final Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:[I

.field AudioAttributesImplApi26Parcelizer:Z

.field IconCompatParcelizer:I

.field final synthetic MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

.field RemoteActionCompatParcelizer:Z

.field read:Z

.field write:I


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V
    .registers 2

    .line 3243
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3244
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    return-void
.end method


# virtual methods
.method final IconCompatParcelizer([Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;)V
    .registers 7

    .line 3259
    array-length v0, p1

    .line 3260
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[I

    if-eqz v1, :cond_8

    array-length v1, v1

    if-ge v1, v0, :cond_11

    .line 3261
    :cond_8
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->write:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;

    array-length v1, v1

    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[I

    :cond_11
    const/4 v1, 0x0

    :goto_12
    if-ge v1, v0, :cond_23

    .line 3265
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[I

    aget-object v3, p1, v1

    const/high16 v4, -0x80000000

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_12

    :cond_23
    return-void
.end method

.method final RemoteActionCompatParcelizer()V
    .registers 3

    const/4 v0, -0x1

    .line 3248
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->write:I

    const/high16 v1, -0x80000000

    .line 3249
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    const/4 v1, 0x0

    .line 3250
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    .line 3251
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer:Z

    .line 3252
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    .line 3253
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[I

    if-eqz p0, :cond_15

    .line 3254
    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([II)V

    :cond_15
    return-void
.end method

.method final RemoteActionCompatParcelizer(I)V
    .registers 3

    .line 3275
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    if-eqz v0, :cond_10

    .line 3276
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v0

    sub-int/2addr v0, p1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    return-void

    .line 3278
    :cond_10
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    return-void
.end method

.method final read()V
    .registers 2

    .line 3270
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->read:Z

    if-eqz v0, :cond_d

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v0

    goto :goto_15

    .line 3271
    :cond_d
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->read:Lo/UIntDeserializer;

    invoke-virtual {v0}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    :goto_15
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    return-void
.end method

###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams (androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams)
.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;
.super Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field IconCompatParcelizer:Z

.field read:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;


# direct methods
.method public constructor <init>(II)V
    .registers 3

    .line 2428
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 2424
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 2

    .line 2436
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .registers 2

    .line 2432
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-void
.end method


# virtual methods
.method public final write()Z
    .registers 1

    .line 2462
    iget-boolean p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->IconCompatParcelizer:Z

    return p0
.end method

###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup)
.class final Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LazySpanLookup"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }
.end annotation


# instance fields
.field IconCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;",
            ">;"
        }
    .end annotation
.end field

.field read:[I


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2812
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    .registers 6

    .line 3006
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    .line 3009
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_c
    if-ltz v0, :cond_1e

    .line 3010
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    .line 3011
    iget v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    if-ne v3, p1, :cond_1b

    return-object v2

    :cond_1b
    add-int/lit8 v0, v0, -0x1

    goto :goto_c

    :cond_1e
    return-object v1
.end method

.method private AudioAttributesCompatParcelizer(II)V
    .registers 7

    .line 2910
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    if-eqz v0, :cond_2c

    .line 2914
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_a
    if-ltz v0, :cond_2c

    .line 2915
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    .line 2916
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    if-lt v2, p1, :cond_29

    .line 2919
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    add-int v3, p1, p2

    if-ge v2, v3, :cond_24

    .line 2920
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_29

    .line 2922
    :cond_24
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    sub-int/2addr v2, p2

    iput v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    :cond_29
    :goto_29
    add-int/lit8 v0, v0, -0x1

    goto :goto_a

    :cond_2c
    return-void
.end method

.method private IconCompatParcelizer(II)V
    .registers 6

    .line 2940
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    if-eqz v0, :cond_20

    .line 2943
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_a
    if-ltz v0, :cond_20

    .line 2944
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    .line 2945
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    if-lt v2, p1, :cond_1d

    .line 2948
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    add-int/2addr v2, p2

    iput v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    :cond_1d
    add-int/lit8 v0, v0, -0x1

    goto :goto_a

    :cond_20
    return-void
.end method

.method private MediaBrowserCompatItemReceiver(I)I
    .registers 2

    .line 2871
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    array-length p0, p0

    :goto_3
    if-gt p0, p1, :cond_8

    shl-int/lit8 p0, p0, 0x1

    goto :goto_3

    :cond_8
    return p0
.end method

.method private RemoteActionCompatParcelizer(I)I
    .registers 6

    .line 2957
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    const/4 v1, -0x1

    if-nez v0, :cond_6

    return v1

    .line 2960
    :cond_6
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->AudioAttributesCompatParcelizer(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 2963
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2966
    :cond_11
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_18
    if-ge v2, v0, :cond_29

    .line 2968
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    .line 2969
    iget v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    if-ge v3, p1, :cond_2a

    add-int/lit8 v2, v2, 0x1

    goto :goto_18

    :cond_29
    move v2, v1

    :cond_2a
    if-eq v2, v1, :cond_3c

    .line 2975
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    .line 2976
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {p0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2977
    iget p0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    return p0

    :cond_3c
    return v1
.end method

.method private read(I)V
    .registers 6

    .line 2879
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    const/4 v1, -0x1

    if-nez v0, :cond_15

    const/16 v0, 0xa

    .line 2880
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    .line 2881
    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([II)V

    return-void

    .line 2882
    :cond_15
    array-length v2, v0

    if-lt p1, v2, :cond_2c

    .line 2884
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->MediaBrowserCompatItemReceiver(I)I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    .line 2885
    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2886
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    array-length p1, v0

    array-length v0, p0

    invoke-static {p0, p1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    :cond_2c
    return-void
.end method


# virtual methods
.method final IconCompatParcelizer(I)I
    .registers 5

    .line 2838
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    const/4 v1, -0x1

    if-nez v0, :cond_6

    return v1

    .line 2841
    :cond_6
    array-length v0, v0

    if-lt p1, v0, :cond_a

    return v1

    .line 2844
    :cond_a
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->RemoteActionCompatParcelizer(I)I

    move-result v0

    if-ne v0, v1, :cond_1a

    .line 2846
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    array-length v2, v0

    invoke-static {v0, p1, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 2847
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    array-length p0, p0

    return p0

    :cond_1a
    add-int/lit8 v0, v0, 0x1

    .line 2851
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    array-length v2, v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 2852
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    invoke-static {p0, p1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    return v0
.end method

.method final IconCompatParcelizer()V
    .registers 3

    .line 2891
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    if-eqz v0, :cond_8

    const/4 v1, -0x1

    .line 2892
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_8
    const/4 v0, 0x0

    .line 2894
    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method final IconCompatParcelizer(ILandroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;)V
    .registers 3

    .line 2866
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read(I)V

    .line 2867
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    iget p2, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    aput p2, p0, p1

    return-void
.end method

.method final read(II)V
    .registers 7

    .line 2898
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    if-eqz v0, :cond_20

    array-length v0, v0

    if-ge p1, v0, :cond_20

    add-int v0, p1, p2

    .line 2901
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read(I)V

    .line 2902
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2904
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    array-length v1, v0

    sub-int/2addr v1, p2

    array-length v2, v0

    const/4 v3, -0x1

    invoke-static {v0, v1, v2, v3}, Ljava/util/Arrays;->fill([IIII)V

    .line 2906
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->AudioAttributesCompatParcelizer(II)V

    :cond_20
    return-void
.end method

.method final write(I)I
    .registers 3

    .line 2858
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    if-eqz p0, :cond_a

    array-length v0, p0

    if-ge p1, v0, :cond_a

    .line 2861
    aget p0, p0, p1

    return p0

    :cond_a
    const/4 p0, -0x1

    return p0
.end method

.method final write(II)V
    .registers 6

    .line 2928
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    if-eqz v0, :cond_1d

    array-length v0, v0

    if-ge p1, v0, :cond_1d

    add-int v0, p1, p2

    .line 2931
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read(I)V

    .line 2932
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2934
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->read:[I

    const/4 v2, -0x1

    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 2936
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->IconCompatParcelizer(II)V

    :cond_1d
    return-void
.end method

###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)
.class Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FullSpanItem"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:Z

.field IconCompatParcelizer:I

.field RemoteActionCompatParcelizer:I

.field private write:[I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 3105
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;-><init>()V

    sput-object v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .registers 1

    .line 3070
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 3059
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3060
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    .line 3061
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->IconCompatParcelizer:I

    .line 3062
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_17

    const/4 v1, 0x0

    :cond_17
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->AudioAttributesCompatParcelizer:Z

    .line 3063
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-lez v0, :cond_26

    .line 3065
    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->write:[I

    .line 3066
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_26
    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 3097
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FullSpanItem{mPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGapDir="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->IconCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHasUnwantedGapAfter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->AudioAttributesCompatParcelizer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mGapPerSpan="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->write:[I

    .line 3101
    invoke-static {p0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x7d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    .line 3084
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3085
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->IconCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3086
    iget-boolean p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->AudioAttributesCompatParcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3087
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->write:[I

    if-eqz p2, :cond_20

    array-length v0, p2

    if-lez v0, :cond_20

    .line 3088
    array-length p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3089
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->write:[I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeIntArray([I)V

    return-void

    :cond_20
    const/4 p0, 0x0

    .line 3091
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.AnonymousClass1 (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1)
.class final Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 3106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    .registers 2

    .line 3109
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static read(I)[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    .registers 1

    .line 3114
    new-array p0, p0, [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 3106
    invoke-static {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 3106
    invoke-static {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;->read(I)[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState (androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState)
.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;",
            ">;"
        }
    .end annotation
.end field

.field AudioAttributesImplApi21Parcelizer:[I

.field AudioAttributesImplApi26Parcelizer:I

.field AudioAttributesImplBaseParcelizer:I

.field IconCompatParcelizer:Z

.field MediaBrowserCompatCustomActionResultReceiver:I

.field MediaBrowserCompatItemReceiver:[I

.field RemoteActionCompatParcelizer:Z

.field read:Z

.field write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 3215
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState$2;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState$2;-><init>()V

    sput-object v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 3138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 5

    .line 3141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3142
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    .line 3143
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplBaseParcelizer:I

    .line 3144
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    if-lez v0, :cond_1e

    .line 3146
    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi21Parcelizer:[I

    .line 3147
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V

    .line 3150
    :cond_1e
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi26Parcelizer:I

    if-lez v0, :cond_2d

    .line 3152
    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatItemReceiver:[I

    .line 3153
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V

    .line 3155
    :cond_2d
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_37

    move v0, v2

    goto :goto_38

    :cond_37
    move v0, v1

    :goto_38
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->IconCompatParcelizer:Z

    .line 3156
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v2, :cond_42

    move v0, v2

    goto :goto_43

    :cond_42
    move v0, v1

    :goto_43
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->RemoteActionCompatParcelizer:Z

    .line 3157
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v2, :cond_4c

    move v1, v2

    :cond_4c
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->read:Z

    .line 3160
    const-class v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object p1

    .line 3161
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;)V
    .registers 3

    .line 3164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3165
    iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 3166
    iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    .line 3167
    iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplBaseParcelizer:I

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplBaseParcelizer:I

    .line 3168
    iget-object v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi21Parcelizer:[I

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi21Parcelizer:[I

    .line 3169
    iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi26Parcelizer:I

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi26Parcelizer:I

    .line 3170
    iget-object v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatItemReceiver:[I

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatItemReceiver:[I

    .line 3171
    iget-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->IconCompatParcelizer:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->IconCompatParcelizer:Z

    .line 3172
    iget-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->RemoteActionCompatParcelizer:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->RemoteActionCompatParcelizer:Z

    .line 3173
    iget-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->read:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->read:Z

    .line 3174
    iget-object p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesCompatParcelizer:Ljava/util/List;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesCompatParcelizer:Ljava/util/List;

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()V
    .registers 3

    const/4 v0, 0x0

    .line 3178
    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi21Parcelizer:[I

    const/4 v1, 0x0

    .line 3179
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 3180
    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi26Parcelizer:I

    .line 3181
    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatItemReceiver:[I

    .line 3182
    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method final read()V
    .registers 2

    const/4 v0, 0x0

    .line 3186
    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi21Parcelizer:[I

    const/4 v0, 0x0

    .line 3187
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    const/4 v0, -0x1

    .line 3188
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    .line 3189
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplBaseParcelizer:I

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 3199
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->write:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3200
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplBaseParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3201
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3202
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    if-lez p2, :cond_18

    .line 3203
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi21Parcelizer:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 3205
    :cond_18
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3206
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesImplApi26Parcelizer:I

    if-lez p2, :cond_26

    .line 3207
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->MediaBrowserCompatItemReceiver:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 3209
    :cond_26
    iget-boolean p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->IconCompatParcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3210
    iget-boolean p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->RemoteActionCompatParcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3211
    iget-boolean p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->read:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3212
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->AudioAttributesCompatParcelizer:Ljava/util/List;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    return-void
.end method

###### Class androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.AnonymousClass2 (androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$2)
.class final Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 3216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
    .registers 2

    .line 3219
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
    .registers 1

    .line 3224
    new-array p0, p0, [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 3216
    invoke-static {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState$2;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 3216
    invoke-static {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState$2;->RemoteActionCompatParcelizer(I)[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    move-result-object p0

    return-object p0
.end method
