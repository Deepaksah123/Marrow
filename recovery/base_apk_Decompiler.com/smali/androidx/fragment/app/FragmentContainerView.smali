###### Class androidx.fragment.app.FragmentContainerView (androidx.fragment.app.FragmentContainerView)
.class public final Landroidx/fragment/app/FragmentContainerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u00019B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nB!\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0004\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0017H\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u001aH\u0014\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\"\u0010\u0010J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008%\u0010\u0010J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010(\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008(\u0010\'J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001bH\u0000\u00a2\u0006\u0004\u0008)\u0010*J\u0019\u0010,\u001a\u00020\u000e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010+H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020.H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00081\u0010\u0010R\u0018\u00103\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u00102R\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001a\u00105\u001a\u0008\u0012\u0004\u0012\u00020\r048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00106"
    }
    d2 = {
        "Landroidx/fragment/app/FragmentContainerView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "p0",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "p1",
        "",
        "p2",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Landroidx/fragment/app/FragmentManager;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V",
        "Landroid/view/View;",
        "",
        "read",
        "(Landroid/view/View;)V",
        "Landroid/view/ViewGroup$LayoutParams;",
        "addView",
        "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V",
        "Landroid/view/WindowInsets;",
        "dispatchApplyWindowInsets",
        "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;",
        "Landroid/graphics/Canvas;",
        "dispatchDraw",
        "(Landroid/graphics/Canvas;)V",
        "",
        "",
        "drawChild",
        "(Landroid/graphics/Canvas;Landroid/view/View;J)Z",
        "endViewTransition",
        "onApplyWindowInsets",
        "removeAllViewsInLayout",
        "()V",
        "removeView",
        "removeViewAt",
        "(I)V",
        "removeViewInLayout",
        "removeViews",
        "(II)V",
        "removeViewsInLayout",
        "setDrawDisappearingViewsLast",
        "(Z)V",
        "Landroid/animation/LayoutTransition;",
        "setLayoutTransition",
        "(Landroid/animation/LayoutTransition;)V",
        "Landroid/view/View$OnApplyWindowInsetsListener;",
        "setOnApplyWindowInsetsListener",
        "(Landroid/view/View$OnApplyWindowInsetsListener;)V",
        "startViewTransition",
        "Landroid/view/View$OnApplyWindowInsetsListener;",
        "AudioAttributesCompatParcelizer",
        "",
        "write",
        "Ljava/util/List;",
        "RemoteActionCompatParcelizer",
        "Z",
        "IconCompatParcelizer"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private RemoteActionCompatParcelizer:Z

.field private read:Landroid/view/View$OnApplyWindowInsetsListener;

.field private final write:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 89
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Landroidx/fragment/app/FragmentContainerView;->write:Ljava/util/List;

    .line 90
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Landroidx/fragment/app/FragmentContainerView;->AudioAttributesCompatParcelizer:Ljava/util/List;

    const/4 p1, 0x1

    .line 95
    iput-boolean p1, p0, Landroidx/fragment/app/FragmentContainerView;->RemoteActionCompatParcelizer:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    .line 359
    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 89
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/List;

    iput-object p3, p0, Landroidx/fragment/app/FragmentContainerView;->write:Ljava/util/List;

    .line 90
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/List;

    iput-object p3, p0, Landroidx/fragment/app/FragmentContainerView;->AudioAttributesCompatParcelizer:Ljava/util/List;

    const/4 p3, 0x1

    .line 95
    iput-boolean p3, p0, Landroidx/fragment/app/FragmentContainerView;->RemoteActionCompatParcelizer:Z

    if-eqz p2, :cond_67

    .line 110
    invoke-interface {p2}, Landroid/util/AttributeSet;->getClassAttribute()Ljava/lang/String;

    move-result-object p3

    .line 112
    sget-object v1, Lo/findSubtypesCheckRepeatedNames$RemoteActionCompatParcelizer;->FragmentContainerView:[I

    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 350
    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    if-nez p3, :cond_38

    .line 114
    sget p2, Lo/findSubtypesCheckRepeatedNames$RemoteActionCompatParcelizer;->FragmentContainerView_android_name:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    .line 115
    const-string p2, "android:name"

    goto :goto_3a

    .line 113
    :cond_38
    const-string p2, "class"

    .line 350
    :goto_3a
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p3, :cond_67

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p0

    if-eqz p0, :cond_46

    goto :goto_67

    .line 120
    :cond_46
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "FragmentContainerView must be within a FragmentActivity to use "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "=\""

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 119
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_67
    :goto_67
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 6

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_5

    const/4 p3, 0x0

    .line 104
    :cond_5
    invoke-direct {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V
    .registers 10

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 89
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    iput-object v1, p0, Landroidx/fragment/app/FragmentContainerView;->write:Ljava/util/List;

    .line 90
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    iput-object v1, p0, Landroidx/fragment/app/FragmentContainerView;->AudioAttributesCompatParcelizer:Ljava/util/List;

    const/4 v1, 0x1

    .line 95
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentContainerView;->RemoteActionCompatParcelizer:Z

    .line 132
    invoke-interface {p2}, Landroid/util/AttributeSet;->getClassAttribute()Ljava/lang/String;

    move-result-object v1

    .line 134
    sget-object v2, Lo/findSubtypesCheckRepeatedNames$RemoteActionCompatParcelizer;->FragmentContainerView:[I

    invoke-static {v2, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 356
    invoke-virtual {p1, p2, v2, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    if-nez v1, :cond_39

    .line 136
    sget v1, Lo/findSubtypesCheckRepeatedNames$RemoteActionCompatParcelizer;->FragmentContainerView_android_name:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 138
    :cond_39
    sget v3, Lo/findSubtypesCheckRepeatedNames$RemoteActionCompatParcelizer;->FragmentContainerView_android_tag:I

    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 356
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 140
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    .line 141
    invoke-virtual {p3, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v4

    if-eqz v1, :cond_a7

    if-nez v4, :cond_a7

    const/4 v4, -0x1

    if-ne v2, v4, :cond_74

    if-eqz v3, :cond_5d

    .line 146
    const-string p0, " with tag "

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 148
    :cond_5d
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "FragmentContainerView must have an android:id to add Fragment "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 147
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 152
    :cond_74
    invoke-virtual {p3}, Landroidx/fragment/app/FragmentManager;->onCommand()Lo/NopAnnotationIntrospector1;

    move-result-object v4

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5, v1}, Lo/NopAnnotationIntrospector1;->read(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    iput v2, v1, Landroidx/fragment/app/Fragment;->mFragmentId:I

    .line 154
    iput v2, v1, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 155
    iput-object v3, v1, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    .line 156
    iput-object p3, v1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 157
    invoke-virtual {p3}, Landroidx/fragment/app/FragmentManager;->onPlay()Lo/pessimisticallyValidateBounds;

    move-result-object v0

    iput-object v0, v1, Landroidx/fragment/app/Fragment;->mHost:Lo/pessimisticallyValidateBounds;

    const/4 v0, 0x0

    .line 158
    invoke-virtual {v1, p1, p2, v0}, Landroidx/fragment/app/Fragment;->onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 159
    invoke-virtual {p3}, Landroidx/fragment/app/FragmentManager;->IconCompatParcelizer()Lo/_doAddInjectable;

    move-result-object p1

    .line 160
    invoke-virtual {p1}, Lo/_doAddInjectable;->MediaDescriptionCompat()Lo/_doAddInjectable;

    move-result-object p1

    .line 161
    move-object p2, p0

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p1, p2, v1, v3}, Lo/_doAddInjectable;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lo/_doAddInjectable;

    move-result-object p1

    .line 162
    invoke-virtual {p1}, Lo/_doAddInjectable;->IconCompatParcelizer()V

    .line 164
    :cond_a7
    invoke-virtual {p3, p0}, Landroidx/fragment/app/FragmentManager;->AudioAttributesCompatParcelizer(Landroidx/fragment/app/FragmentContainerView;)V

    return-void
.end method

.method private final read(Landroid/view/View;)V
    .registers 3

    .line 319
    iget-object v0, p0, Landroidx/fragment/app/FragmentContainerView;->AudioAttributesCompatParcelizer:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 320
    iget-object p0, p0, Landroidx/fragment/app/FragmentContainerView;->write:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .registers 5

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->write(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 269
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 265
    :cond_f
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "Views added to a FragmentContainerView must be associated with a Fragment. View "

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not associated with a Fragment."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 263
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 6

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v1

    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    iget-object v2, p0, Landroidx/fragment/app/FragmentContainerView;->read:Landroid/view/View$OnApplyWindowInsetsListener;

    if-eqz v2, :cond_23

    .line 203
    sget-object v1, Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;->INSTANCE:Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;

    iget-object v2, p0, Landroidx/fragment/app/FragmentContainerView;->read:Landroid/view/View$OnApplyWindowInsetsListener;

    invoke-static {v2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    move-object v3, p0

    check-cast v3, Landroid/view/View;

    invoke-virtual {v1, v2, v3, p1}, Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    .line 202
    invoke-static {v1}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v1

    goto :goto_2a

    .line 206
    :cond_23
    move-object v2, p0

    check-cast v2, Landroid/view/View;

    invoke-static {v2, v1}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v1

    .line 201
    :goto_2a
    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    invoke-virtual {v1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatSearchResultReceiver()Z

    move-result v0

    if-nez v0, :cond_44

    .line 209
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_38
    if-ge v2, v0, :cond_44

    .line 210
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v1}, Lo/InvalidTypeIdException;->write(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    add-int/lit8 v2, v2, 0x1

    goto :goto_38

    :cond_44
    return-object p1
.end method

.method protected final dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 6

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    iget-boolean v0, p0, Landroidx/fragment/app/FragmentContainerView;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_25

    .line 218
    iget-object v0, p0, Landroidx/fragment/app/FragmentContainerView;->write:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 358
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 219
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v2

    invoke-super {p0, p1, v1, v2, v3}, Landroid/widget/FrameLayout;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    goto :goto_11

    .line 222
    :cond_25
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .registers 6

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    iget-boolean v0, p0, Landroidx/fragment/app/FragmentContainerView;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_20

    iget-object v0, p0, Landroidx/fragment/app/FragmentContainerView;->write:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    .line 228
    iget-object v0, p0, Landroidx/fragment/app/FragmentContainerView;->write:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    const/4 p0, 0x0

    return p0

    .line 232
    :cond_20
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p0

    return p0
.end method

.method public final endViewTransition(Landroid/view/View;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    iget-object v0, p0, Landroidx/fragment/app/FragmentContainerView;->AudioAttributesCompatParcelizer:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 244
    iget-object v0, p0, Landroidx/fragment/app/FragmentContainerView;->write:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    .line 245
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentContainerView;->RemoteActionCompatParcelizer:Z

    .line 247
    :cond_15
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->endViewTransition(Landroid/view/View;)V

    return-void
.end method

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 2

    .line 360
    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final removeAllViewsInLayout()V
    .registers 4

    .line 305
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_17

    .line 306
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 307
    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Landroidx/fragment/app/FragmentContainerView;->read(Landroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    .line 309
    :cond_17
    invoke-super {p0}, Landroid/widget/FrameLayout;->removeAllViewsInLayout()V

    return-void
.end method

.method public final removeView(Landroid/view/View;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentContainerView;->read(Landroid/view/View;)V

    .line 285
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final removeViewAt(I)V
    .registers 4

    .line 273
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 274
    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentContainerView;->read(Landroid/view/View;)V

    .line 275
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->removeViewAt(I)V

    return-void
.end method

.method public final removeViewInLayout(Landroid/view/View;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    invoke-direct {p0, p1}, Landroidx/fragment/app/FragmentContainerView;->read(Landroid/view/View;)V

    .line 280
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method public final removeViews(II)V
    .registers 6

    move v0, p1

    :goto_1
    add-int v1, p1, p2

    if-ge v0, v1, :cond_14

    .line 290
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 291
    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Landroidx/fragment/app/FragmentContainerView;->read(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 293
    :cond_14
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->removeViews(II)V

    return-void
.end method

.method public final removeViewsInLayout(II)V
    .registers 6

    move v0, p1

    :goto_1
    add-int v1, p1, p2

    if-ge v0, v1, :cond_14

    .line 298
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 299
    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Landroidx/fragment/app/FragmentContainerView;->read(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 301
    :cond_14
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->removeViewsInLayout(II)V

    return-void
.end method

.method public final setDrawDisappearingViewsLast(Z)V
    .registers 2

    .line 253
    iput-boolean p1, p0, Landroidx/fragment/app/FragmentContainerView;->RemoteActionCompatParcelizer:Z

    return-void
.end method

.method public final setLayoutTransition(Landroid/animation/LayoutTransition;)V
    .registers 2

    .line 180
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    iput-object p1, p0, Landroidx/fragment/app/FragmentContainerView;->read:Landroid/view/View$OnApplyWindowInsetsListener;

    return-void
.end method

.method public final startViewTransition(Landroid/view/View;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_10

    .line 237
    iget-object v0, p0, Landroidx/fragment/app/FragmentContainerView;->AudioAttributesCompatParcelizer:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 239
    :cond_10
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->startViewTransition(Landroid/view/View;)V

    return-void
.end method

###### Class androidx.fragment.app.FragmentContainerView.IconCompatParcelizer (androidx.fragment.app.FragmentContainerView$IconCompatParcelizer)
.class public final Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentContainerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\n\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Landroid/view/View$OnApplyWindowInsetsListener;",
        "p0",
        "Landroid/view/View;",
        "p1",
        "Landroid/view/WindowInsets;",
        "p2",
        "RemoteActionCompatParcelizer",
        "(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 343
    new-instance v0, Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;

    invoke-direct {v0}, Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;-><init>()V

    sput-object v0, Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;->INSTANCE:Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    .line 336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 4

    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    invoke-interface {p1, p2, p3}, Landroid/view/View$OnApplyWindowInsetsListener;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
