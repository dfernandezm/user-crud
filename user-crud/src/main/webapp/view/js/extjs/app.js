/** 
 * Initial JS stub files to implement the front end with ExtJS 4 MVC approach. Powerful, rich and clean way of implement a 
 * management-like front end with lots of built-in widgets and interactions 
 * 
 * */

Ext.require('Ext.container.Viewport');

Ext.application({
    name: 'UserMgrExt',
    launch: function() {
    	
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    title: 'Basic User Management',
                    html : 'Welcome'
                }
            ]
        });
    }
});