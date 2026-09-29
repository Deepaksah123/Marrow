###### Class androidx.appcompat.widget.AppCompatPopupWindow (androidx.appcompat.widget.AppCompatPopupWindow)
.class Landroidx/appcompat/widget/AppCompatPopupWindow;
.super Landroid/widget/PopupWindow;
.source "SourceFile"


# static fields
.field private static final IconCompatParcelizer:Z = false


# instance fields
.field private write:Z


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/appcompat/widget/AppCompatPopupWindow;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 5

    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 47
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatPopupWindow;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    .line 51
    sget-object v0, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->PopupWindow:[I

    invoke-static {p1, p2, v0, p3, p4}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object p1

    .line 53
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->PopupWindow_overlapAnchor:I

    invoke-virtual {p1, p2}, Lo/setTitle;->AudioAttributesImplApi26Parcelizer(I)Z

    move-result p2

    if-eqz p2, :cond_18

    .line 54
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->PopupWindow_overlapAnchor:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Lo/setTitle;->AudioAttributesCompatParcelizer(IZ)Z

    move-result p2

    invoke-direct {p0, p2}, Landroidx/appcompat/widget/AppCompatPopupWindow;->IconCompatParcelizer(Z)V

    .line 57
    :cond_18
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->PopupWindow_android_popupBackground:I

    invoke-virtual {p1, p2}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    invoke-virtual {p1}, Lo/setTitle;->write()V

    return-void
.end method

.method private IconCompatParcelizer(Z)V
    .registers 3

    .line 90
    sget-boolean v0, Landroidx/appcompat/widget/AppCompatPopupWindow;->IconCompatParcelizer:Z

    if-eqz v0, :cond_7

    .line 91
    iput-boolean p1, p0, Landroidx/appcompat/widget/AppCompatPopupWindow;->write:Z

    return-void

    .line 93
    :cond_7
    invoke-static {p0, p1}, Lo/AnnotatedClassCreators;->read(Landroid/widget/PopupWindow;Z)V

    return-void
.end method


# virtual methods
.method public showAsDropDown(Landroid/view/View;II)V
    .registers 5

    .line 64
    sget-boolean v0, Landroidx/appcompat/widget/AppCompatPopupWindow;->IconCompatParcelizer:Z

    if-eqz v0, :cond_d

    iget-boolean v0, p0, Landroidx/appcompat/widget/AppCompatPopupWindow;->write:Z

    if-eqz v0, :cond_d

    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int/2addr p3, v0

    .line 68
    :cond_d
    invoke-super {p0, p1, p2, p3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    return-void
.end method

.method public showAsDropDown(Landroid/view/View;III)V
    .registers 6

    .line 73
    sget-boolean v0, Landroidx/appcompat/widget/AppCompatPopupWindow;->IconCompatParcelizer:Z

    if-eqz v0, :cond_d

    iget-boolean v0, p0, Landroidx/appcompat/widget/AppCompatPopupWindow;->write:Z

    if-eqz v0, :cond_d

    .line 75
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int/2addr p3, v0

    .line 77
    :cond_d
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    return-void
.end method

.method public update(Landroid/view/View;IIII)V
    .registers 12

    .line 82
    sget-boolean v0, Landroidx/appcompat/widget/AppCompatPopupWindow;->IconCompatParcelizer:Z

    if-eqz v0, :cond_d

    iget-boolean v0, p0, Landroidx/appcompat/widget/AppCompatPopupWindow;->write:Z

    if-eqz v0, :cond_d

    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int/2addr p3, v0

    :cond_d
    move v3, p3

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v4, p4

    move v5, p5

    .line 86
    invoke-super/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    return-void
.end method
