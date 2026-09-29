###### Class androidx.mediarouter.app.MediaRouteButton (androidx.mediarouter.app.MediaRouteButton)
.class public Landroidx/mediarouter/app/MediaRouteButton;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/mediarouter/app/MediaRouteButton$write;,
        Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;
    }
.end annotation


# static fields
.field static final AudioAttributesCompatParcelizer:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field private static final IconCompatParcelizer:[I

.field private static final write:[I


# instance fields
.field private AudioAttributesImplApi21Parcelizer:I

.field private final AudioAttributesImplApi26Parcelizer:Landroidx/mediarouter/app/MediaRouteButton$write;

.field private AudioAttributesImplBaseParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Lo/getCallable;

.field private MediaBrowserCompatItemReceiver:Landroid/content/res/ColorStateList;

.field private MediaBrowserCompatMediaItem:I

.field private MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

.field private MediaDescriptionCompat:Lo/kotlinModule;

.field private final MediaMetadataCompat:Lo/ExtensionsKtkotlinModule1;

.field private RatingCompat:Z

.field RemoteActionCompatParcelizer:Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;

.field private read:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 95
    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    sput-object v0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    const v0, 0x10100a0

    .line 107
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/mediarouter/app/MediaRouteButton;->IconCompatParcelizer:[I

    const v0, 0x101009f

    .line 112
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/mediarouter/app/MediaRouteButton;->write:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 117
    invoke-direct {p0, p1, v0}, Landroidx/mediarouter/app/MediaRouteButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 121
    sget v0, Lo/PrivateMaxEntriesMapNode$RemoteActionCompatParcelizer;->mediaRouteButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/mediarouter/app/MediaRouteButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    .line 125
    invoke-static {p1}, Lo/getAccessible;->read(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 90
    sget-object p1, Lo/kotlinModule;->read:Lo/kotlinModule;

    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    .line 91
    invoke-static {}, Lo/getCallable;->write()Lo/getCallable;

    move-result-object p1

    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatCustomActionResultReceiver:Lo/getCallable;

    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 128
    invoke-static {p1}, Lo/ExtensionsKtkotlinModule1;->write(Landroid/content/Context;)Lo/ExtensionsKtkotlinModule1;

    move-result-object v0

    iput-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaMetadataCompat:Lo/ExtensionsKtkotlinModule1;

    .line 129
    new-instance v0, Landroidx/mediarouter/app/MediaRouteButton$write;

    invoke-direct {v0, p0}, Landroidx/mediarouter/app/MediaRouteButton$write;-><init>(Landroidx/mediarouter/app/MediaRouteButton;)V

    iput-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplApi26Parcelizer:Landroidx/mediarouter/app/MediaRouteButton$write;

    .line 131
    sget-object v0, Lo/PrivateMaxEntriesMapNode$AudioAttributesImplApi21Parcelizer;->MediaRouteButton:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 133
    sget p2, Lo/PrivateMaxEntriesMapNode$AudioAttributesImplApi21Parcelizer;->MediaRouteButton_mediaRouteButtonTint:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    iput-object p2, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatItemReceiver:Landroid/content/res/ColorStateList;

    .line 134
    sget p2, Lo/PrivateMaxEntriesMapNode$AudioAttributesImplApi21Parcelizer;->MediaRouteButton_android_minWidth:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatMediaItem:I

    .line 136
    sget p2, Lo/PrivateMaxEntriesMapNode$AudioAttributesImplApi21Parcelizer;->MediaRouteButton_android_minHeight:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplApi21Parcelizer:I

    .line 138
    sget p2, Lo/PrivateMaxEntriesMapNode$AudioAttributesImplApi21Parcelizer;->MediaRouteButton_externalRouteEnabledDrawable:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 140
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_6c

    .line 143
    sget-object p1, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    .line 144
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz p1, :cond_5e

    .line 146
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/mediarouter/app/MediaRouteButton;->setRemoteIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_6c

    .line 148
    :cond_5e
    new-instance p1, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;

    invoke-direct {p1, p0, p2}, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;-><init>(Landroidx/mediarouter/app/MediaRouteButton;I)V

    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer:Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;

    .line 149
    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array p3, v1, [Ljava/lang/Void;

    invoke-virtual {p1, p2, p3}, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 153
    :cond_6c
    :goto_6c
    invoke-direct {p0}, Landroidx/mediarouter/app/MediaRouteButton;->read()V

    const/4 p1, 0x1

    .line 154
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()Z
    .registers 5

    .line 237
    iget-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->read:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 241
    :cond_6
    invoke-direct {p0}, Landroidx/mediarouter/app/MediaRouteButton;->write()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_4b

    .line 246
    invoke-static {}, Lo/ExtensionsKtkotlinModule1;->read()Lo/ExtensionsKtkotlinModule1$MediaBrowserCompatCustomActionResultReceiver;

    move-result-object v2

    .line 247
    invoke-virtual {v2}, Lo/ExtensionsKtkotlinModule1$MediaBrowserCompatCustomActionResultReceiver;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result v3

    if-nez v3, :cond_34

    iget-object v3, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    invoke-virtual {v2, v3}, Lo/ExtensionsKtkotlinModule1$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(Lo/kotlinModule;)Z

    move-result v2

    if-eqz v2, :cond_34

    .line 257
    const-string v2, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment"

    invoke-virtual {v0, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_27

    return v1

    .line 262
    :cond_27
    invoke-static {}, Lo/getCallable;->RemoteActionCompatParcelizer()Lo/PrivateMaxEntriesMapValues;

    move-result-object v1

    .line 263
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    invoke-virtual {v1, p0}, Lo/PrivateMaxEntriesMapValues;->write(Lo/kotlinModule;)V

    .line 264
    invoke-virtual {v1, v0, v2}, Lo/argCount;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_49

    .line 248
    :cond_34
    const-string v2, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"

    invoke-virtual {v0, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_3d

    return v1

    .line 253
    :cond_3d
    invoke-static {}, Lo/getCallable;->read()Lo/isAlive;

    move-result-object v1

    .line 254
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    invoke-virtual {v1, p0}, Lo/isAlive;->RemoteActionCompatParcelizer(Lo/kotlinModule;)V

    .line 255
    invoke-virtual {v1, v0, v2}, Lo/argCount;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    :goto_49
    const/4 p0, 0x1

    return p0

    .line 243
    :cond_4b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "The activity must be a subclass of FragmentActivity"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private IconCompatParcelizer()Landroid/app/Activity;
    .registers 2

    .line 279
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    .line 280
    :goto_4
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_16

    .line 281
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_f

    .line 282
    check-cast p0, Landroid/app/Activity;

    return-object p0

    .line 284
    :cond_f
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    goto :goto_4

    :cond_16
    const/4 p0, 0x0

    return-object p0
.end method

.method private read()V
    .registers 3

    .line 530
    iget-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v0, :cond_7

    .line 531
    sget v0, Lo/PrivateMaxEntriesMapNode$MediaBrowserCompatItemReceiver;->mr_cast_button_connecting:I

    goto :goto_10

    .line 532
    :cond_7
    iget-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->RatingCompat:Z

    if-eqz v0, :cond_e

    .line 533
    sget v0, Lo/PrivateMaxEntriesMapNode$MediaBrowserCompatItemReceiver;->mr_cast_button_connected:I

    goto :goto_10

    .line 535
    :cond_e
    sget v0, Lo/PrivateMaxEntriesMapNode$MediaBrowserCompatItemReceiver;->mr_cast_button_disconnected:I

    .line 537
    :goto_10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private write()Landroidx/fragment/app/FragmentManager;
    .registers 2

    .line 270
    invoke-direct {p0}, Landroidx/mediarouter/app/MediaRouteButton;->IconCompatParcelizer()Landroid/app/Activity;

    move-result-object p0

    .line 271
    instance-of v0, p0, Lo/maybeGetTypeVariable;

    if-eqz v0, :cond_f

    .line 272
    check-cast p0, Lo/maybeGetTypeVariable;

    invoke-virtual {p0}, Lo/maybeGetTypeVariable;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method final RemoteActionCompatParcelizer()V
    .registers 6

    .line 489
    invoke-static {}, Lo/ExtensionsKtkotlinModule1;->read()Lo/ExtensionsKtkotlinModule1$MediaBrowserCompatCustomActionResultReceiver;

    move-result-object v0

    .line 490
    invoke-virtual {v0}, Lo/ExtensionsKtkotlinModule1$MediaBrowserCompatCustomActionResultReceiver;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_16

    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    invoke-virtual {v0, v1}, Lo/ExtensionsKtkotlinModule1$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(Lo/kotlinModule;)Z

    move-result v1

    if-eqz v1, :cond_16

    move v1, v2

    goto :goto_17

    :cond_16
    move v1, v3

    :goto_17
    if-eqz v1, :cond_21

    .line 491
    invoke-virtual {v0}, Lo/ExtensionsKtkotlinModule1$MediaBrowserCompatCustomActionResultReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_21

    move v0, v2

    goto :goto_22

    :cond_21
    move v0, v3

    .line 493
    :goto_22
    iget-boolean v4, p0, Landroidx/mediarouter/app/MediaRouteButton;->RatingCompat:Z

    if-eq v4, v1, :cond_29

    .line 494
    iput-boolean v1, p0, Landroidx/mediarouter/app/MediaRouteButton;->RatingCompat:Z

    move v3, v2

    .line 497
    :cond_29
    iget-boolean v4, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplBaseParcelizer:Z

    if-eq v4, v0, :cond_30

    .line 498
    iput-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplBaseParcelizer:Z

    move v3, v2

    :cond_30
    if-eqz v3, :cond_38

    .line 503
    invoke-direct {p0}, Landroidx/mediarouter/app/MediaRouteButton;->read()V

    .line 504
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 506
    :cond_38
    iget-boolean v4, p0, Landroidx/mediarouter/app/MediaRouteButton;->read:Z

    if-eqz v4, :cond_45

    .line 507
    iget-object v4, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    invoke-static {v4}, Lo/ExtensionsKtkotlinModule1;->RemoteActionCompatParcelizer(Lo/kotlinModule;)Z

    move-result v4

    invoke-virtual {p0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 510
    :cond_45
    iget-object v4, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_80

    .line 511
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    instance-of v4, v4, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v4, :cond_80

    .line 512
    iget-object v4, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    check-cast v4, Landroid/graphics/drawable/AnimationDrawable;

    .line 513
    iget-boolean p0, p0, Landroidx/mediarouter/app/MediaRouteButton;->read:Z

    if-eqz p0, :cond_6b

    if-nez v3, :cond_61

    if-eqz v0, :cond_80

    .line 514
    :cond_61
    invoke-virtual {v4}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result p0

    if-nez p0, :cond_80

    .line 515
    invoke-virtual {v4}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    return-void

    :cond_6b
    if-eqz v1, :cond_80

    if-nez v0, :cond_80

    .line 520
    invoke-virtual {v4}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result p0

    if-eqz p0, :cond_78

    .line 521
    invoke-virtual {v4}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 523
    :cond_78
    invoke-virtual {v4}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result p0

    sub-int/2addr p0, v2

    invoke-virtual {v4, p0}, Landroid/graphics/drawable/DrawableContainer;->selectDrawable(I)Z

    :cond_80
    return-void
.end method

.method protected drawableStateChanged()V
    .registers 3

    .line 326
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 328
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_13

    .line 329
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    .line 330
    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 331
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_13
    return-void
.end method

.method public jumpDrawablesToCurrentState()V
    .registers 2

    .line 384
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 385
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lo/findFormatOverrides;->AudioAttributesImplBaseParcelizer(Landroid/graphics/drawable/Drawable;)V

    .line 389
    :cond_d
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz p0, :cond_14

    .line 390
    invoke-static {p0}, Lo/findFormatOverrides;->AudioAttributesImplBaseParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_14
    return-void
.end method

.method public onAttachedToWindow()V
    .registers 4

    .line 405
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 407
    iput-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->read:Z

    .line 408
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    invoke-virtual {v0}, Lo/kotlinModule;->write()Z

    move-result v0

    if-nez v0, :cond_17

    .line 409
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaMetadataCompat:Lo/ExtensionsKtkotlinModule1;

    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    iget-object v2, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplApi26Parcelizer:Landroidx/mediarouter/app/MediaRouteButton$write;

    invoke-virtual {v0, v1, v2}, Lo/ExtensionsKtkotlinModule1;->RemoteActionCompatParcelizer(Lo/kotlinModule;Lo/ExtensionsKtkotlinModule1$IconCompatParcelizer;)V

    .line 411
    :cond_17
    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method protected onCreateDrawableState(I)[I
    .registers 3

    add-int/lit8 p1, p1, 0x1

    .line 310
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    move-result-object p1

    .line 316
    iget-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v0, :cond_10

    .line 317
    sget-object p0, Landroidx/mediarouter/app/MediaRouteButton;->write:[I

    invoke-static {p1, p0}, Landroidx/mediarouter/app/MediaRouteButton;->mergeDrawableStates([I[I)[I

    return-object p1

    .line 318
    :cond_10
    iget-boolean p0, p0, Landroidx/mediarouter/app/MediaRouteButton;->RatingCompat:Z

    if-eqz p0, :cond_19

    .line 319
    sget-object p0, Landroidx/mediarouter/app/MediaRouteButton;->IconCompatParcelizer:[I

    invoke-static {p1, p0}, Landroidx/mediarouter/app/MediaRouteButton;->mergeDrawableStates([I[I)[I

    :cond_19
    return-object p1
.end method

.method public onDetachedFromWindow()V
    .registers 3

    const/4 v0, 0x0

    .line 416
    iput-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->read:Z

    .line 417
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    invoke-virtual {v0}, Lo/kotlinModule;->write()Z

    move-result v0

    if-nez v0, :cond_12

    .line 418
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaMetadataCompat:Lo/ExtensionsKtkotlinModule1;

    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplApi26Parcelizer:Landroidx/mediarouter/app/MediaRouteButton$write;

    invoke-virtual {v0, v1}, Lo/ExtensionsKtkotlinModule1;->read(Lo/ExtensionsKtkotlinModule1$IconCompatParcelizer;)V

    .line 421
    :cond_12
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 10

    .line 469
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 471
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_43

    .line 472
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 473
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    .line 474
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    .line 475
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    .line 477
    iget-object v6, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v6

    .line 478
    iget-object v7, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v7

    sub-int/2addr v1, v2

    sub-int/2addr v1, v0

    sub-int/2addr v1, v6

    .line 479
    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    sub-int/2addr v4, v5

    sub-int/2addr v4, v3

    sub-int/2addr v4, v7

    .line 480
    div-int/lit8 v4, v4, 0x2

    add-int/2addr v3, v4

    .line 482
    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    add-int/2addr v6, v0

    add-int/2addr v7, v3

    invoke-virtual {v1, v0, v3, v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 484
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_43
    return-void
.end method

.method protected onMeasure(II)V
    .registers 9

    .line 426
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 427
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 428
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    .line 429
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    .line 431
    iget v2, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatMediaItem:I

    iget-object v3, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    if-eqz v3, :cond_26

    .line 432
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    add-int/2addr v3, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    add-int/2addr v3, v5

    goto :goto_27

    :cond_26
    move v3, v4

    .line 431
    :goto_27
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 433
    iget v3, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplApi21Parcelizer:I

    iget-object v5, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz v5, :cond_3f

    .line 434
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    add-int/2addr v4, v5

    .line 433
    :cond_3f
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v5, -0x80000000

    if-eq p1, v5, :cond_4d

    if-eq p1, v4, :cond_51

    move v0, v2

    goto :goto_51

    .line 442
    :cond_4d
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_51
    :goto_51
    if-eq p2, v5, :cond_57

    if-eq p2, v4, :cond_5b

    move v1, v3

    goto :goto_5b

    .line 456
    :cond_57
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 464
    :cond_5b
    :goto_5b
    invoke-virtual {p0, v0, v1}, Landroidx/mediarouter/app/MediaRouteButton;->setMeasuredDimension(II)V

    return-void
.end method

.method public performClick()Z
    .registers 3

    .line 301
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_a

    .line 303
    invoke-virtual {p0, v1}, Landroid/view/View;->playSoundEffect(I)V

    .line 305
    :cond_a
    invoke-direct {p0}, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesCompatParcelizer()Z

    move-result p0

    if-nez p0, :cond_13

    if-nez v0, :cond_13

    return v1

    :cond_13
    const/4 p0, 0x1

    return p0
.end method

.method public setDialogFactory(Lo/getCallable;)V
    .registers 2

    if-eqz p1, :cond_5

    .line 215
    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatCustomActionResultReceiver:Lo/getCallable;

    return-void

    .line 212
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "factory must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setRemoteIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 339
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer:Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    .line 340
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 343
    :cond_8
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_15

    const/4 v2, 0x0

    .line 344
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 345
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_15
    const/4 v0, 0x1

    if-eqz p1, :cond_3f

    .line 348
    iget-object v2, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatItemReceiver:Landroid/content/res/ColorStateList;

    if-eqz v2, :cond_29

    .line 349
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Lo/findFormatOverrides;->AudioAttributesImplApi26Parcelizer(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 350
    iget-object v2, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatItemReceiver:Landroid/content/res/ColorStateList;

    invoke-static {p1, v2}, Lo/findFormatOverrides;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 352
    :cond_29
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 353
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 354
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_3b

    move v2, v0

    goto :goto_3c

    :cond_3b
    move v2, v1

    :goto_3c
    invoke-virtual {p1, v2, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 356
    :cond_3f
    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    .line 358
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 359
    iget-boolean p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->read:Z

    if-eqz p1, :cond_7f

    iget-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_7f

    .line 360
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    instance-of p1, p1, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz p1, :cond_7f

    .line 361
    iget-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/AnimationDrawable;

    .line 362
    iget-boolean v1, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v1, :cond_6a

    .line 363
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result p0

    if-nez p0, :cond_7f

    .line 364
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    return-void

    .line 366
    :cond_6a
    iget-boolean p0, p0, Landroidx/mediarouter/app/MediaRouteButton;->RatingCompat:Z

    if-eqz p0, :cond_7f

    .line 367
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result p0

    if-eqz p0, :cond_77

    .line 368
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 370
    :cond_77
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result p0

    sub-int/2addr p0, v0

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/DrawableContainer;->selectDrawable(I)Z

    :cond_7f
    return-void
.end method

.method public setRouteSelector(Lo/kotlinModule;)V
    .registers 4

    if-eqz p1, :cond_30

    .line 179
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    .line 180
    iget-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->read:Z

    if-eqz v0, :cond_2a

    .line 181
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    invoke-virtual {v0}, Lo/kotlinModule;->write()Z

    move-result v0

    if-nez v0, :cond_1d

    .line 182
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaMetadataCompat:Lo/ExtensionsKtkotlinModule1;

    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplApi26Parcelizer:Landroidx/mediarouter/app/MediaRouteButton$write;

    invoke-virtual {v0, v1}, Lo/ExtensionsKtkotlinModule1;->read(Lo/ExtensionsKtkotlinModule1$IconCompatParcelizer;)V

    .line 184
    :cond_1d
    invoke-virtual {p1}, Lo/kotlinModule;->write()Z

    move-result v0

    if-nez v0, :cond_2a

    .line 185
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaMetadataCompat:Lo/ExtensionsKtkotlinModule1;

    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesImplApi26Parcelizer:Landroidx/mediarouter/app/MediaRouteButton$write;

    invoke-virtual {v0, p1, v1}, Lo/ExtensionsKtkotlinModule1;->RemoteActionCompatParcelizer(Lo/kotlinModule;Lo/ExtensionsKtkotlinModule1$IconCompatParcelizer;)V

    .line 188
    :cond_2a
    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaDescriptionCompat:Lo/kotlinModule;

    .line 189
    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    :cond_2f
    return-void

    .line 176
    :cond_30
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "selector must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setVisibility(I)V
    .registers 3

    .line 396
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 398
    iget-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_14

    .line 399
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    const/4 v0, 0x0

    if-nez p0, :cond_10

    const/4 p0, 0x1

    goto :goto_11

    :cond_10
    move p0, v0

    :goto_11
    invoke-virtual {p1, p0, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_14
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .registers 3

    .line 377
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eq p1, p0, :cond_c

    const/4 p0, 0x0

    return p0

    :cond_c
    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.mediarouter.app.MediaRouteButton.RemoteActionCompatParcelizer (androidx.mediarouter.app.MediaRouteButton$RemoteActionCompatParcelizer)
.class final Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/mediarouter/app/MediaRouteButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "RemoteActionCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:I

.field final synthetic write:Landroidx/mediarouter/app/MediaRouteButton;


# direct methods
.method constructor <init>(Landroidx/mediarouter/app/MediaRouteButton;I)V
    .registers 3

    .line 588
    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 589
    iput p2, p0, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method private IconCompatParcelizer(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    if-eqz p1, :cond_d

    .line 610
    sget-object v0, Landroidx/mediarouter/app/MediaRouteButton;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    iget v1, p0, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 612
    :cond_d
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->write:Landroidx/mediarouter/app/MediaRouteButton;

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer:Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 599
    invoke-direct {p0, p1}, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    .line 600
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {p0, p1}, Landroidx/mediarouter/app/MediaRouteButton;->setRemoteIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private varargs write()Landroid/graphics/drawable/Drawable;
    .registers 2

    .line 594
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget p0, p0, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private write(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 605
    invoke-direct {p0, p1}, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 585
    check-cast p1, [Ljava/lang/Void;

    invoke-direct {p0}, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->write()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method protected final synthetic onCancelled(Ljava/lang/Object;)V
    .registers 2

    .line 585
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, p1}, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->write(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .registers 2

    .line 585
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, p1}, Landroidx/mediarouter/app/MediaRouteButton$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

###### Class androidx.mediarouter.app.MediaRouteButton.write (androidx.mediarouter.app.MediaRouteButton$write)
.class final Landroidx/mediarouter/app/MediaRouteButton$write;
.super Lo/ExtensionsKtkotlinModule1$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/mediarouter/app/MediaRouteButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "write"
.end annotation


# instance fields
.field final synthetic write:Landroidx/mediarouter/app/MediaRouteButton;


# direct methods
.method constructor <init>(Landroidx/mediarouter/app/MediaRouteButton;)V
    .registers 2

    .line 541
    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteButton$write;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-direct {p0}, Lo/ExtensionsKtkotlinModule1$IconCompatParcelizer;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    .line 556
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$write;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final AudioAttributesImplBaseParcelizer()V
    .registers 1

    .line 566
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$write;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 1

    .line 571
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$write;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()V
    .registers 1

    .line 561
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$write;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final MediaBrowserCompatItemReceiver()V
    .registers 1

    .line 551
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$write;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 1

    .line 581
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$write;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final read()V
    .registers 1

    .line 546
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$write;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final write()V
    .registers 1

    .line 576
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteButton$write;->write:Landroidx/mediarouter/app/MediaRouteButton;

    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteButton;->RemoteActionCompatParcelizer()V

    return-void
.end method
