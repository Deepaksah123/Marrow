###### Class androidx.appcompat.widget.ActionMenuPresenter (androidx.appcompat.widget.ActionMenuPresenter)
.class public Landroidx/appcompat/widget/ActionMenuPresenter;
.super Lo/onConfigurationChanged;
.source "SourceFile"

# interfaces
.implements Lo/ThrowableDeserializer$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;,
        Landroidx/appcompat/widget/ActionMenuPresenter$read;,
        Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;,
        Landroidx/appcompat/widget/ActionMenuPresenter$write;,
        Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;,
        Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;,
        Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;
    }
.end annotation


# instance fields
.field AudioAttributesImplApi21Parcelizer:I

.field AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

.field AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

.field IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;

.field MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

.field final MediaBrowserCompatItemReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;

.field private MediaBrowserCompatMediaItem:I

.field private MediaBrowserCompatSearchResultReceiver:Z

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field private MediaDescriptionCompat:Z

.field private MediaMetadataCompat:I

.field private final RatingCompat:Landroid/util/SparseBooleanArray;

.field private handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/drawable/Drawable;

.field private onAddQueueItem:Z

.field private onCommand:Z

.field private onCustomAction:Landroidx/appcompat/widget/ActionMenuPresenter$read;

.field private onFastForward:Z

.field private onPause:Z

.field private onPlay:Z

.field private onPlayFromMediaId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    .line 87
    sget v0, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_action_menu_layout:I

    sget v1, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_action_menu_item_layout:I

    invoke-direct {p0, p1, v0, v1}, Lo/onConfigurationChanged;-><init>(Landroid/content/Context;II)V

    .line 75
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->RatingCompat:Landroid/util/SparseBooleanArray;

    .line 83
    new-instance p1, Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p1, p0}, Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;)V

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatItemReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;
    .registers 1

    .line 54
    iget-object p0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    return-object p0
.end method

.method static synthetic AudioAttributesImplApi21Parcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/registerForActivityResult;
    .registers 1

    .line 54
    iget-object p0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    return-object p0
.end method

.method static synthetic AudioAttributesImplApi26Parcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;
    .registers 1

    .line 54
    iget-object p0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    return-object p0
.end method

.method static synthetic IconCompatParcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;
    .registers 1

    .line 54
    iget-object p0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    return-object p0
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/MenuItem;)Landroid/view/View;
    .registers 7

    .line 317
    iget-object p0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    if-nez p0, :cond_8

    return-object v0

    .line 320
    :cond_8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_d
    if-ge v2, v1, :cond_24

    .line 322
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 323
    instance-of v4, v3, Lo/registerForActivityResult$AudioAttributesCompatParcelizer;

    if-eqz v4, :cond_21

    move-object v4, v3

    check-cast v4, Lo/registerForActivityResult$AudioAttributesCompatParcelizer;

    .line 324
    invoke-interface {v4}, Lo/registerForActivityResult$AudioAttributesCompatParcelizer;->IconCompatParcelizer()Lo/onRetainNonConfigurationInstance;

    move-result-object v4

    if-ne v4, p1, :cond_21

    return-object v3

    :cond_21
    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_24
    return-object v0
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/registerForActivityResult;
    .registers 1

    .line 54
    iget-object p0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    return-object p0
.end method

.method static synthetic read(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;
    .registers 1

    .line 54
    iget-object p0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    return-object p0
.end method

.method static synthetic write(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;
    .registers 1

    .line 54
    iget-object p0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Z)V
    .registers 6

    .line 226
    invoke-super {p0, p1}, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer(Z)V

    .line 228
    iget-object p1, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 230
    iget-object p1, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    const/4 v0, 0x0

    if-eqz p1, :cond_2e

    .line 231
    iget-object p1, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    invoke-virtual {p1}, Lo/onRequestPermissionsResult;->RemoteActionCompatParcelizer()Ljava/util/ArrayList;

    move-result-object p1

    .line 232
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    move v2, v0

    :goto_1a
    if-ge v2, v1, :cond_2e

    .line 234
    invoke-virtual {p1, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v3}, Lo/onRetainNonConfigurationInstance;->RemoteActionCompatParcelizer()Lo/ThrowableDeserializer;

    move-result-object v3

    if-eqz v3, :cond_2b

    .line 236
    invoke-virtual {v3, p0}, Lo/ThrowableDeserializer;->RemoteActionCompatParcelizer(Lo/ThrowableDeserializer$RemoteActionCompatParcelizer;)V

    :cond_2b
    add-int/lit8 v2, v2, 0x1

    goto :goto_1a

    .line 241
    :cond_2e
    iget-object p1, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    if-eqz p1, :cond_39

    .line 242
    iget-object p1, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    invoke-virtual {p1}, Lo/onRequestPermissionsResult;->MediaBrowserCompatCustomActionResultReceiver()Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_3a

    :cond_39
    const/4 p1, 0x0

    .line 245
    :goto_3a
    iget-boolean v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onAddQueueItem:Z

    if-eqz v1, :cond_85

    if-eqz p1, :cond_85

    .line 246
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_55

    .line 248
    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/onRetainNonConfigurationInstance;

    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->isActionViewExpanded()Z

    move-result p1

    xor-int/2addr p1, v2

    if-eqz p1, :cond_85

    goto :goto_57

    :cond_55
    if-lez v1, :cond_85

    .line 255
    :goto_57
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    if-nez p1, :cond_64

    .line 256
    new-instance p1, Landroidx/appcompat/widget/ActionMenuPresenter$write;

    iget-object v0, p0, Lo/onConfigurationChanged;->write:Landroid/content/Context;

    invoke-direct {p1, p0, v0}, Landroidx/appcompat/widget/ActionMenuPresenter$write;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;)V

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    .line 258
    :cond_64
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 259
    iget-object v0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    if-eq p1, v0, :cond_9a

    if-eqz p1, :cond_77

    .line 261
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 263
    :cond_77
    iget-object p1, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    .line 264
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->write()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_9a

    .line 266
    :cond_85
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    if-eqz p1, :cond_9a

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    if-ne p1, v0, :cond_9a

    .line 267
    iget-object p1, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 270
    :cond_9a
    :goto_9a
    iget-object p1, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-boolean p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onAddQueueItem:Z

    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowReserved(Z)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer()Z
    .registers 18

    move-object/from16 v0, p0

    .line 413
    iget-object v1, v0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_13

    .line 414
    iget-object v1, v0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    invoke-virtual {v1}, Lo/onRequestPermissionsResult;->MediaDescriptionCompat()Ljava/util/ArrayList;

    move-result-object v1

    .line 415
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    goto :goto_15

    :cond_13
    move-object v1, v2

    move v4, v3

    .line 421
    :goto_15
    iget v5, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaMetadataCompat:I

    .line 422
    iget v6, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatMediaItem:I

    .line 423
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 424
    iget-object v8, v0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    check-cast v8, Landroid/view/ViewGroup;

    move v9, v3

    move v10, v9

    move v11, v10

    move v12, v11

    :goto_25
    const/4 v13, 0x1

    if-ge v9, v4, :cond_4f

    .line 431
    invoke-virtual {v1, v9}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lo/onRetainNonConfigurationInstance;

    .line 432
    invoke-virtual {v14}, Lo/onRetainNonConfigurationInstance;->MediaBrowserCompatMediaItem()Z

    move-result v15

    if-eqz v15, :cond_37

    add-int/lit8 v11, v11, 0x1

    goto :goto_41

    .line 434
    :cond_37
    invoke-virtual {v14}, Lo/onRetainNonConfigurationInstance;->MediaBrowserCompatItemReceiver()Z

    move-result v15

    if-eqz v15, :cond_40

    add-int/lit8 v12, v12, 0x1

    goto :goto_41

    :cond_40
    move v10, v13

    .line 439
    :goto_41
    iget-boolean v13, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaDescriptionCompat:Z

    if-eqz v13, :cond_4c

    invoke-virtual {v14}, Lo/onRetainNonConfigurationInstance;->isActionViewExpanded()Z

    move-result v13

    if-eqz v13, :cond_4c

    move v5, v3

    :cond_4c
    add-int/lit8 v9, v9, 0x1

    goto :goto_25

    .line 447
    :cond_4f
    iget-boolean v9, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->onAddQueueItem:Z

    if-eqz v9, :cond_5a

    if-nez v10, :cond_58

    add-int/2addr v12, v11

    if-le v12, v5, :cond_5a

    :cond_58
    add-int/lit8 v5, v5, -0x1

    :cond_5a
    sub-int/2addr v5, v11

    .line 453
    iget-object v9, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->RatingCompat:Landroid/util/SparseBooleanArray;

    .line 454
    invoke-virtual {v9}, Landroid/util/SparseBooleanArray;->clear()V

    move v10, v3

    move v11, v10

    :goto_62
    if-ge v10, v4, :cond_107

    .line 466
    invoke-virtual {v1, v10}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/onRetainNonConfigurationInstance;

    .line 468
    invoke-virtual {v12}, Lo/onRetainNonConfigurationInstance;->MediaBrowserCompatMediaItem()Z

    move-result v14

    if-eqz v14, :cond_8e

    .line 469
    invoke-virtual {v0, v12, v2, v8}, Lo/onConfigurationChanged;->RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v14

    .line 474
    invoke-virtual {v14, v7, v7}, Landroid/view/View;->measure(II)V

    .line 476
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    sub-int/2addr v6, v14

    if-nez v11, :cond_7f

    move v11, v14

    .line 481
    :cond_7f
    invoke-virtual {v12}, Lo/onRetainNonConfigurationInstance;->getGroupId()I

    move-result v14

    if-eqz v14, :cond_88

    .line 483
    invoke-virtual {v9, v14, v13}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 485
    :cond_88
    invoke-virtual {v12, v13}, Lo/onRetainNonConfigurationInstance;->read(Z)V

    move v2, v3

    goto/16 :goto_100

    .line 486
    :cond_8e
    invoke-virtual {v12}, Lo/onRetainNonConfigurationInstance;->MediaBrowserCompatItemReceiver()Z

    move-result v14

    if-eqz v14, :cond_fc

    .line 489
    invoke-virtual {v12}, Lo/onRetainNonConfigurationInstance;->getGroupId()I

    move-result v14

    .line 490
    invoke-virtual {v9, v14}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v15

    if-gtz v5, :cond_a0

    if-eqz v15, :cond_a5

    :cond_a0
    if-lez v6, :cond_a5

    move/from16 v16, v13

    goto :goto_a7

    :cond_a5
    move/from16 v16, v3

    :goto_a7
    if-eqz v16, :cond_c1

    .line 495
    invoke-virtual {v0, v12, v2, v8}, Lo/onConfigurationChanged;->RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 504
    invoke-virtual {v3, v7, v7}, Landroid/view/View;->measure(II)V

    .line 506
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr v6, v3

    if-nez v11, :cond_b8

    move v11, v3

    :cond_b8
    add-int v3, v6, v11

    if-lez v3, :cond_be

    move v3, v13

    goto :goto_bf

    :cond_be
    const/4 v3, 0x0

    :goto_bf
    and-int v16, v16, v3

    :cond_c1
    move/from16 v3, v16

    if-eqz v3, :cond_cb

    if-eqz v14, :cond_cb

    .line 521
    invoke-virtual {v9, v14, v13}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_f3

    :cond_cb
    if-eqz v15, :cond_f3

    const/4 v15, 0x0

    .line 524
    invoke-virtual {v9, v14, v15}, Landroid/util/SparseBooleanArray;->put(IZ)V

    const/4 v15, 0x0

    :goto_d2
    if-ge v15, v10, :cond_f3

    .line 526
    invoke-virtual {v1, v15}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v2, v16

    check-cast v2, Lo/onRetainNonConfigurationInstance;

    .line 527
    invoke-virtual {v2}, Lo/onRetainNonConfigurationInstance;->getGroupId()I

    move-result v13

    if-ne v13, v14, :cond_ee

    .line 529
    invoke-virtual {v2}, Lo/onRetainNonConfigurationInstance;->AudioAttributesImplApi21Parcelizer()Z

    move-result v13

    if-eqz v13, :cond_ea

    add-int/lit8 v5, v5, 0x1

    :cond_ea
    const/4 v13, 0x0

    .line 530
    invoke-virtual {v2, v13}, Lo/onRetainNonConfigurationInstance;->read(Z)V

    :cond_ee
    add-int/lit8 v15, v15, 0x1

    const/4 v2, 0x0

    const/4 v13, 0x1

    goto :goto_d2

    :cond_f3
    :goto_f3
    if-eqz v3, :cond_f7

    add-int/lit8 v5, v5, -0x1

    .line 537
    :cond_f7
    invoke-virtual {v12, v3}, Lo/onRetainNonConfigurationInstance;->read(Z)V

    const/4 v2, 0x0

    goto :goto_100

    :cond_fc
    move v2, v3

    .line 540
    invoke-virtual {v12, v2}, Lo/onRetainNonConfigurationInstance;->read(Z)V

    :goto_100
    add-int/lit8 v10, v10, 0x1

    move v3, v2

    const/4 v2, 0x0

    const/4 v13, 0x1

    goto/16 :goto_62

    :cond_107
    move v3, v13

    return v3
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;I)Z
    .registers 5

    .line 275
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    if-ne v0, v1, :cond_a

    const/4 p0, 0x0

    return p0

    .line 276
    :cond_a
    invoke-super {p0, p1, p2}, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;I)Z

    move-result p0

    return p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()Z
    .registers 1

    .line 384
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_9

    .line 385
    invoke-virtual {p0}, Lo/onTrimMemory;->RemoteActionCompatParcelizer()V

    const/4 p0, 0x1

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Landroid/os/Parcelable;
    .registers 2

    .line 554
    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    invoke-direct {v0}, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;-><init>()V

    .line 555
    iget p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi21Parcelizer:I

    iput p0, v0, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;->AudioAttributesCompatParcelizer:I

    return-object v0
.end method

.method public final AudioAttributesImplBaseParcelizer()Z
    .registers 1

    .line 395
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Lo/onTrimMemory;->write()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final IconCompatParcelizer(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    .line 162
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    if-eqz v0, :cond_8

    .line 163
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_8
    const/4 v0, 0x1

    .line 165
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onCommand:Z

    .line 166
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/os/Parcelable;)V
    .registers 3

    .line 561
    instance-of v0, p1, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    if-eqz v0, :cond_1d

    .line 565
    check-cast p1, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    .line 566
    iget v0, p1, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;->AudioAttributesCompatParcelizer:I

    if-lez v0, :cond_1d

    .line 567
    iget-object v0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    iget p1, p1, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, p1}, Lo/onRequestPermissionsResult;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_1d

    .line 569
    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    check-cast p1, Lo/removeOnTrimMemoryListener;

    .line 570
    invoke-virtual {p0, p1}, Lo/onConfigurationChanged;->write(Lo/removeOnTrimMemoryListener;)Z

    :cond_1d
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/appcompat/widget/ActionMenuView;)V
    .registers 2

    .line 586
    iput-object p1, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    .line 587
    iget-object p0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/ActionMenuView;->RemoteActionCompatParcelizer(Lo/onRequestPermissionsResult;)V

    return-void
.end method

.method public final IconCompatParcelizer(Lo/onRequestPermissionsResult;Z)V
    .registers 3

    .line 548
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->RemoteActionCompatParcelizer()Z

    .line 549
    invoke-super {p0, p1, p2}, Lo/onConfigurationChanged;->IconCompatParcelizer(Lo/onRequestPermissionsResult;Z)V

    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()V
    .registers 2

    .line 134
    iget-object v0, p0, Lo/onConfigurationChanged;->RemoteActionCompatParcelizer:Landroid/content/Context;

    invoke-static {v0}, Lo/getFullyDrawnReporter;->RemoteActionCompatParcelizer(Landroid/content/Context;)Lo/getFullyDrawnReporter;

    move-result-object v0

    invoke-virtual {v0}, Lo/getFullyDrawnReporter;->read()I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaMetadataCompat:I

    .line 136
    iget-object v0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    if-eqz v0, :cond_16

    .line 137
    iget-object p0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/onRequestPermissionsResult;->read(Z)V

    :cond_16
    return-void
.end method

.method public final MediaBrowserCompatItemReceiver()Z
    .registers 2

    .line 399
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    if-nez v0, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer()Z

    move-result p0

    if-nez p0, :cond_c

    const/4 p0, 0x0

    return p0

    :cond_c
    const/4 p0, 0x1

    return p0
.end method

.method public final MediaBrowserCompatMediaItem()V
    .registers 2

    const/4 v0, 0x1

    .line 148
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onAddQueueItem:Z

    .line 149
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onFastForward:Z

    return-void
.end method

.method public final MediaBrowserCompatSearchResultReceiver()Z
    .registers 5

    .line 336
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onAddQueueItem:Z

    if-eqz v0, :cond_3f

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer()Z

    move-result v0

    if-nez v0, :cond_3f

    iget-object v0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    if-eqz v0, :cond_3f

    iget-object v0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    if-eqz v0, :cond_3f

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    if-nez v0, :cond_3f

    iget-object v0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    .line 337
    invoke-virtual {v0}, Lo/onRequestPermissionsResult;->MediaBrowserCompatCustomActionResultReceiver()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3f

    .line 338
    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    iget-object v1, p0, Lo/onConfigurationChanged;->RemoteActionCompatParcelizer:Landroid/content/Context;

    iget-object v2, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    iget-object v3, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    invoke-direct {v0, p0, v1, v2, v3}, Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;Lo/onRequestPermissionsResult;Landroid/view/View;)V

    .line 339
    new-instance v1, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    invoke-direct {v1, p0, v0}, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    .line 341
    iget-object v0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    check-cast v0, Landroid/view/View;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 p0, 0x1

    return p0

    :cond_3f
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 6

    .line 191
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->getActionView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 192
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->AudioAttributesImplApi26Parcelizer()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 193
    :cond_c
    invoke-super {p0, p1, p2, p3}, Lo/onConfigurationChanged;->RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 195
    :cond_10
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->isActionViewExpanded()Z

    move-result p0

    if-eqz p0, :cond_19

    const/16 p0, 0x8

    goto :goto_1a

    :cond_19
    const/4 p0, 0x0

    :goto_1a
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 197
    check-cast p3, Landroidx/appcompat/widget/ActionMenuView;

    .line 198
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    .line 199
    invoke-virtual {p3, p0}, Landroidx/appcompat/widget/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p1

    if-nez p1, :cond_30

    .line 200
    invoke-static {p0}, Landroidx/appcompat/widget/ActionMenuView;->write(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_30
    return-object v0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;)Lo/registerForActivityResult;
    .registers 3

    .line 181
    iget-object v0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    .line 182
    invoke-super {p0, p1}, Lo/onConfigurationChanged;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;)Lo/registerForActivityResult;

    move-result-object p1

    if-eq v0, p1, :cond_e

    .line 184
    move-object v0, p1

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Landroidx/appcompat/widget/ActionMenuPresenter;)V

    :cond_e
    return-object p1
.end method

.method public final RemoteActionCompatParcelizer(Z)V
    .registers 2

    .line 158
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaDescriptionCompat:Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 2

    .line 373
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->write()Z

    move-result v0

    .line 374
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi21Parcelizer()Z

    move-result p0

    or-int/2addr p0, v0

    return p0
.end method

.method public final read(Landroid/content/Context;Lo/onRequestPermissionsResult;)V
    .registers 7

    .line 92
    invoke-super {p0, p1, p2}, Lo/onConfigurationChanged;->read(Landroid/content/Context;Lo/onRequestPermissionsResult;)V

    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 96
    invoke-static {p1}, Lo/getFullyDrawnReporter;->RemoteActionCompatParcelizer(Landroid/content/Context;)Lo/getFullyDrawnReporter;

    move-result-object p1

    .line 97
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onFastForward:Z

    if-nez v0, :cond_12

    const/4 v0, 0x1

    .line 98
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onAddQueueItem:Z

    .line 102
    :cond_12
    invoke-virtual {p1}, Lo/getFullyDrawnReporter;->AudioAttributesCompatParcelizer()I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onPlayFromMediaId:I

    .line 107
    invoke-virtual {p1}, Lo/getFullyDrawnReporter;->read()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaMetadataCompat:I

    .line 110
    iget p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onPlayFromMediaId:I

    .line 111
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onAddQueueItem:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_51

    .line 112
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    if-nez v0, :cond_49

    .line 113
    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$write;

    iget-object v2, p0, Lo/onConfigurationChanged;->write:Landroid/content/Context;

    invoke-direct {v0, p0, v2}, Landroidx/appcompat/widget/ActionMenuPresenter$write;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    .line 114
    iget-boolean v2, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onCommand:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_40

    .line 115
    iget-object v2, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 116
    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/drawable/Drawable;

    .line 117
    iput-boolean v3, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onCommand:Z

    .line 119
    :cond_40
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 120
    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 122
    :cond_49
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_53

    .line 124
    :cond_51
    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    .line 127
    :goto_53
    iput p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatMediaItem:I

    .line 129
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p2, 0x42600000    # 56.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    return-void
.end method

.method public final read(Lo/onRetainNonConfigurationInstance;Lo/registerForActivityResult$AudioAttributesCompatParcelizer;)V
    .registers 3

    .line 207
    invoke-interface {p2, p1}, Lo/registerForActivityResult$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Lo/onRetainNonConfigurationInstance;)V

    .line 209
    iget-object p1, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    .line 210
    check-cast p2, Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 211
    invoke-virtual {p2, p1}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setItemInvoker(Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;)V

    .line 213
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onCustomAction:Landroidx/appcompat/widget/ActionMenuPresenter$read;

    if-nez p1, :cond_17

    .line 214
    new-instance p1, Landroidx/appcompat/widget/ActionMenuPresenter$read;

    invoke-direct {p1, p0}, Landroidx/appcompat/widget/ActionMenuPresenter$read;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;)V

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onCustomAction:Landroidx/appcompat/widget/ActionMenuPresenter$read;

    .line 216
    :cond_17
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->onCustomAction:Landroidx/appcompat/widget/ActionMenuPresenter$read;

    invoke-virtual {p2, p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setPopupCallback(Landroidx/appcompat/view/menu/ActionMenuItemView$read;)V

    return-void
.end method

.method public final read(Z)V
    .registers 2

    if-eqz p1, :cond_7

    const/4 p1, 0x0

    .line 579
    invoke-super {p0, p1}, Lo/onConfigurationChanged;->write(Lo/removeOnTrimMemoryListener;)Z

    return-void

    .line 580
    :cond_7
    iget-object p1, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    if-eqz p1, :cond_11

    .line 581
    iget-object p0, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lo/onRequestPermissionsResult;->RemoteActionCompatParcelizer(Z)V

    :cond_11
    return-void
.end method

.method public final write()Z
    .registers 4

    .line 354
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    const/4 v1, 0x1

    if-eqz v0, :cond_16

    iget-object v0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    if-eqz v0, :cond_16

    .line 355
    iget-object v0, p0, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer:Lo/registerForActivityResult;

    check-cast v0, Landroid/view/View;

    iget-object v2, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 356
    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    return v1

    .line 360
    :cond_16
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    if-eqz p0, :cond_1e

    .line 362
    invoke-virtual {p0}, Lo/onTrimMemory;->RemoteActionCompatParcelizer()V

    return v1

    :cond_1e
    const/4 p0, 0x0

    return p0
.end method

.method public final write(Lo/onRetainNonConfigurationInstance;)Z
    .registers 2

    .line 221
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->AudioAttributesImplApi21Parcelizer()Z

    move-result p0

    return p0
.end method

.method public final write(Lo/removeOnTrimMemoryListener;)Z
    .registers 9

    .line 281
    invoke-virtual {p1}, Lo/onRequestPermissionsResult;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    :cond_8
    move-object v0, p1

    .line 284
    :goto_9
    invoke-virtual {v0}, Lo/removeOnTrimMemoryListener;->onPlay()Landroid/view/Menu;

    move-result-object v2

    iget-object v3, p0, Lo/onConfigurationChanged;->read:Lo/onRequestPermissionsResult;

    if-eq v2, v3, :cond_18

    .line 285
    invoke-virtual {v0}, Lo/removeOnTrimMemoryListener;->onPlay()Landroid/view/Menu;

    move-result-object v0

    check-cast v0, Lo/removeOnTrimMemoryListener;

    goto :goto_9

    .line 287
    :cond_18
    invoke-virtual {v0}, Lo/removeOnTrimMemoryListener;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->RemoteActionCompatParcelizer(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_23

    return v1

    .line 296
    :cond_23
    invoke-virtual {p1}, Lo/removeOnTrimMemoryListener;->getItem()Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    iput v2, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi21Parcelizer:I

    .line 299
    invoke-virtual {p1}, Lo/onRequestPermissionsResult;->size()I

    move-result v2

    move v3, v1

    :goto_32
    const/4 v4, 0x1

    if-ge v3, v2, :cond_4a

    .line 301
    invoke-virtual {p1, v3}, Lo/onRequestPermissionsResult;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    .line 302
    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eqz v6, :cond_47

    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_47

    move v1, v4

    goto :goto_4a

    :cond_47
    add-int/lit8 v3, v3, 0x1

    goto :goto_32

    .line 308
    :cond_4a
    :goto_4a
    new-instance v2, Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;

    iget-object v3, p0, Lo/onConfigurationChanged;->RemoteActionCompatParcelizer:Landroid/content/Context;

    invoke-direct {v2, p0, v3, p1, v0}, Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;Lo/removeOnTrimMemoryListener;Landroid/view/View;)V

    iput-object v2, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;

    .line 309
    invoke-virtual {v2, v1}, Lo/onTrimMemory;->RemoteActionCompatParcelizer(Z)V

    .line 310
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;

    invoke-virtual {v0}, Lo/onTrimMemory;->MediaBrowserCompatItemReceiver()V

    .line 312
    invoke-super {p0, p1}, Lo/onConfigurationChanged;->write(Lo/removeOnTrimMemoryListener;)Z

    return v4
.end method

###### Class androidx.appcompat.widget.ActionMenuPresenter.AudioAttributesCompatParcelizer (androidx.appcompat.widget.ActionMenuPresenter$AudioAttributesCompatParcelizer)
.class final Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;
.super Lo/onTrimMemory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field final synthetic write:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;Lo/onRequestPermissionsResult;Landroid/view/View;)V
    .registers 11

    .line 715
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v4, 0x1

    .line 716
    sget v5, Lo/_init_lambda5$read;->actionOverflowMenuStyle:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Lo/onTrimMemory;-><init>(Landroid/content/Context;Lo/onRequestPermissionsResult;Landroid/view/View;ZI)V

    .line 717
    invoke-virtual {p0}, Lo/onTrimMemory;->read()V

    .line 718
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatItemReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p1}, Lo/onTrimMemory;->AudioAttributesCompatParcelizer(Lo/peekAvailableContext$AudioAttributesCompatParcelizer;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 723
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-static {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 724
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-static {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->read(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;

    move-result-object v0

    invoke-virtual {v0}, Lo/onRequestPermissionsResult;->close()V

    .line 726
    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    .line 728
    invoke-super {p0}, Lo/onTrimMemory;->AudioAttributesCompatParcelizer()V

    return-void
.end method

###### Class androidx.appcompat.widget.ActionMenuPresenter.IconCompatParcelizer (androidx.appcompat.widget.ActionMenuPresenter$IconCompatParcelizer)
.class final Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

.field final synthetic IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;)V
    .registers 3

    .line 782
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 783
    iput-object p2, p0, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 788
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-static {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesCompatParcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 789
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-static {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;

    move-result-object v0

    invoke-virtual {v0}, Lo/onRequestPermissionsResult;->read()V

    .line 791
    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-static {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi21Parcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/registerForActivityResult;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_2f

    .line 792
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_2f

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    invoke-virtual {v0}, Lo/onTrimMemory;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 793
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    iput-object v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    .line 795
    :cond_2f
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    return-void
.end method

###### Class androidx.appcompat.widget.ActionMenuPresenter.MediaBrowserCompatCustomActionResultReceiver (androidx.appcompat.widget.ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver)
.class final Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/peekAvailableContext$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter;)V
    .registers 2

    .line 755
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;->read:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/onRequestPermissionsResult;Z)V
    .registers 5

    .line 769
    instance-of v0, p1, Lo/removeOnTrimMemoryListener;

    if-eqz v0, :cond_c

    .line 770
    invoke-virtual {p1}, Lo/onRequestPermissionsResult;->MediaBrowserCompatMediaItem()Lo/onRequestPermissionsResult;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/onRequestPermissionsResult;->RemoteActionCompatParcelizer(Z)V

    .line 772
    :cond_c
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;->read:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Lo/onConfigurationChanged;->read()Lo/peekAvailableContext$AudioAttributesCompatParcelizer;

    move-result-object p0

    if-eqz p0, :cond_17

    .line 774
    invoke-interface {p0, p1, p2}, Lo/peekAvailableContext$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Lo/onRequestPermissionsResult;Z)V

    :cond_17
    return-void
.end method

.method public final read(Lo/onRequestPermissionsResult;)Z
    .registers 5

    .line 760
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;->read:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-static {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->write(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/onRequestPermissionsResult;

    move-result-object v0

    const/4 v1, 0x0

    if-ne p1, v0, :cond_a

    return v1

    .line 762
    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;->read:Landroidx/appcompat/widget/ActionMenuPresenter;

    move-object v2, p1

    check-cast v2, Lo/removeOnTrimMemoryListener;

    invoke-virtual {v2}, Lo/removeOnTrimMemoryListener;->getItem()Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    iput v2, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi21Parcelizer:I

    .line 763
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;->read:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Lo/onConfigurationChanged;->read()Lo/peekAvailableContext$AudioAttributesCompatParcelizer;

    move-result-object p0

    if-eqz p0, :cond_26

    .line 764
    invoke-interface {p0, p1}, Lo/peekAvailableContext$AudioAttributesCompatParcelizer;->read(Lo/onRequestPermissionsResult;)Z

    move-result p0

    return p0

    :cond_26
    return v1
.end method

###### Class androidx.appcompat.widget.ActionMenuPresenter.RemoteActionCompatParcelizer (androidx.appcompat.widget.ActionMenuPresenter$RemoteActionCompatParcelizer)
.class final Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;
.super Lo/onTrimMemory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;Lo/removeOnTrimMemoryListener;Landroid/view/View;)V
    .registers 11

    .line 733
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;->read:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v4, 0x0

    .line 734
    sget v5, Lo/_init_lambda5$read;->actionOverflowMenuStyle:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Lo/onTrimMemory;-><init>(Landroid/content/Context;Lo/onRequestPermissionsResult;Landroid/view/View;ZI)V

    .line 736
    invoke-virtual {p3}, Lo/removeOnTrimMemoryListener;->getItem()Landroid/view/MenuItem;

    move-result-object p2

    check-cast p2, Lo/onRetainNonConfigurationInstance;

    .line 737
    invoke-virtual {p2}, Lo/onRetainNonConfigurationInstance;->AudioAttributesImplApi21Parcelizer()Z

    move-result p2

    if-nez p2, :cond_28

    .line 739
    iget-object p2, p1, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    if-nez p2, :cond_23

    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->RemoteActionCompatParcelizer(Landroidx/appcompat/widget/ActionMenuPresenter;)Lo/registerForActivityResult;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    goto :goto_25

    :cond_23
    iget-object p2, p1, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    :goto_25
    invoke-virtual {p0, p2}, Lo/onTrimMemory;->write(Landroid/view/View;)V

    .line 742
    :cond_28
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatItemReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p1}, Lo/onTrimMemory;->AudioAttributesCompatParcelizer(Lo/peekAvailableContext$AudioAttributesCompatParcelizer;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 747
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;->read:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;

    .line 748
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;->read:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v1, 0x0

    iput v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi21Parcelizer:I

    .line 750
    invoke-super {p0}, Lo/onTrimMemory;->AudioAttributesCompatParcelizer()V

    return-void
.end method

###### Class androidx.appcompat.widget.ActionMenuPresenter.SavedState (androidx.appcompat.widget.ActionMenuPresenter$SavedState)
.class Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public AudioAttributesCompatParcelizer:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 611
    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState$1;

    invoke-direct {v0}, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState$1;-><init>()V

    sput-object v0, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .registers 1

    .line 594
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 2

    .line 597
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 598
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;->AudioAttributesCompatParcelizer:I

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

    .line 608
    iget p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.appcompat.widget.ActionMenuPresenter.SavedState.AnonymousClass1 (androidx.appcompat.widget.ActionMenuPresenter$SavedState$1)
.class final Landroidx/appcompat/widget/ActionMenuPresenter$SavedState$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 612
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)[Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;
    .registers 1

    .line 620
    new-array p0, p0, [Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;
    .registers 2

    .line 615
    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 612
    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState$1;->write(Landroid/os/Parcel;)Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 612
    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuPresenter$SavedState$1;->AudioAttributesCompatParcelizer(I)[Landroidx/appcompat/widget/ActionMenuPresenter$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.appcompat.widget.ActionMenuPresenter.read (androidx.appcompat.widget.ActionMenuPresenter$read)
.class final Landroidx/appcompat/widget/ActionMenuPresenter$read;
.super Landroidx/appcompat/view/menu/ActionMenuItemView$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter;)V
    .registers 2

    .line 800
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$read;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-direct {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$read;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()Lo/removeOnContextAvailableListener;
    .registers 2

    .line 805
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$read;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_f

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$read;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Lo/onTrimMemory;->IconCompatParcelizer()Lo/onSaveInstanceState;

    move-result-object p0

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

###### Class androidx.appcompat.widget.ActionMenuPresenter.write (androidx.appcompat.widget.ActionMenuPresenter$write)
.class final Landroidx/appcompat/widget/ActionMenuPresenter$write;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/ActionMenuView$write;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "write"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;)V
    .registers 5

    .line 628
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v0, 0x0

    .line 629
    sget v1, Lo/_init_lambda5$read;->actionOverflowButtonStyle:I

    invoke-direct {p0, p2, v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x1

    .line 631
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 632
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    const/4 v0, 0x0

    .line 633
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActionMenuPresenter$write;->setVisibility(I)V

    .line 634
    invoke-virtual {p0, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 636
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-static {p0, p2}, Lo/setItemInvoker;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 638
    new-instance p2, Landroidx/appcompat/widget/ActionMenuPresenter$write$5;

    invoke-direct {p2, p0, p0, p1}, Landroidx/appcompat/widget/ActionMenuPresenter$write$5;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter$write;Landroid/view/View;Landroidx/appcompat/widget/ActionMenuPresenter;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final performClick()Z
    .registers 3

    .line 671
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatImageView;->performClick()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    return v1

    :cond_8
    const/4 v0, 0x0

    .line 675
    invoke-virtual {p0, v0}, Landroid/view/View;->playSoundEffect(I)V

    .line 676
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatSearchResultReceiver()Z

    return v1
.end method

.method protected final setFrame(IIII)Z
    .registers 9

    .line 692
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatImageView;->setFrame(IIII)Z

    move-result p1

    .line 695
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 696
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    if-eqz p2, :cond_3f

    if-eqz p3, :cond_3f

    .line 698
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    .line 699
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p4

    .line 700
    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 701
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    .line 702
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v1, v2

    add-int/2addr p2, v1

    .line 703
    div-int/lit8 p2, p2, 0x2

    sub-int/2addr v3, p0

    add-int/2addr p4, v3

    .line 704
    div-int/lit8 p4, p4, 0x2

    sub-int p0, p2, v0

    sub-int v1, p4, v0

    add-int/2addr p2, v0

    add-int/2addr p4, v0

    .line 705
    invoke-static {p3, p0, v1, p2, p4}, Lo/findFormatOverrides;->write(Landroid/graphics/drawable/Drawable;IIII)V

    :cond_3f
    return p1
.end method

###### Class androidx.appcompat.widget.ActionMenuPresenter.write.AnonymousClass5 (androidx.appcompat.widget.ActionMenuPresenter$write$5)
.class final Landroidx/appcompat/widget/ActionMenuPresenter$write$5;
.super Lo/ActivityResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ActionMenuPresenter$write;-><init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

.field final synthetic write:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter$write;Landroid/view/View;Landroidx/appcompat/widget/ActionMenuPresenter;)V
    .registers 4

    .line 638
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    iput-object p3, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write$5;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-direct {p0, p2}, Lo/ActivityResult;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/removeOnContextAvailableListener;
    .registers 2

    .line 641
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuPresenter$write;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    if-nez v0, :cond_a

    const/4 p0, 0x0

    return-object p0

    .line 645
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuPresenter$AudioAttributesCompatParcelizer;

    invoke-virtual {p0}, Lo/onTrimMemory;->IconCompatParcelizer()Lo/onSaveInstanceState;

    move-result-object p0

    return-object p0
.end method

.method public final read()Z
    .registers 1

    .line 650
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatSearchResultReceiver()Z

    const/4 p0, 0x1

    return p0
.end method

.method public final write()Z
    .registers 2

    .line 659
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuPresenter$write;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$IconCompatParcelizer;

    if-eqz v0, :cond_a

    const/4 p0, 0x0

    return p0

    .line 663
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter$write;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$write;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->write()Z

    const/4 p0, 0x1

    return p0
.end method
