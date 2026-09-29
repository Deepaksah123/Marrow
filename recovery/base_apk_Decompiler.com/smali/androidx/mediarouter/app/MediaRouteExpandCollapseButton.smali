###### Class androidx.mediarouter.app.MediaRouteExpandCollapseButton (androidx.mediarouter.app.MediaRouteExpandCollapseButton)
.class public Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;
.super Landroid/widget/ImageButton;
.source "SourceFile"


# instance fields
.field AudioAttributesCompatParcelizer:Z

.field AudioAttributesImplApi26Parcelizer:Landroid/view/View$OnClickListener;

.field final IconCompatParcelizer:Ljava/lang/String;

.field final RemoteActionCompatParcelizer:Landroid/graphics/drawable/AnimationDrawable;

.field final read:Ljava/lang/String;

.field final write:Landroid/graphics/drawable/AnimationDrawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, v0}, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 47
    invoke-direct {p0, p1, p2, v0}, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 7

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    sget p2, Lo/PrivateMaxEntriesMapNode$read;->mr_group_expand:I

    invoke-static {p1, p2}, Lo/_isNaN;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    check-cast p2, Landroid/graphics/drawable/AnimationDrawable;

    iput-object p2, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/AnimationDrawable;

    .line 54
    sget v0, Lo/PrivateMaxEntriesMapNode$read;->mr_group_collapse:I

    invoke-static {p1, v0}, Lo/_isNaN;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->write:Landroid/graphics/drawable/AnimationDrawable;

    .line 58
    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {p1, p3}, Lo/getAccessible;->RemoteActionCompatParcelizer(Landroid/content/Context;I)I

    move-result p3

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, p3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 60
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 61
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 63
    sget p3, Lo/PrivateMaxEntriesMapNode$MediaBrowserCompatItemReceiver;->mr_controller_expand_group:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->read:Ljava/lang/String;

    .line 64
    sget v0, Lo/PrivateMaxEntriesMapNode$MediaBrowserCompatItemReceiver;->mr_controller_collapse_group:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->IconCompatParcelizer:Ljava/lang/String;

    const/4 p1, 0x0

    .line 66
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 67
    invoke-virtual {p0, p3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 69
    new-instance p1, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;

    invoke-direct {p1, p0}, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;-><init>(Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;)V

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    .line 91
    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->AudioAttributesImplApi26Parcelizer:Landroid/view/View$OnClickListener;

    return-void
.end method

###### Class androidx.mediarouter.app.MediaRouteExpandCollapseButton.AnonymousClass4 (androidx.mediarouter.app.MediaRouteExpandCollapseButton$4)
.class final Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;


# direct methods
.method constructor <init>(Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;)V
    .registers 2

    .line 69
    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    .line 72
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-boolean v1, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->AudioAttributesCompatParcelizer:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->AudioAttributesCompatParcelizer:Z

    .line 73
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-boolean v0, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->AudioAttributesCompatParcelizer:Z

    if-eqz v0, :cond_24

    .line 74
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-object v1, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-object v0, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 76
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-object v1, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_39

    .line 78
    :cond_24
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-object v1, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->write:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 79
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-object v0, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->write:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 80
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-object v1, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->read:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 82
    :goto_39
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-object v0, v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->AudioAttributesImplApi26Parcelizer:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_46

    .line 83
    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton$4;->AudioAttributesCompatParcelizer:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-object p0, p0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->AudioAttributesImplApi26Parcelizer:Landroid/view/View$OnClickListener;

    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_46
    return-void
.end method
