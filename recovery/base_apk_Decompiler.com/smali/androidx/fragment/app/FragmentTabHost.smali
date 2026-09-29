###### Class androidx.fragment.app.FragmentTabHost (androidx.fragment.app.FragmentTabHost)
.class public Landroidx/fragment/app/FragmentTabHost;
.super Landroid/widget/TabHost;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TabHost$OnTabChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/FragmentTabHost$SavedState;,
        Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroid/content/Context;

.field private AudioAttributesImplApi21Parcelizer:Landroid/widget/TabHost$OnTabChangeListener;

.field private final AudioAttributesImplApi26Parcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/FrameLayout;

.field private RemoteActionCompatParcelizer:I

.field private read:Landroidx/fragment/app/FragmentManager;

.field private write:Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 137
    invoke-direct {p0, p1, v0}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 49
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesImplApi26Parcelizer:Ljava/util/ArrayList;

    .line 138
    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 148
    invoke-direct {p0, p1, p2}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesImplApi26Parcelizer:Ljava/util/ArrayList;

    .line 149
    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/content/Context;)V
    .registers 9

    const v0, 0x1020013

    .line 164
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_5a

    .line 165
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    .line 166
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 167
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 171
    new-instance v2, Landroid/widget/TabWidget;

    invoke-direct {v2, p1}, Landroid/widget/TabWidget;-><init>(Landroid/content/Context;)V

    .line 172
    invoke-virtual {v2, v0}, Landroid/view/View;->setId(I)V

    const/4 v0, 0x0

    .line 173
    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 174
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x2

    const/4 v6, 0x0

    invoke-direct {v4, v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 178
    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const v4, 0x1020011

    .line 179
    invoke-virtual {v2, v4}, Landroid/view/View;->setId(I)V

    .line 180
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v0, v0, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 182
    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/fragment/app/FragmentTabHost;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/FrameLayout;

    .line 183
    iget p0, p0, Landroidx/fragment/app/FragmentTabHost;->RemoteActionCompatParcelizer:I

    invoke-virtual {v2, p0}, Landroid/view/View;->setId(I)V

    .line 184
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-direct {p0, v3, v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5a
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    const v0, 0x10100f3

    .line 153
    filled-new-array {v0}, [I

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 155
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Landroidx/fragment/app/FragmentTabHost;->RemoteActionCompatParcelizer:I

    .line 156
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 158
    invoke-super {p0, p0}, Landroid/widget/TabHost;->setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V

    return-void
.end method

.method private IconCompatParcelizer()V
    .registers 4

    .line 242
    iget-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/FrameLayout;

    if-nez v0, :cond_27

    .line 243
    iget v0, p0, Landroidx/fragment/app/FragmentTabHost;->RemoteActionCompatParcelizer:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_11

    goto :goto_27

    .line 245
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No tab content FrameLayout found for id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p0, p0, Landroidx/fragment/app/FragmentTabHost;->RemoteActionCompatParcelizer:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_27
    :goto_27
    return-void
.end method

.method private read(Ljava/lang/String;)Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;
    .registers 6

    .line 433
    iget-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesImplApi26Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_1d

    .line 434
    iget-object v2, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesImplApi26Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;

    .line 435
    iget-object v3, v2, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1a

    return-object v2

    :cond_1a
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_1d
    const/4 p0, 0x0

    return-object p0
.end method

.method private read(Ljava/lang/String;Lo/_doAddInjectable;)Lo/_doAddInjectable;
    .registers 6

    .line 402
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentTabHost;->read(Ljava/lang/String;)Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;

    move-result-object p1

    .line 403
    iget-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->write:Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;

    if-eq v0, p1, :cond_55

    if-nez p2, :cond_10

    .line 405
    iget-object p2, p0, Landroidx/fragment/app/FragmentTabHost;->read:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer()Lo/_doAddInjectable;

    move-result-object p2

    .line 408
    :cond_10
    iget-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->write:Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;

    if-eqz v0, :cond_1f

    .line 409
    iget-object v0, v0, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1f

    .line 410
    iget-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->write:Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;

    iget-object v0, v0, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2, v0}, Lo/_doAddInjectable;->RemoteActionCompatParcelizer(Landroidx/fragment/app/Fragment;)Lo/_doAddInjectable;

    :cond_1f
    if-eqz p1, :cond_53

    .line 415
    iget-object v0, p1, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-nez v0, :cond_4e

    .line 416
    iget-object v0, p0, Landroidx/fragment/app/FragmentTabHost;->read:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->onCommand()Lo/NopAnnotationIntrospector1;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesCompatParcelizer:Landroid/content/Context;

    .line 417
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    iget-object v2, p1, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    .line 416
    invoke-virtual {v0, v1, v2}, Lo/NopAnnotationIntrospector1;->read(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    .line 418
    iget-object v0, p1, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    iget-object v1, p1, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->read:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 419
    iget v0, p0, Landroidx/fragment/app/FragmentTabHost;->RemoteActionCompatParcelizer:I

    iget-object v1, p1, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    iget-object v2, p1, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p2, v0, v1, v2}, Lo/_doAddInjectable;->read(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Lo/_doAddInjectable;

    goto :goto_53

    .line 421
    :cond_4e
    iget-object v0, p1, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2, v0}, Lo/_doAddInjectable;->write(Landroidx/fragment/app/Fragment;)Lo/_doAddInjectable;

    .line 425
    :cond_53
    :goto_53
    iput-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->write:Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;

    :cond_55
    return-object p2
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .registers 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 299
    invoke-super {p0}, Landroid/widget/TabHost;->onAttachedToWindow()V

    .line 301
    invoke-virtual {p0}, Landroid/widget/TabHost;->getCurrentTabTag()Ljava/lang/String;

    move-result-object v0

    .line 306
    iget-object v1, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesImplApi26Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_f
    if-ge v3, v1, :cond_4a

    .line 307
    iget-object v4, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesImplApi26Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;

    .line 308
    iget-object v5, p0, Landroidx/fragment/app/FragmentTabHost;->read:Landroidx/fragment/app/FragmentManager;

    iget-object v6, v4, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v5

    iput-object v5, v4, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    .line 309
    iget-object v5, v4, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v5, :cond_47

    iget-object v5, v4, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v5

    if-nez v5, :cond_47

    .line 310
    iget-object v5, v4, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3a

    .line 314
    iput-object v4, p0, Landroidx/fragment/app/FragmentTabHost;->write:Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;

    goto :goto_47

    :cond_3a
    if-nez v2, :cond_42

    .line 319
    iget-object v2, p0, Landroidx/fragment/app/FragmentTabHost;->read:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer()Lo/_doAddInjectable;

    move-result-object v2

    .line 321
    :cond_42
    iget-object v4, v4, Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2, v4}, Lo/_doAddInjectable;->RemoteActionCompatParcelizer(Landroidx/fragment/app/Fragment;)Lo/_doAddInjectable;

    :cond_47
    :goto_47
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_4a
    const/4 v1, 0x1

    .line 328
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentTabHost;->IconCompatParcelizer:Z

    .line 329
    invoke-direct {p0, v0, v2}, Landroidx/fragment/app/FragmentTabHost;->read(Ljava/lang/String;Lo/_doAddInjectable;)Lo/_doAddInjectable;

    move-result-object v0

    if-eqz v0, :cond_5b

    .line 331
    invoke-virtual {v0}, Lo/_doAddInjectable;->write()I

    .line 332
    iget-object p0, p0, Landroidx/fragment/app/FragmentTabHost;->read:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    :cond_5b
    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 344
    invoke-super {p0}, Landroid/widget/TabHost;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 345
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentTabHost;->IconCompatParcelizer:Z

    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 371
    instance-of v0, p1, Landroidx/fragment/app/FragmentTabHost$SavedState;

    if-nez v0, :cond_8

    .line 372
    invoke-super {p0, p1}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 375
    :cond_8
    check-cast p1, Landroidx/fragment/app/FragmentTabHost$SavedState;

    .line 376
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 377
    iget-object p1, p1, Landroidx/fragment/app/FragmentTabHost$SavedState;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/widget/TabHost;->setCurrentTabByTag(Ljava/lang/String;)V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 357
    invoke-super {p0}, Landroid/widget/TabHost;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 358
    new-instance v1, Landroidx/fragment/app/FragmentTabHost$SavedState;

    invoke-direct {v1, v0}, Landroidx/fragment/app/FragmentTabHost$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 359
    invoke-virtual {p0}, Landroid/widget/TabHost;->getCurrentTabTag()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Landroidx/fragment/app/FragmentTabHost$SavedState;->RemoteActionCompatParcelizer:Ljava/lang/String;

    return-object v1
.end method

.method public onTabChanged(Ljava/lang/String;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 388
    iget-boolean v0, p0, Landroidx/fragment/app/FragmentTabHost;->IconCompatParcelizer:Z

    if-eqz v0, :cond_e

    const/4 v0, 0x0

    .line 389
    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/FragmentTabHost;->read(Ljava/lang/String;Lo/_doAddInjectable;)Lo/_doAddInjectable;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 391
    invoke-virtual {v0}, Lo/_doAddInjectable;->write()I

    .line 394
    :cond_e
    iget-object p0, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesImplApi21Parcelizer:Landroid/widget/TabHost$OnTabChangeListener;

    if-eqz p0, :cond_15

    .line 395
    invoke-interface {p0, p1}, Landroid/widget/TabHost$OnTabChangeListener;->onTabChanged(Ljava/lang/String;)V

    :cond_15
    return-void
.end method

.method public setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 259
    iput-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesImplApi21Parcelizer:Landroid/widget/TabHost$OnTabChangeListener;

    return-void
.end method

.method public setup()V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 196
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Must call setup() that takes a Context and FragmentManager"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setup(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 209
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesCompatParcelizer(Landroid/content/Context;)V

    .line 210
    invoke-super {p0}, Landroid/widget/TabHost;->setup()V

    .line 211
    iput-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesCompatParcelizer:Landroid/content/Context;

    .line 212
    iput-object p2, p0, Landroidx/fragment/app/FragmentTabHost;->read:Landroidx/fragment/app/FragmentManager;

    .line 213
    invoke-direct {p0}, Landroidx/fragment/app/FragmentTabHost;->IconCompatParcelizer()V

    return-void
.end method

.method public setup(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 226
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesCompatParcelizer(Landroid/content/Context;)V

    .line 227
    invoke-super {p0}, Landroid/widget/TabHost;->setup()V

    .line 228
    iput-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->AudioAttributesCompatParcelizer:Landroid/content/Context;

    .line 229
    iput-object p2, p0, Landroidx/fragment/app/FragmentTabHost;->read:Landroidx/fragment/app/FragmentManager;

    .line 230
    iput p3, p0, Landroidx/fragment/app/FragmentTabHost;->RemoteActionCompatParcelizer:I

    .line 231
    invoke-direct {p0}, Landroidx/fragment/app/FragmentTabHost;->IconCompatParcelizer()V

    .line 232
    iget-object p1, p0, Landroidx/fragment/app/FragmentTabHost;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p3}, Landroid/view/View;->setId(I)V

    .line 236
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_21

    const p1, 0x1020012

    .line 237
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    :cond_21
    return-void
.end method

###### Class androidx.fragment.app.FragmentTabHost.IconCompatParcelizer (androidx.fragment.app.FragmentTabHost$IconCompatParcelizer)
.class final Landroidx/fragment/app/FragmentTabHost$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentTabHost;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Landroidx/fragment/app/Fragment;

.field final IconCompatParcelizer:Ljava/lang/String;

.field final RemoteActionCompatParcelizer:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field final read:Landroid/os/Bundle;

###### Class androidx.fragment.app.FragmentTabHost.SavedState (androidx.fragment.app.FragmentTabHost$SavedState)
.class Landroidx/fragment/app/FragmentTabHost$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentTabHost;
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
            "Landroidx/fragment/app/FragmentTabHost$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field RemoteActionCompatParcelizer:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 114
    new-instance v0, Landroidx/fragment/app/FragmentTabHost$SavedState$3;

    invoke-direct {v0}, Landroidx/fragment/app/FragmentTabHost$SavedState$3;-><init>()V

    sput-object v0, Landroidx/fragment/app/FragmentTabHost$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 2

    .line 96
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/FragmentTabHost$SavedState;->RemoteActionCompatParcelizer:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 92
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FragmentTabHost.SavedState{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " curTab="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/fragment/app/FragmentTabHost$SavedState;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 102
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 103
    iget-object p0, p0, Landroidx/fragment/app/FragmentTabHost$SavedState;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class androidx.fragment.app.FragmentTabHost.SavedState.AnonymousClass3 (androidx.fragment.app.FragmentTabHost$SavedState$3)
.class final Landroidx/fragment/app/FragmentTabHost$SavedState$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentTabHost$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/fragment/app/FragmentTabHost$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/fragment/app/FragmentTabHost$SavedState;
    .registers 2

    .line 118
    new-instance v0, Landroidx/fragment/app/FragmentTabHost$SavedState;

    invoke-direct {v0, p0}, Landroidx/fragment/app/FragmentTabHost$SavedState;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static read(I)[Landroidx/fragment/app/FragmentTabHost$SavedState;
    .registers 1

    .line 123
    new-array p0, p0, [Landroidx/fragment/app/FragmentTabHost$SavedState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 115
    invoke-static {p1}, Landroidx/fragment/app/FragmentTabHost$SavedState$3;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/fragment/app/FragmentTabHost$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 115
    invoke-static {p1}, Landroidx/fragment/app/FragmentTabHost$SavedState$3;->read(I)[Landroidx/fragment/app/FragmentTabHost$SavedState;

    move-result-object p0

    return-object p0
.end method
